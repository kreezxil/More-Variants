package com.kreezcraft.morevariantsreloaded.init;

import com.kreezcraft.morevariantsreloaded.block.*;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;


public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //Lever variants
    public static final Block leverMossy = new BlockLeverVariant("leverMossy");

    //Stone pressure plate variants
    public static final Block pressurePlateGranite = new BlockPressurePlateStoneVariant("pressurePlateGranite");
    public static final Block pressurePlateDiorite = new BlockPressurePlateStoneVariant("pressurePlateDiorite");
    public static final Block pressurePlateAndesite = new BlockPressurePlateStoneVariant("pressurePlateAndesite");
    public static final Block pressurePlateBrick = new BlockPressurePlateStoneVariant("pressurePlateBrick");
    public static final Block pressurePlateHardenedClay = new BlockPressurePlateStoneVariant("pressurePlateHardenedClay");
    public static final Block pressurePlateWhiteStainedClay = new BlockPressurePlateStoneVariant("pressurePlateWhiteStainedClay");
    public static final Block pressurePlateOrangeStainedClay = new BlockPressurePlateStoneVariant("pressurePlateOrangeStainedClay");
    public static final Block pressurePlateMagentaStainedClay = new BlockPressurePlateStoneVariant("pressurePlateMagentaStainedClay");
    public static final Block pressurePlateLightBlueStainedClay = new BlockPressurePlateStoneVariant("pressurePlateLightBlueStainedClay");
    public static final Block pressurePlateYellowStainedClay = new BlockPressurePlateStoneVariant("pressurePlateYellowStainedClay");
    public static final Block pressurePlateLimeStainedClay = new BlockPressurePlateStoneVariant("pressurePlateLimeStainedClay");
    public static final Block pressurePlatePinkStainedClay = new BlockPressurePlateStoneVariant("pressurePlatePinkStainedClay");
    public static final Block pressurePlateGrayStainedClay = new BlockPressurePlateStoneVariant("pressurePlateGrayStainedClay");
    public static final Block pressurePlateLightGrayStainedClay = new BlockPressurePlateStoneVariant("pressurePlateLightGrayStainedClay");
    public static final Block pressurePlateCyanStainedClay = new BlockPressurePlateStoneVariant("pressurePlateCyanStainedClay");
    public static final Block pressurePlatePurpleStainedClay = new BlockPressurePlateStoneVariant("pressurePlatePurpleStainedClay");
    public static final Block pressurePlateBlueStainedClay = new BlockPressurePlateStoneVariant("pressurePlateBlueStainedClay");
    public static final Block pressurePlateBrownStainedClay = new BlockPressurePlateStoneVariant("pressurePlateBrownStainedClay");
    public static final Block pressurePlateGreenStainedClay = new BlockPressurePlateStoneVariant("pressurePlateGreenStainedClay");
    public static final Block pressurePlateRedStainedClay = new BlockPressurePlateStoneVariant("pressurePlateRedStainedClay");
    public static final Block pressurePlateBlackStainedClay = new BlockPressurePlateStoneVariant("pressurePlateBlackStainedClay");

    //Wooden pressure plate variants
    public static final Block pressurePlateSpruce = new BlockPressurePlateWoodVariant("pressurePlateSpruce");
    public static final Block pressurePlateBirch = new BlockPressurePlateWoodVariant("pressurePlateBirch");
    public static final Block pressurePlateJungle = new BlockPressurePlateWoodVariant("pressurePlateJungle");
    public static final Block pressurePlateAcacia = new BlockPressurePlateWoodVariant("pressurePlateAcacia");
    public static final Block pressurePlateDarkOak = new BlockPressurePlateWoodVariant("pressurePlateDarkOak");

    //Stone button variants
    public static final Block buttonGranite = new BlockButtonStoneVariant("buttonGranite");
    public static final Block buttonDiorite = new BlockButtonStoneVariant("buttonDiorite");
    public static final Block buttonAndesite = new BlockButtonStoneVariant("buttonAndesite");
    public static final Block buttonBrick = new BlockButtonStoneVariant("buttonBrick");
    public static final Block buttonHardenedClay = new BlockButtonStoneVariant("buttonHardenedClay");
    public static final Block buttonWhiteStainedClay = new BlockButtonStoneVariant("buttonWhiteStainedClay");
    public static final Block buttonOrangeStainedClay = new BlockButtonStoneVariant("buttonOrangeStainedClay");
    public static final Block buttonMagentaStainedClay = new BlockButtonStoneVariant("buttonMagentaStainedClay");
    public static final Block buttonLightBlueStainedClay = new BlockButtonStoneVariant("buttonLightBlueStainedClay");
    public static final Block buttonYellowStainedClay = new BlockButtonStoneVariant("buttonYellowStainedClay");
    public static final Block buttonLimeStainedClay = new BlockButtonStoneVariant("buttonLimeStainedClay");
    public static final Block buttonPinkStainedClay = new BlockButtonStoneVariant("buttonPinkStainedClay");
    public static final Block buttonGrayStainedClay = new BlockButtonStoneVariant("buttonGrayStainedClay");
    public static final Block buttonLightGrayStainedClay = new BlockButtonStoneVariant("buttonLightGrayStainedClay");
    public static final Block buttonCyanStainedClay = new BlockButtonStoneVariant("buttonCyanStainedClay");
    public static final Block buttonPurpleStainedClay = new BlockButtonStoneVariant("buttonPurpleStainedClay");
    public static final Block buttonBlueStainedClay = new BlockButtonStoneVariant("buttonBlueStainedClay");
    public static final Block buttonBrownStainedClay = new BlockButtonStoneVariant("buttonBrownStainedClay");
    public static final Block buttonGreenStainedClay = new BlockButtonStoneVariant("buttonGreenStainedClay");
    public static final Block buttonRedStainedClay = new BlockButtonStoneVariant("buttonRedStainedClay");
    public static final Block buttonBlackStainedClay = new BlockButtonStoneVariant("buttonBlackStainedClay");

    //Wooden button variants
    public static final Block buttonSpruce = new BlockButtonWoodVariant("buttonSpruce");
    public static final Block buttonBirch = new BlockButtonWoodVariant("buttonBirch");
    public static final Block buttonJungle = new BlockButtonWoodVariant("buttonJungle");
    public static final Block buttonAcacia = new BlockButtonWoodVariant("buttonAcacia");
    public static final Block buttonDarkOak = new BlockButtonWoodVariant("buttonDarkOak");

    //Tripwire hook variants
    public static final Block tripwireHookSpruce = new BlockTripWireHookVariant("tripwireHookSpruce");
    public static final Block tripwireHookBirch = new BlockTripWireHookVariant("tripwireHookBirch");
    public static final Block tripwireHookJungle = new BlockTripWireHookVariant("tripwireHookJungle");
    public static final Block tripwireHookAcacia = new BlockTripWireHookVariant("tripwireHookAcacia");
    public static final Block tripwireHookDarkOak = new BlockTripWireHookVariant("tripwireHookDarkOak");

}
