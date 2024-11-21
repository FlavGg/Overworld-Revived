package net.foxbatstudios.overworld_revived.item;

import net.foxbatstudios.overworld_revived.Overworld_Revived;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Overworld_Revived.MOD_ID);

    public static final RegistryObject<CreativeModeTab> OR_TAB = CREATIVE_MODE_TABS.register("or_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OR_LOGO.get()))
                    .title(Component.translatable("creativetab.or_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.REDWOOD_LOG_ITEM.get());
                        output.accept(ModItems.REDWOOD_PLANKS_ITEM.get());
                        output.accept(ModItems.REDWOOD_LEAVES_ITEM.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}