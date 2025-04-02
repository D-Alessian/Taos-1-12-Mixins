package be.alessian.taosmixins.config;

import net.minecraftforge.common.config.Config;

import com.cleanroommc.configanytime.ConfigAnytime;

import be.alessian.taosmixins.Tags;

@SuppressWarnings({ "CanBeFinal", "unused" })
@Config(modid = Tags.MODID, name = Tags.MODID, category = "")
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

    static {
        ConfigAnytime.register(TaosMixinsConfig.class);
    }
}
