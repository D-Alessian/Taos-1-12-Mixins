package be.alessian.taosmixins.config;

import net.minecraftforge.common.config.Config;

import be.alessian.taosmixins.Tags;

@Config(modid = Tags.MODID, name = Tags.MODID, category = "")
public class TaosMixinsConfig {

    @Config.Comment("Server side config")
    @Config.Name("server")
    public static Serverside serverside = new Serverside();

    public static class Serverside {

        @Config.Comment({
                "Enable the discord integration mixin.",
                "This will enable the discord integration mixin, which allow using systemProperty for the bot token.",
                "If you don't know what this is, don't enable it.",
                "[Default: true]"
        })
        @Config.Name("discord integration")
        @Config.RequiresMcRestart
        public static boolean discordIntegration = true;
    }
}
