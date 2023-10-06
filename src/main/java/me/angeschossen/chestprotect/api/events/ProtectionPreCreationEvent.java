package me.angeschossen.chestprotect.api.events;

import com.github.angeschossen.pluginframework.api.utils.Checks;
import me.angeschossen.chestprotect.api.player.ProtectPlayer;
import me.angeschossen.chestprotect.api.protection.enums.Type;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called before the protection is being created.
 */
public class ProtectionPreCreationEvent extends Event implements Cancellable {
    public static HandlerList handlerList = new HandlerList();

    private final @NotNull Location location;
    private final @NotNull ProtectPlayer player;
    private final @NotNull Type protectionType;
    private boolean cancelled = false;

    public ProtectionPreCreationEvent(@NotNull Location location, @NotNull ProtectPlayer player, @NotNull Type protectionType) {
        Checks.requireNonNull(location, "location");
        Checks.requireNonNull(player, "player");
        Checks.requireNonNull(protectionType, "type");

        this.location = location;
        this.player = player;
        this.protectionType = protectionType;
    }

    /**
     * Get the player.
     * @return player that is creating the protection
     */
    @NotNull
    public ProtectPlayer getPlayer() {
        return player;
    }

    /**
     * Get the location of the protection.
     * @return location of the protection
     */
    @NotNull
    public Location getLocation() {
        return location;
    }

    /**
     * Get the type.
     * @return type of the protection
     */
    @NotNull
    public Type getProtectionType() {
        return protectionType;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }
}
