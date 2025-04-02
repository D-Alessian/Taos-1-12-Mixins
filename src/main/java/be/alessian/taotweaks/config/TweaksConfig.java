package be.alessian.taotweaks.config;

import net.minecraftforge.common.config.Config;

import be.alessian.taotweaks.Tags;

@Config(modid = Tags.MODID)
public class TweaksConfig {

    @Config.Comment("Advanced configs")
    @Config.Name("advanced")
    public static Advanced advanced = new Advanced();

    public static class Advanced {

        @Config.Comment({
                "Activate verbose logging.",
                "This will enable verbose logging for the mod.",
                "This is useful for debugging and development.",
                "[Default: false]"
        })
        @Config.Name("activateVerboseLogging")
        @Config.RequiresMcRestart
        public boolean activateVerboseLogging = false;
    }
}
