package morevariants.mvariants.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import morevariants.mvariants.MoreVariants;

public class ItemToast extends ItemFood implements ItemModelProvider{

	public ItemToast() {
		super(7, 0.6f, false);
		setUnlocalizedName("toast");
		setRegistryName("toast");
		setCreativeTab(CreativeTabs.FOOD);
	}

	@Override
	public void registerItemModel(Item item) {
		MoreVariants.proxy.registerItemRenderer(this, 0, "toast");
	}
}
