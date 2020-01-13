package morevariants.mvariants.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import morevariants.mvariants.MoreVariants;
import morevariants.mvariants.block.ModBlocks;

public class MoreVariantsTab extends CreativeTabs{

	public MoreVariantsTab() {
		super(MoreVariants.modId);
		setBackgroundImageName("item_search.png");
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModBlocks.buttonSpruce);
	}
	
	 @Override
	 public boolean hasSearchBar() {
		 return true;
	 }

}