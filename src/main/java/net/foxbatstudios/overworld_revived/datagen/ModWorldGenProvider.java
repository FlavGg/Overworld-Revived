package net.foxbatstudios.overworld_revived.datagen;

import net.foxbatstudios.overworld_revived.Overworld_Revived;
import net.foxbatstudios.overworld_revived.worldgen.ModBiomesModifiers;
import net.foxbatstudios.overworld_revived.worldgen.ModConfiguredFeatures;
import net.foxbatstudios.overworld_revived.worldgen.ModPlacedFeatures;
import net.foxbatstudios.overworld_revived.worldgen.biome.ModBiomes;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomesModifiers::bootstrap)
            .add(Registries.BIOME, ModBiomes::boostrap);

    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Overworld_Revived.MOD_ID));
    }

}