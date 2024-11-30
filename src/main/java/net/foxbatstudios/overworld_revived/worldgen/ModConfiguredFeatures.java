package net.foxbatstudios.overworld_revived.worldgen;

import net.foxbatstudios.overworld_revived.Overworld_Revived;
import net.foxbatstudios.overworld_revived.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.PineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraftforge.registries.DeferredRegister;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> TREES =
            DeferredRegister.create(Registries.CONFIGURED_FEATURE, Overworld_Revived.MOD_ID);

    public static final ResourceKey<ConfiguredFeature<?, ?>> REDWOOD_KEY = registerKey("redwood");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        register(REDWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.REDWOOD_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.REDWOOD_LEAVES.get()),
                new PineFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), ConstantInt.of(3)),
                new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    private static void register(ResourceKey<ConfiguredFeature<?,?>> redwoodKey, Feature<TreeConfiguration> tree, TreeConfiguration build) {
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Overworld_Revived.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
