package me.angeschossen.chestprotect.api.player;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * Represents players currently connected to your server.
 */
public interface ProtectPlayer extends ProtectOfflinePlayer {

    /**
     * Get the Bukkit player
     *
     * @return Bukkit player object
     */
    @NotNull
    Player getPlayer();
}
