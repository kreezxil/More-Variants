package morevariants.mvariants.crafting;

import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockStone;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import morevariants.mvariants.block.ModBlocks;
import morevariants.mvariants.item.ModItems;

public class ModRecipes {

	public static void init() {
	
	//Lever Variants
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.leverMossy),"S", "M", 'S', Items.STICK, 'M', Blocks.MOSSY_COBBLESTONE);
	
	//Stone pressure plate variants
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateGranite), "SS", 'S', new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.GRANITE.getMetadata()));	
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateDiorite), "SS", 'S', new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.DIORITE.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateAndesite), "SS", 'S', new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.ANDESITE.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateBrick), "BB", 'B', Blocks.BRICK_BLOCK);
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateHardenedClay), "CC", 'C', Blocks.HARDENED_CLAY);
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateWhiteStainedClay), "CC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 0));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateOrangeStainedClay), "CC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 1));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateMagentaStainedClay), "CC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 2));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateLightBlueStainedClay), "CC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 3));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateYellowStainedClay), "CC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 4));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateLimeStainedClay), "CC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 5));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlatePinkStainedClay), "CC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 6));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateGrayStainedClay), "CC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 7));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateLightGrayStainedClay), "CC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 8));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateCyanStainedClay), "CC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 9));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlatePurpleStainedClay), "CC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 10));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateBlueStainedClay), "CC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 11));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateBrownStainedClay), "CC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 12));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateGreenStainedClay), "CC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 13));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateRedStainedClay), "CC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 14));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateBlackStainedClay), "CC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15));
	
	//Wooden pressure plate and variants
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOODEN_PRESSURE_PLATE), "PP", 'P', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.OAK.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateSpruce), "PP", 'P', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.SPRUCE.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateBirch), "PP", 'P', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.BIRCH.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateJungle), "PP", 'P', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.JUNGLE.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateAcacia), "PP", 'P', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.ACACIA.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePlateDarkOak), "PP", 'P', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.DARK_OAK.getMetadata()));
	
	//Stone button variants
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonGranite), "S", 'S', new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.GRANITE.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonDiorite), "S", 'S', new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.DIORITE.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonAndesite), "S", 'S', new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.ANDESITE.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonBrick), "B", 'B', Blocks.BRICK_BLOCK);
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonHardenedClay), "C", 'C', Blocks.HARDENED_CLAY);
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonWhiteStainedClay), "C", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 0));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonOrangeStainedClay), "C", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 1));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonMagentaStainedClay), "C", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 2));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonLightBlueStainedClay), "C", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 3));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonYellowStainedClay), "C", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 4));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonLimeStainedClay), "C", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 5));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonPinkStainedClay), "C", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 6));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonGrayStainedClay), "C", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 7));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonLightGrayStainedClay), "C", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 8));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonCyanStainedClay), "C", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 9));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonPurpleStainedClay), "C", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 10));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonBlueStainedClay), "C", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 11));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonBrownStainedClay), "C", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 12));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonGreenStainedClay), "C", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 13));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonRedStainedClay), "C", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 14));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonBlackStainedClay), "C", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15));
	
	//Wooden button and variants
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOODEN_BUTTON), "P", 'P', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.OAK.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonSpruce), "P", 'P', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.SPRUCE.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonBirch), "P", 'P', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.BIRCH.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonJungle), "P", 'P', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.JUNGLE.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonAcacia), "P", 'P', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.ACACIA.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.buttonDarkOak), "P", 'P', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.DARK_OAK.getMetadata()));
	
	//Tripwire hook variants
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.TRIPWIRE_HOOK), "I", "S", "P", 'I', Items.IRON_INGOT, 'S', Items.STICK, 'P', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.OAK.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tripwireHookSpruce), "I", "S", "P", 'I', Items.IRON_INGOT, 'S', Items.STICK, 'P', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.SPRUCE.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tripwireHookBirch), "I", "S", "P", 'I', Items.IRON_INGOT, 'S', Items.STICK, 'P', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.BIRCH.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tripwireHookJungle), "I", "S", "P", 'I', Items.IRON_INGOT, 'S', Items.STICK, 'P', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.JUNGLE.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tripwireHookAcacia), "I", "S", "P", 'I', Items.IRON_INGOT, 'S', Items.STICK, 'P', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.ACACIA.getMetadata()));
	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tripwireHookDarkOak), "I", "S", "P", 'I', Items.IRON_INGOT, 'S', Items.STICK, 'P', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.DARK_OAK.getMetadata()));
	
	}
}
