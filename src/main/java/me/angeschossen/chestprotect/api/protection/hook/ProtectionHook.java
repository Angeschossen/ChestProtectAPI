package me.angeschossen.chestprotect.api.protection.hook;

import me.angeschossen.chestprotect.api.handler.APIHandler;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public interface ProtectionHook {

    @NotNull Plugin getPlugin();

    static ProtectionHook of(@NotNull Plugin plugin) {
        return APIHandler.getInstance().getFactory().createProtectionHook(plugin);
    }
}
