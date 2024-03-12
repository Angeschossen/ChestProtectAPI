package me.angeschossen.chestprotect.api.handler;

import me.angeschossen.chestprotect.api.protection.hook.ProtectionHook;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Factory {
    @NotNull ProtectionHook.Data getProtectionHookData(@NotNull Plugin plugin);

    @Nullable
    ProtectionHook getProtectionHookById(@NotNull String id);

    void registerProtectionHook(@NotNull ProtectionHook protectionHook);
}
