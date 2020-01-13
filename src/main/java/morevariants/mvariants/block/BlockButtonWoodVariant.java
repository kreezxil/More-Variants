package morevariants.mvariants.block;

import morevariants.mvariants.MoreVariants;
import morevariants.mvariants.item.ItemModelProvider;
import net.minecraft.block.BlockButtonWood;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockButtonWoodVariant extends BlockButtonWood implements ItemModelProvider {

	protected String name;
	
	public BlockButtonWoodVariant(String name) {
		super();
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MoreVariants.creativeTab);
		setHardness(0.5f);
	}
	
	@Override
	public void registerItemModel(Item itemBlock) {
		MoreVariants.proxy.registerItemRenderer(itemBlock, 0, name);
		
	}
	
	@Override
	 public BlockButtonWoodVariant setCreativeTab(CreativeTabs tab) {
		 super.setCreativeTab(tab);
		 return this;
	 }
}
