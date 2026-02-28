package com.meconeko.spoiganized;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, Spoiganized.MODID);

    public static final RegistryObject<CreativeModeTab> BASE = CREATIVE_MODE_TABS.register("base",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.spoiganized.base"))
                    .withTabsBefore(CreativeModeTabs.FOOD_AND_DRINKS)
                    .icon(() -> ModItems.MUSH.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.MUSH.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
