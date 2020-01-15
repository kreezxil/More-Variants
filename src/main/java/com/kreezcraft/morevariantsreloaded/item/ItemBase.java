package com.kreezcraft.morevariantsreloaded.item;

import com.kreezcraft.morevariantsreloaded.MoreVariants;
import com.kreezcraft.morevariantsreloaded.client.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	protected String name;
	 
	 public ItemBase(String name) {
	 this.name = name;
	 setUnlocalizedName(name);
	 setRegistryName(name);
	 //setCreativeTab(MoreVariants.creativeTab);
	 }

	@Override
	public void registerModels() {
		MoreVariants.proxy.registerItemRenderer(this, 0, "inventory");
	}

	@Override
	 public ItemBase setCreativeTab(CreativeTabs tab) {
	 super.setCreativeTab(tab);
	 return this;
	 }


}
