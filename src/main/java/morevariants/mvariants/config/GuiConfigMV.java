package morevariants.mvariants.config;

import morevariants.mvariants.MoreVariants;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.List;

public class GuiConfigMV extends GuiConfig {
	private static final String LANG_PREFIX = MoreVariants.modId + ".category.";

	public GuiConfigMV(GuiScreen parentScreen) {
		super(parentScreen, getConfigElements(), MoreVariants.modId, false, false, "More Variants Config");
	}

	private static List<IConfigElement> getConfigElements() {
		final Configuration configuration = ModConfig.ConfigurationHolder.getConfiguration();

		final ConfigCategory topLevelCategory = configuration.getCategory(Configuration.CATEGORY_GENERAL);
		topLevelCategory.getChildren().forEach(configCategory -> configCategory.setLanguageKey(LANG_PREFIX + configCategory.getName()));

		return new ConfigElement(topLevelCategory).getChildElements();
	}
}

