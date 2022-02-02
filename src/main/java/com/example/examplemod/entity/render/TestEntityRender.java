package com.example.examplemod.entity.render;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.entity.custom.TestEntity;
import com.example.examplemod.entity.model.TestEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class TestEntityRender extends MobRenderer<TestEntity, TestEntityModel<TestEntity>> {



    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ExampleMod.MOD_ID, "textures/entity/test_entity.png");

    public TestEntityRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new TestEntityModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getTextureLocation(TestEntity entity) {
        return TEXTURE;
    }

}
