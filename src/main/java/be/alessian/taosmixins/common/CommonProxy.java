package be.alessian.taosmixins.common;

import net.minecraftforge.common.config.*;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import be.alessian.taosmixins.Tags;
import be.alessian.taosmixins.config.TaosMixinsConfig;

@Mod.EventBusSubscriber(modid = Tags.MODID)
public class CommonProxy {

    @SubscribeEvent
    public static void syncConfigValues(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (TaosMixinsConfig.advanced.activateVerboseLogging) {
            System.out.println("Config changed: " + event.getModID());
        }
        if (event.getModID().equals(Tags.MODID)) {
            ConfigManager.sync(Tags.MODID, Config.Type.INSTANCE);
        }
    }
}
