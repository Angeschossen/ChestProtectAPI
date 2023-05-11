package me.angeschossen.chestprotect.api.events;

import me.angeschossen.chestprotect.api.protection.world.ProtectionChunk;
import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ProtectionChunkAddedEvent extends Event {
    public static HandlerList handlerList = new HandlerList();

    private ProtectionChunk protectionChunk;

    public ProtectionChunkAddedEvent(ProtectionChunk protectionChunk) {
        super(!Bukkit.isPrimaryThread());

        this.protectionChunk = protectionChunk;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    public ProtectionChunk getProtectionChunk() {
        return protectionChunk;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
