package net.foxbatstudios.overworld_revived.datagen;

import net.foxbatstudios.overworld_revived.Overworld_Revived;
import net.foxbatstudios.overworld_revived.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Overworld_Revived.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.WOODEN_FENCES).add(ModBlocks.REDWOOD_FENCE.get());
        tag(BlockTags.LOGS).add(ModBlocks.REDWOOD_LOG.get());
        tag(BlockTags.PLANKS).add(ModBlocks.REDWOOD_PLANKS.get());
        tag(BlockTags.WOODEN_BUTTONS).add(ModBlocks.REDWOOD_BUTTON.get());
        tag(BlockTags.LEAVES).add(ModBlocks.REDWOOD_LEAVES.get());
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.REDWOOD_PRESSURE_PLATE.get());
        tag(BlockTags.WOODEN_SLABS).add(ModBlocks.REDWOOD_SLABS.get());
        tag(BlockTags.WOODEN_STAIRS).add(ModBlocks.REDWOOD_STAIRS.get());
    }
}
