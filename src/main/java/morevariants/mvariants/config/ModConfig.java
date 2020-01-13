package morevariants.mvariants.config;

import morevariants.mvariants.Logger;
import morevariants.mvariants.MoreVariants;
import morevariants.mvariants.Reflection;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.IConfigElement;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.util.Map;
import java.util.Optional;

@Config(modid = MoreVariants.modId)
public class ModConfig {

	@Config.Comment("If disabled, toast cannot be obtained")
	public static boolean enableToast = true;

	@Mod.EventBusSubscriber
	static class ConfigurationHolder {

		private static final MethodHandle CONFIGS_GETTER = Reflection.findFieldGetter(ConfigManager.class, "CONFIGS");

		private static Configuration configuration;

		static Configuration getConfiguration() {
			if (configuration == null) {
				try {
					final String fileName = MoreVariants.modId + ".cfg";

					@SuppressWarnings("unchecked")
					final Map<String, Configuration> configsMap = (Map<String, Configuration>) CONFIGS_GETTER.invokeExact();

					final Optional<Map.Entry<String, Configuration>> entryOptional = configsMap.entrySet().stream()
							.filter(entry -> fileName.equals(new File(entry.getKey()).getName()))
							.findFirst();

					entryOptional.ifPresent(stringConfigurationEntry -> configuration = stringConfigurationEntry.getValue());
				} catch (Throwable throwable) {
					Logger.error(throwable, "Failed to get Configuration instance");
				}
			}

			return configuration;
		}

		@SubscribeEvent
		public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(MoreVariants.modId)) {
				ConfigManager.load(MoreVariants.modId, Config.Type.INSTANCE);
			}
		}
	}
}