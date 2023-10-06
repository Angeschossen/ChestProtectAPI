package me.angeschossen.chestprotect.api.events;

import com.github.angeschossen.pluginframework.api.utils.Checks;
import me.angeschossen.chestprotect.api.player.ProtectPlayer;
import me.angeschossen.chestprotect.api.protection.block.BlockProtection;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called whenever a player opens a protection. For example a door, chest and so on.
 */
public class PlayerOpenProtectionEvent extends Event implements Cancellable {

    private final @NotNull ProtectPlayer player;
    private final @NotNull BlockProtection blockProtection;

    public static HandlerList handlerList = new HandlerList();
    private boolean cancelled = false;

    /**
     * Create an instance of this event.
     * @param player the player that opens the protection
     * @param blockProtection the protection that is being opened
     */
    public PlayerOpenProtectionEvent(@NotNull ProtectPlayer player, @NotNull BlockProtection blockProtection) {
        Checks.requireNonNull(player, "player");
        Checks.requireNonNull(blockProtection, "blockProtection");

        this.player = player;
        this.blockProtection = blockProtection;
    }

    /**
     * Get the player.
     * @return player that opens the protection
     */
    @NotNull
    public ProtectPlayer getPlayer() {
        return player;
    }

    /**
     * Get the protection.
     * @return protection that is being opened
     */
    @NotNull
    public BlockProtection getProtection() {
        return blockProtection;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    @Deprecated
    public void setCancelled(boolean b) {
        cancelled = b;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }
}
