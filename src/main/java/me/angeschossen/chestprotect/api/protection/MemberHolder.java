package me.angeschossen.chestprotect.api.protection;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.UUID;

public interface MemberHolder {

    /**
     * Check if the player is trusted.
     * @param playerUID the player's UUID
     * @return false, if not trusted
     */
    boolean isTrusted(@NotNull UUID playerUID);

    /**
     * Get the owner's UUID
     * @return the owner's UUID
     */
    @NotNull
    UUID getOwner();

    /**
     * Get players that are trusted at this protection.
     * @return Players trusted at this protection
     */
    @NotNull
    Collection<UUID> getTrusted();

    /**
     * Trust a player
     * @param playerUUID the player's UUID to trust
     */
    void trustPlayer(@NotNull UUID playerUUID);
}
