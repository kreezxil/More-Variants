package com.kreezcraft.morevariantsreloaded.block;


import com.kreezcraft.morevariantsreloaded.MoreVariants;
import com.kreezcraft.morevariantsreloaded.client.IHasModel;
import com.kreezcraft.morevariantsreloaded.init.ModBlocks;
import com.kreezcraft.morevariantsreloaded.init.ModItems;
import net.minecraft.block.BlockTripWireHook;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockTripWireHookVariant extends BlockTripWireHook implements IHasModel {

	protected String name;
	
	public BlockTripWireHookVariant(String name) {
		super();
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MoreVariants.creativeTab);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));}

	@Override
	public void registerModels() {
		MoreVariants.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	
	 @Override
	 public BlockTripWireHookVariant setCreativeTab(CreativeTabs tab) {
		 super.setCreativeTab(tab);
		 return this;
	 }
}
