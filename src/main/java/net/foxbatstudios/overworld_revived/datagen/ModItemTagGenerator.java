package net.foxbatstudios.overworld_revived.datagen;


import net.foxbatstudios.overworld_revived.Overworld_Revived;
import net.foxbatstudios.overworld_revived.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {

    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Overworld_Revived.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.WOODEN_FENCES).add(ModItems.REDWOOD_FENCE_ITEM.get());
        tag(ItemTags.LOGS).add(ModItems.REDWOOD_LOG_ITEM.get());
        tag(ItemTags.PLANKS).add(ModItems.REDWOOD_PLANKS_ITEM.get());
        tag(ItemTags.WOODEN_BUTTONS).add(ModItems.REDWOOD_BUTTON_ITEM.get());
        tag(ItemTags.LEAVES).add(ModItems.REDWOOD_LEAVES_ITEM.get());
        tag(ItemTags.WOODEN_PRESSURE_PLATES).add(ModItems.REDWOOD_PRESSURE_PLATE_ITEM.get());
        tag(ItemTags.WOODEN_STAIRS).add(ModItems.REDWOOD_STAIRS_ITEM.get());
        tag(ItemTags.WOODEN_SLABS).add(ModItems.REDWOOD_SLABS_ITEM.get());
        tag(ItemTags.DOORS).add(ModItems.REDWOOD_DOOR_ITEM.get());
        tag(ItemTags.FENCE_GATES).add(ModItems.REDWOOD_FENCE_GATE_ITEM.get());
    }
}