package net.foxbatstudios.overworld_revived;

import com.mojang.logging.LogUtils;
import net.foxbatstudios.overworld_revived.block.ModBlocks;
import net.foxbatstudios.overworld_revived.item.ModCreativeModTabs;
import net.foxbatstudios.overworld_revived.item.ModItems;
import net.foxbatstudios.overworld_revived.worldgen.biome.ModTerrablender;
import net.foxbatstudios.overworld_revived.worldgen.biome.surface.ModSurfaceRules;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import terrablender.api.SurfaceRuleManager;

@Mod(Overworld_Revived.MOD_ID)
public class Overworld_Revived {
    public static final String MOD_ID = "overworld_revived";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Overworld_Revived(FMLJavaModLoadingContext context) {

        IEventBus modEventBus = context.getModEventBus();
        ModCreativeModTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        ModTerrablender.registerBiome();

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, ModSurfaceRules.makeRules());

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        {

        }

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
