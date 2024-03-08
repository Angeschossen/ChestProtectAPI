package me.angeschossen.chestprotect.api.events.protection;

import me.angeschossen.chestprotect.api.protection.Protection;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class ProtectionCreatedEvent extends ProtectionEvent{
    public static HandlerList handlerList = new HandlerList();

    public ProtectionCreatedEvent(@NotNull Protection protection) {
        super(protection);
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }
}
