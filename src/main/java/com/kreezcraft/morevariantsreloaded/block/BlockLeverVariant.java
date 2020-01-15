package com.kreezcraft.morevariantsreloaded.block;

import com.kreezcraft.morevariantsreloaded.MoreVariants;
import com.kreezcraft.morevariantsreloaded.client.IHasModel;
import com.kreezcraft.morevariantsreloaded.init.ModBlocks;
import com.kreezcraft.morevariantsreloaded.init.ModItems;
import net.minecraft.block.BlockLever;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockLeverVariant extends BlockLever implements IHasModel {

	protected String name;
	
	public BlockLeverVariant(String name) {
		super();
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MoreVariants.creativeTab);
		setHardness(0.5f);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));	}
	

	
	 @Override
	 public BlockLeverVariant setCreativeTab(CreativeTabs tab) {
		 super.setCreativeTab(tab);
		 return this;
	 }

	@Override
	public void registerModels() {
		MoreVariants.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
