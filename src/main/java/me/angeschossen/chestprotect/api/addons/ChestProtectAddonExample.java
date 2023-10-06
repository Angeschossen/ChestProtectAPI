package me.angeschossen.chestprotect.api.addons;


import org.bukkit.Location;
import org.bukkit.plugin.Plugin;

/**
 * Use {@link me.angeschossen.chestprotect.api.ChestProtectAPI} instead.
 */
@Deprecated
public class ChestProtectAddonExample {

    private final ChestProtectAddon chestProtectAddon;
    private final String key;

    private ChestProtectAddonExample(Plugin yourPlugin) {

        /*
        Initialize ChestProtectAddon
        Set isPulic to false, if you want
        to prevent that other developers can
        access your addon.
         */
        chestProtectAddon = new ChestProtectAddon(yourPlugin, false);

        /*
        Initialize the addon.
        You need to key to disable your chestProtectAddon, if you ever want to.
         */
        key = chestProtectAddon.initialize();
    }

    /**
     * Check if block is protected.
     *
     * @param location Location
     * @return true, if protected
     */
    public boolean isProtected(Location location) {
        return chestProtectAddon.getProtection(location) != null;
    }

    /**
     * Disable your addon.
     * For example, if plugin disables.
     */
    public void disableChestProtectAddon() {

        /*
        Disable chestProtectAddon if you want.
        You need the received key.
         */
        chestProtectAddon.disable(key);
    }
}
