package net.foxbatstudios.overworld_revived.item;

import net.foxbatstudios.overworld_revived.Overworld_Revived;
import net.foxbatstudios.overworld_revived.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item>ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Overworld_Revived.MOD_ID);

    public static final RegistryObject<Item> OR_LOGO = ITEMS.register("or_logo",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<BlockItem> REDWOOD_LOG_ITEM = ITEMS.register("redwood_log_item",
            () -> new BlockItem(ModBlocks.REDWOOD_LOG.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> REDWOOD_PLANKS_ITEM = ITEMS.register("redwood_planks_item",
            () -> new BlockItem(ModBlocks.REDWOOD_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> REDWOOD_LEAVES_ITEM = ITEMS.register("redwood_leaves_item",
            () -> new BlockItem(ModBlocks.REDWOOD_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> REDWOOD_WOOD_ITEM = ITEMS.register("redwood_wood_item",
            () -> new BlockItem(ModBlocks.REDWOOD_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> REDWOOD_SLABS_ITEM = ITEMS.register("redwood_slabs_item",
            () -> new BlockItem(ModBlocks.REDWOOD_SLABS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> REDWOOD_STAIRS_ITEM = ITEMS.register("redwood_stairs_item",
            () -> new BlockItem(ModBlocks.REDWOOD_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> REDWOOD_BUTTON_ITEM = ITEMS.register("redwood_button_item",
            () -> new BlockItem(ModBlocks.REDWOOD_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> REDWOOD_PRESSURE_PLATE_ITEM = ITEMS.register("redwood_pressure_plate_item",
            () -> new BlockItem(ModBlocks.REDWOOD_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> REDWOOD_FENCE_ITEM = ITEMS.register("redwood_fence_item",
            () -> new BlockItem(ModBlocks.REDWOOD_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> REDWOOD_DOOR_ITEM = ITEMS.register("redwood_door_item",
            () -> new BlockItem(ModBlocks.REDWOOD_DOOR.get(), new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
