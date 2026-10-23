package io.HuaJiYa.ricordrailexpress;

import org.agmas.noellesroles.Noellesroles;

/** 集中管理附属内容的注册顺序，避免给每个内容实例动态挂事件。 */
public final class AddonContent {
    private AddonContent() {
    }

    public static void register() {
        // Keep the existing noellesroles namespace so old worlds and configs keep resolving.
        new Noellesroles().onInitialize();
    }
}
