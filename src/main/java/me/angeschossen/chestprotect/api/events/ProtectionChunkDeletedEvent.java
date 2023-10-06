package me.angeschossen.chestprotect.api.events;

import com.github.angeschossen.pluginframework.api.utils.Checks;
import me.angeschossen.chestprotect.api.protection.world.ProtectionChunk;
import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called whenever the last protection of a chunk was deleted.
 */
public class ProtectionChunkDeletedEvent extends Event {
    public static HandlerList handlerList = new HandlerList();

    private final @NotNull ProtectionChunk protectionChunk;

    public ProtectionChunkDeletedEvent(@NotNull ProtectionChunk protectionChunk) {
        super(!Bukkit.isPrimaryThread());

        Checks.requireNonNull(protectionChunk, "chunk");
        this.protectionChunk = protectionChunk;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    /**
     * Get the chunk.
     *
     * @return never null
     */
    @NotNull
    public ProtectionChunk getProtectionChunk() {
        return protectionChunk;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
