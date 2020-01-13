package morevariants.mvariants;

import morevariants.mvariants.block.ModBlocks;
import morevariants.mvariants.client.MoreVariantsTab;
import morevariants.mvariants.crafting.ModFoodRecipies;
import morevariants.mvariants.crafting.ModRecipes;
import morevariants.mvariants.item.ModItems;
import morevariants.mvariants.proxy.CommonProxy;
import morevariants.mvariants.config.ModConfig;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MoreVariants.modId, name = MoreVariants.name, version = MoreVariants.version, acceptedMinecraftVersions = "[1.10.2]", guiFactory = "morevariants.mvariants.config.GuiConfigFactoryMV")

public class MoreVariants {

	@SidedProxy(serverSide = "morevariants.mvariants.proxy.CommonProxy", clientSide = "morevariants.mvariants.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	public static final String modId = "mvariants";
	public static final String name = "More Variants";
	public static final String version = "1.3.0";
	public static final MoreVariantsTab creativeTab = new MoreVariantsTab();

	
	@Mod.Instance(modId)
	public static MoreVariants instance;
	
	public static Logger logger;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
		if(ModConfig.enableToast == true) {
			ModItems.init();
		}
		ModBlocks.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		RecipeRemover.removeRecipe(Blocks.WOODEN_BUTTON);
		RecipeRemover.removeRecipe(Blocks.WOODEN_PRESSURE_PLATE);
		RecipeRemover.removeRecipe(Blocks.TRIPWIRE_HOOK);
		ModRecipes.init();
		if(ModConfig.enableToast == true) {
			ModFoodRecipies.init();
		}
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
