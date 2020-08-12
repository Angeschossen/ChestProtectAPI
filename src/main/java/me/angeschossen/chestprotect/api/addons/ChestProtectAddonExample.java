package me.angeschossen.chestprotect.api.addons;


import org.bukkit.plugin.Plugin;

public class ChestProtectAddonExample {

    private final ChestProtectAddon chestProtectAddon;

    private ChestProtectAddonExample(Plugin yourPlugin) {
        // init
        chestProtectAddon = new ChestProtectAddon(yourPlugin);

        // do stuff
    }
}
