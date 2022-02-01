package com.example.examplemod.block;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.item.ModItemGroup;
import com.example.examplemod.item.Moditems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.client.model.obj.MaterialLibrary;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

        public static final DeferredRegister<Block> Block = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);

// item zum Block erzeugen
        private static <T extends Block > RegistryObject < T > registryBlock(String name, Supplier < T > block) {
        RegistryObject<T> toReturn = Block.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
        private static <T extends Block > void registerBlockItem (String name, RegistryObject < T > block){
        Moditems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModItemGroup.TEST_TAB)));
    }
        public static void register (IEventBus eventBus){
        Block.register(eventBus);
    }

    // zu erzeugende Blöcke hir deklariren

    public static  final RegistryObject<Block> TEST_BLOCK = registryBlock("test_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(9F)));
}
