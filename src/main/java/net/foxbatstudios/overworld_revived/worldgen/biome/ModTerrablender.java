package net.foxbatstudios.overworld_revived.worldgen.biome;

import net.foxbatstudios.overworld_revived.Overworld_Revived;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiome() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(Overworld_Revived.MOD_ID, "overworld"), 15));
    }
}
