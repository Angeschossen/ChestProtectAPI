package me.angeschossen.chestprotect.api.protection.hook;

import me.angeschossen.chestprotect.api.handler.APIHandler;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.sql.Timestamp;
import java.util.function.Function;

public interface ProtectionHook {

    @NotNull Timestamp getTime();

    @NotNull Plugin getPlugin();

    int getId();

    boolean hasItem(@NotNull ItemStack itemStack);

    static ProtectionHook register(@NotNull Plugin plugin, @Nullable Function<ItemStack, Boolean> hasItem) {
        return APIHandler.getInstance().getFactory().createProtectionHook(plugin, hasItem);
    }
}
