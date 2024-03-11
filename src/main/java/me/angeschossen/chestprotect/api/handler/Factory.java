package me.angeschossen.chestprotect.api.handler;

import me.angeschossen.chestprotect.api.protection.hook.ProtectionHook;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;

public interface Factory {
    @NotNull ProtectionHook createProtectionHook(@NotNull Plugin plugin,@Nullable Function<ItemStack, Boolean> hasItem);
}
