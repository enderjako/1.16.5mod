package com.example.examplemod.entity;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.entity.custom.TestEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public  static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, ExampleMod.MOD_ID);


    public static final RegistryObject<EntityType<TestEntity>> TEST_ENTITY =
            ENTITY_TYPES.register("test_entity", () ->
                EntityType.Builder.of(TestEntity::new, EntityClassification.CREATURE).sized(1.0f, 1.0f)
                        .build(new ResourceLocation(ExampleMod.MOD_ID, "test_entity").toString()));





    public static  void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }





}
