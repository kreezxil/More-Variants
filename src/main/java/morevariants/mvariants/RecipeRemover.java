package morevariants.mvariants;

import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class RecipeRemover {

	public static void removeRecipe(Item item)
	{
		List<IRecipe> recipies = CraftingManager.getInstance().getRecipeList();
	
		Iterator<IRecipe> remover = recipies.iterator();
		
		while (remover.hasNext())
		{
			ItemStack itemstack = remover.next().getRecipeOutput();
			
			if(itemstack != null && itemstack.getItem() == item)
			{
				remover.remove();
			}
		}	
	}
	
	public static void removeRecipe(Block block)
	{
		List<IRecipe> recipies = CraftingManager.getInstance().getRecipeList();
	
		Iterator<IRecipe> remover = recipies.iterator();
		
		while (remover.hasNext())
		{
			ItemStack itemstack = remover.next().getRecipeOutput();
			
			if(itemstack != null && itemstack.getItem() == Item.getItemFromBlock(block))
			{
				remover.remove();
			}
		}
	}
}
