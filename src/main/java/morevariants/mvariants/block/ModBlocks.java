package morevariants.mvariants.block;

import morevariants.mvariants.item.ItemModelProvider;
import morevariants.mvariants.item.ItemOreDict;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockDirectional;
public class ModBlocks {

	 //Lever Variants
	 public static BlockLeverVariant leverMossy;
	 
	 //Stone pressure plate variants
	 public static BlockPressurePlateStoneVariant pressurePlateGranite;
	 public static BlockPressurePlateStoneVariant pressurePlateDiorite;
	 public static BlockPressurePlateStoneVariant pressurePlateAndesite;
	 public static BlockPressurePlateStoneVariant pressurePlateBrick;
	 public static BlockPressurePlateStoneVariant pressurePlateHardenedClay;
	 public static BlockPressurePlateStoneVariant pressurePlateWhiteStainedClay;
	 public static BlockPressurePlateStoneVariant pressurePlateOrangeStainedClay;
	 public static BlockPressurePlateStoneVariant pressurePlateMagentaStainedClay;
	 public static BlockPressurePlateStoneVariant pressurePlateLightBlueStainedClay;
	 public static BlockPressurePlateStoneVariant pressurePlateYellowStainedClay;
	 public static BlockPressurePlateStoneVariant pressurePlateLimeStainedClay;
	 public static BlockPressurePlateStoneVariant pressurePlatePinkStainedClay;
	 public static BlockPressurePlateStoneVariant pressurePlateGrayStainedClay;
	 public static BlockPressurePlateStoneVariant pressurePlateLightGrayStainedClay;
	 public static BlockPressurePlateStoneVariant pressurePlateCyanStainedClay;
	 public static BlockPressurePlateStoneVariant pressurePlatePurpleStainedClay;
	 public static BlockPressurePlateStoneVariant pressurePlateBlueStainedClay;
	 public static BlockPressurePlateStoneVariant pressurePlateBrownStainedClay;
	 public static BlockPressurePlateStoneVariant pressurePlateGreenStainedClay;
	 public static BlockPressurePlateStoneVariant pressurePlateRedStainedClay;
	 public static BlockPressurePlateStoneVariant pressurePlateBlackStainedClay;
	 
	 //Wooden pressure plate variants
	 public static BlockPressurePlateWoodVariant pressurePlateSpruce;
	 public static BlockPressurePlateWoodVariant pressurePlateBirch;
	 public static BlockPressurePlateWoodVariant pressurePlateJungle;
	 public static BlockPressurePlateWoodVariant pressurePlateAcacia;
	 public static BlockPressurePlateWoodVariant pressurePlateDarkOak;
	 
	 //Stone button variants
	 public static BlockButtonStoneVariant buttonGranite;
	 public static BlockButtonStoneVariant buttonDiorite;
	 public static BlockButtonStoneVariant buttonAndesite;
	 public static BlockButtonStoneVariant buttonBrick;
	 public static BlockButtonStoneVariant buttonHardenedClay;
	 public static BlockButtonStoneVariant buttonWhiteStainedClay;
	 public static BlockButtonStoneVariant buttonOrangeStainedClay;
	 public static BlockButtonStoneVariant buttonMagentaStainedClay;
	 public static BlockButtonStoneVariant buttonLightBlueStainedClay;
	 public static BlockButtonStoneVariant buttonYellowStainedClay;
	 public static BlockButtonStoneVariant buttonLimeStainedClay;
	 public static BlockButtonStoneVariant buttonPinkStainedClay;
	 public static BlockButtonStoneVariant buttonGrayStainedClay;
	 public static BlockButtonStoneVariant buttonLightGrayStainedClay;
	 public static BlockButtonStoneVariant buttonCyanStainedClay;
	 public static BlockButtonStoneVariant buttonPurpleStainedClay;
	 public static BlockButtonStoneVariant buttonBlueStainedClay;
	 public static BlockButtonStoneVariant buttonBrownStainedClay;
	 public static BlockButtonStoneVariant buttonGreenStainedClay;
	 public static BlockButtonStoneVariant buttonRedStainedClay;
	 public static BlockButtonStoneVariant buttonBlackStainedClay;
		
