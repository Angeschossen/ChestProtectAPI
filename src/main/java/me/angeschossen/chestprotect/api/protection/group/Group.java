package me.angeschossen.chestprotect.api.protection.group;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.UUID;

public interface Group {
    void trustPlayer(@NotNull UUID uid);

    void untrustPlayer(@NotNull UUID uid);

    boolean isTrusted(@NotNull UUID playerUID);

    @NotNull
    UUID getOwner();

    /**
     * Get players that are trusted to all protections belonging to this group.
     * @return Players trusted to all protections that belong to this group
     */
    @NotNull
    Collection<UUID> getTrusted();
}
