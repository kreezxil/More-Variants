package morevariants.mvariants.crafting;

import morevariants.mvariants.item.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModFoodRecipies {

	public static void init() {
		GameRegistry.addSmelting(Items.BREAD, new ItemStack(ModItems.toast), 0.7f);
	}
}
