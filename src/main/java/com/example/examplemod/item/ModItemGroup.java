package com.example.examplemod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static  final ItemGroup TEST_TAB = new ItemGroup("testtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.TESTITEM.get());
        }
    };
}
