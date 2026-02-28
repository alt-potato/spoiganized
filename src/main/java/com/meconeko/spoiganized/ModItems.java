package com.meconeko.spoiganized;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            Spoiganized.MODID);

    @SuppressWarnings("null")
    public static final RegistryObject<Item> MUSH = ITEMS.register("mush",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .alwaysEat()
                    .nutrition(1)
                    .saturationMod(0.4f)
                    .fast()
                    .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 30 * 20), 0.8F)
                    .build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
