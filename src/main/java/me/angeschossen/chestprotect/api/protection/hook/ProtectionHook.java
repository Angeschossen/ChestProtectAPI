package me.angeschossen.chestprotect.api.protection.hook;

import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public interface ProtectionHook {

    @NotNull Plugin getPlugin();
}
