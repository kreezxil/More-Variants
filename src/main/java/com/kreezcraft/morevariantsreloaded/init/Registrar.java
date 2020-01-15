package com.kreezcraft.morevariantsreloaded.init;

import com.kreezcraft.morevariantsreloaded.client.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class Registrar {

    @SubscribeEvent
    public static void onItemRegister(Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent e) {
        for (Item i : ModItems.ITEMS) {
            if (i instanceof IHasModel)
                ((IHasModel) i).registerModels();
        }
        for (Block b : ModBlocks.BLOCKS) {
            if (b instanceof IHasModel)
                ((IHasModel) b).registerModels();
        }
    }

}