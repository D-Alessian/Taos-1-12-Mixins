package be.alessian.taosmixins.config;

import net.minecraftforge.common.config.Config;

import be.alessian.taosmixins.Tags;

@Config(modid = Tags.MODID)
public class TaosMixinsConfig {

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
        public boolean activateVerboseLogging = true;
    }
}
