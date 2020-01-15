package com.kreezcraft.morevariantsreloaded.block;

import com.kreezcraft.morevariantsreloaded.MoreVariants;
import com.kreezcraft.morevariantsreloaded.client.IHasModel;
import com.kreezcraft.morevariantsreloaded.init.ModBlocks;
import com.kreezcraft.morevariantsreloaded.init.ModItems;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockPressurePlateStoneVariant extends BlockPressurePlate implements IHasModel {

	protected String name;
	
	public BlockPressurePlateStoneVariant(String name) {
		super(Material.ROCK, BlockPressurePlate.Sensitivity.MOBS);
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

	
	@Override
	 public BlockPressurePlateStoneVariant setCreativeTab(CreativeTabs tab) {
		 super.setCreativeTab(tab);
		 return this;
	 }
}
