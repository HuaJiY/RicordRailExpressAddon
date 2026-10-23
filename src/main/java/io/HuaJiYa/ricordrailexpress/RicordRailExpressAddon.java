package io.HuaJiYa.ricordrailexpress;

import net.fabricmc.api.ModInitializer;

/** 附属模组入口。具体内容注册按上游公开 API 分批接入。 */
public final class RicordRailExpressAddon implements ModInitializer {
    public static final String MOD_ID = "ricord_rail_express";

    @Override
    public void onInitialize() {
        AddonContent.register();
    }
}
