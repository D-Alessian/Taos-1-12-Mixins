package be.alessian.taosmixins.common;

import static be.alessian.taosmixins.config.TaosMixinsConfig.Advanced;

import net.minecraftforge.common.config.*;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import be.alessian.taosmixins.Tags;

@Mod.EventBusSubscriber(modid = Tags.MODID)
public class CommonProxy {

    public static void preInit() {}

    public static void init() {}

    public static void postInit() {}

    @SubscribeEvent
    public static void syncConfigValues(ConfigChangedEvent.OnConfigChangedEvent event) {
        // Print a confirmation message to the terminal
        if (Advanced.activateVerboseLogging) {
            System.out.println("Config changed: " + event.getModID());
        }
        if (event.getModID().equals(Tags.MODID)) {
            ConfigManager.sync(Tags.MODID, Config.Type.INSTANCE);
        }
    }
}
