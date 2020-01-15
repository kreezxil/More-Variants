package com.kreezcraft.morevariantsreloaded;

import com.kreezcraft.morevariantsreloaded.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MoreVariantsTab extends CreativeTabs {

    public MoreVariantsTab(String label) {
        super(MoreVariants.modId);
        setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModBlocks.buttonBrick);
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