	 //Wooden button variants
	 public static BlockButtonWoodVariant buttonSpruce; 
	 public static BlockButtonWoodVariant buttonBirch;
	 public static BlockButtonWoodVariant buttonJungle;
	 public static BlockButtonWoodVariant buttonAcacia;
	 public static BlockButtonWoodVariant buttonDarkOak;
	 
	 //Tripwire hook variants
	 public static BlockTripWireHookVariant tripwireHookSpruce; 
	 public static BlockTripWireHookVariant tripwireHookBirch;
	 public static BlockTripWireHookVariant tripwireHookJungle;
	 public static BlockTripWireHookVariant tripwireHookAcacia;
	 public static BlockTripWireHookVariant tripwireHookDarkOak;
	 
	 public static void init() {
		 
		 //Lever variants
		 leverMossy = register(new BlockLeverVariant("leverMossy"));
		 
		 //Stone pressure plate variants
		 pressurePlateGranite = register(new BlockPressurePlateStoneVariant("pressurePlateGranite"));
		 pressurePlateDiorite = register(new BlockPressurePlateStoneVariant("pressurePlateDiorite"));
		 pressurePlateAndesite = register(new BlockPressurePlateStoneVariant("pressurePlateAndesite"));
		 pressurePlateBrick = register(new BlockPressurePlateStoneVariant("pressurePlateBrick"));
		 pressurePlateHardenedClay = register(new BlockPressurePlateStoneVariant("pressurePlateHardenedClay"));
		 pressurePlateWhiteStainedClay = register(new BlockPressurePlateStoneVariant("pressurePlateWhiteStainedClay"));
		 pressurePlateOrangeStainedClay = register(new BlockPressurePlateStoneVariant("pressurePlateOrangeStainedClay"));
		 pressurePlateMagentaStainedClay = register(new BlockPressurePlateStoneVariant("pressurePlateMagentaStainedClay"));
		 pressurePlateLightBlueStainedClay = register(new BlockPressurePlateStoneVariant("pressurePlateLightBlueStainedClay"));
		 pressurePlateYellowStainedClay = register(new BlockPressurePlateStoneVariant("pressurePlateYellowStainedClay"));
		 pressurePlateLimeStainedClay = register(new BlockPressurePlateStoneVariant("pressurePlateLimeStainedClay"));
		 pressurePlatePinkStainedClay = register(new BlockPressurePlateStoneVariant("pressurePlatePinkStainedClay"));
		 pressurePlateGrayStainedClay = register(new BlockPressurePlateStoneVariant("pressurePlateGrayStainedClay"));
		 pressurePlateLightGrayStainedClay = register(new BlockPressurePlateStoneVariant("pressurePlateLightGrayStainedClay"));
		 pressurePlateCyanStainedClay = register(new BlockPressurePlateStoneVariant("pressurePlateCyanStainedClay"));
		 pressurePlatePurpleStainedClay = register(new BlockPressurePlateStoneVariant("pressurePlatePurpleStainedClay"));
		 pressurePlateBlueStainedClay = register(new BlockPressurePlateStoneVariant("pressurePlateBlueStainedClay"));
		 pressurePlateBrownStainedClay = register(new BlockPressurePlateStoneVariant("pressurePlateBrownStainedClay"));
		 pressurePlateGreenStainedClay = register(new BlockPressurePlateStoneVariant("pressurePlateGreenStainedClay"));
		 pressurePlateRedStainedClay = register(new BlockPressurePlateStoneVariant("pressurePlateRedStainedClay"));
		 pressurePlateBlackStainedClay = register(new BlockPressurePlateStoneVariant("pressurePlateBlackStainedClay"));
		 
		 //Wooden pressure plate variants
		 pressurePlateSpruce = register(new BlockPressurePlateWoodVariant("pressurePlateSpruce"));
		 pressurePlateBirch = register(new BlockPressurePlateWoodVariant("pressurePlateBirch"));
		 pressurePlateJungle = register(new BlockPressurePlateWoodVariant("pressurePlateJungle"));
		 pressurePlateAcacia = register(new BlockPressurePlateWoodVariant("pressurePlateAcacia"));
		 pressurePlateDarkOak = register(new BlockPressurePlateWoodVariant("pressurePlateDarkOak"));
		
		 //Stone button variants
		 buttonGranite = register(new BlockButtonStoneVariant("buttonGranite"));
		 buttonDiorite = register(new BlockButtonStoneVariant("buttonDiorite"));
		 buttonAndesite = register(new BlockButtonStoneVariant("buttonAndesite"));
		 buttonBrick = register(new BlockButtonStoneVariant("buttonBrick"));
		 buttonHardenedClay = register(new BlockButtonStoneVariant("buttonHardenedClay"));
		 buttonWhiteStainedClay = register(new BlockButtonStoneVariant("buttonWhiteStainedClay"));
		 buttonOrangeStainedClay = register(new BlockButtonStoneVariant("buttonOrangeStainedClay"));
		 buttonMagentaStainedClay = register(new BlockButtonStoneVariant("buttonMagentaStainedClay"));
		 buttonLightBlueStainedClay = register(new BlockButtonStoneVariant("buttonLightBlueStainedClay"));
		 buttonYellowStainedClay = register(new BlockButtonStoneVariant("buttonYellowStainedClay"));
		 buttonLimeStainedClay = register(new BlockButtonStoneVariant("buttonLimeStainedClay"));
		 buttonPinkStainedClay = register(new BlockButtonStoneVariant("buttonPinkStainedClay"));
		 buttonGrayStainedClay = register(new BlockButtonStoneVariant("buttonGrayStainedClay"));
		 buttonLightGrayStainedClay = register(new BlockButtonStoneVariant("buttonLightGrayStainedClay"));
		 buttonCyanStainedClay = register(new BlockButtonStoneVariant("buttonCyanStainedClay"));
		 buttonPurpleStainedClay = register(new BlockButtonStoneVariant("buttonPurpleStainedClay"));
		 buttonBlueStainedClay = register(new BlockButtonStoneVariant("buttonBlueStainedClay"));
		 buttonBrownStainedClay = register(new BlockButtonStoneVariant("buttonBrownStainedClay"));
		 buttonGreenStainedClay = register(new BlockButtonStoneVariant("buttonGreenStainedClay"));
		 buttonRedStainedClay = register(new BlockButtonStoneVariant("buttonRedStainedClay"));
		 buttonBlackStainedClay = register(new BlockButtonStoneVariant("buttonBlackStainedClay"));
		 
		 //Wooden button variants
		 buttonSpruce = register(new BlockButtonWoodVariant("buttonSpruce"));
		 buttonBirch = register(new BlockButtonWoodVariant("buttonBirch"));
		 buttonJungle = register(new BlockButtonWoodVariant("buttonJungle"));
		 buttonAcacia = register(new BlockButtonWoodVariant("buttonAcacia"));
		 buttonDarkOak = register(new BlockButtonWoodVariant("buttonDarkOak"));
		 
		 //Tripwire hook variants
		 tripwireHookSpruce = register(new BlockTripWireHookVariant("tripwireHookSpruce"));
		 tripwireHookBirch = register(new BlockTripWireHookVariant("tripwireHookBirch"));
		 tripwireHookJungle = register(new BlockTripWireHookVariant("tripwireHookJungle"));
		 tripwireHookAcacia = register(new BlockTripWireHookVariant("tripwireHookAcacia"));
		 tripwireHookDarkOak = register(new BlockTripWireHookVariant("tripwireHookDarkOak"));
		 
	 }
	 
	 private static <T extends Block> T register (T block, ItemBlock itemBlock) {
	 
	 GameRegistry.register(block);
	 if(itemBlock != null) {
	 GameRegistry.register(itemBlock);
	 }
	 
	 if(block instanceof ItemModelProvider) {
	 ((ItemModelProvider)block).registerItemModel(itemBlock);
	 }
	 
	 if (block instanceof ItemOreDict) {
			((ItemOreDict)block).initOreDict();
		}
		
	 if (itemBlock instanceof ItemOreDict) {
			((ItemOreDict)itemBlock).initOreDict();
		}

	 return block;
	 }
	 
	 private static <T extends Block> T register(T block) {
	 ItemBlock itemBlock = new ItemBlock(block);
	 itemBlock.setRegistryName(block.getRegistryName());
	 return register(block, itemBlock);
	 }

}
