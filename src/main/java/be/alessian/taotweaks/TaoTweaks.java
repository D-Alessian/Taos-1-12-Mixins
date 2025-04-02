package be.alessian.taotweaks;

import be.alessian.taotweaks.config.TweaksConfig;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Tags.MODID,
     version = Tags.VERSION,
     name = Tags.MODNAME,
     acceptedMinecraftVersions = "[1.12.2]",
     acceptableRemoteVersions = "*",
     serverSideOnly = true)
public class TaoTweaks {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MODID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        if (TweaksConfig.advanced.activateVerboseLogging) {
            LOGGER.info("I am " + Tags.MODNAME + " + at version " + Tags.VERSION);
        }
    }

    @SubscribeEvent
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {}

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {}

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {}

    @EventHandler
    public void init(FMLInitializationEvent event) {}

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {}

    @EventHandler
    public void serverStarting(FMLServerStartingEvent event) {}
}
