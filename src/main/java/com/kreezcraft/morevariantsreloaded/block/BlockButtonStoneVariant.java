package com.kreezcraft.morevariantsreloaded.block;


import com.kreezcraft.morevariantsreloaded.MoreVariants;
import com.kreezcraft.morevariantsreloaded.client.IHasModel;
import com.kreezcraft.morevariantsreloaded.init.ModBlocks;
import com.kreezcraft.morevariantsreloaded.init.ModItems;
import net.minecraft.block.BlockButtonStone;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import javax.annotation.Nullable;

public class BlockButtonStoneVariant extends BlockButtonStone implements IHasModel {

	protected String name;
	
	public BlockButtonStoneVariant(String name) {
		super();
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MoreVariants.creativeTab);
		setHardness(0.5f);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));	}

	@Override
	public void registerModels() {
		MoreVariants.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	@Nullable
	@Override
	public String getHarvestTool(final IBlockState state) {
		return super.getHarvestTool(state);
	}

	@Override
	public boolean isToolEffective(final String type, final IBlockState state) {
		return super.isToolEffective(type, state);
	}

}
