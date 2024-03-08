package me.angeschossen.chestprotect.api.handler;

import me.angeschossen.chestprotect.api.protection.hook.ProtectionHook;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public interface Factory {
    @NotNull ProtectionHook createProtectionHook(@NotNull Plugin plugin);
}
