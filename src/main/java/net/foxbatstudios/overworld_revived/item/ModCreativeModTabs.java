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
                        output.accept(ModItems.REDWOOD_WOOD_ITEM.get());
                        output.accept(ModItems.REDWOOD_PLANKS_ITEM.get());
                        output.accept(ModItems.REDWOOD_SLABS_ITEM.get());
                        output.accept(ModItems.REDWOOD_STAIRS_ITEM.get());
                        output.accept(ModItems.REDWOOD_DOOR_ITEM.get());
                        output.accept(ModItems.REDWOOD_FENCE_ITEM.get());
                        output.accept(ModItems.REDWOOD_FENCE_GATE_ITEM.get());
                        output.accept(ModItems.REDWOOD_PRESSURE_PLATE_ITEM.get());
                        output.accept(ModItems.REDWOOD_BUTTON_ITEM.get());
                        output.accept(ModItems.REDWOOD_LEAVES_ITEM.get());
                        output.accept(ModItems.REDWOOD_SAPLING_ITEM.get());
                        output.accept(ModItems.WESTERN_SWORD_FERN_ITEM.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
