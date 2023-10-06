package me.angeschossen.chestprotect.api.protection;

import me.angeschossen.chestprotect.api.exceptions.TrustedThroughGroupException;
import me.angeschossen.chestprotect.api.protection.group.Group;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.UUID;

public interface MemberHolder {

    boolean isTrusted(@NotNull UUID playerUID);

    @NotNull
    UUID getOwner();

    /**
     * Get players that are trusted at this protection directly or
     * via a group {@link Group}.
     * @return Players trusted at this protection
     */
    @NotNull
    Collection<UUID> getTrusted();

    /**
     * Trust a player.
     * @param playerUUID The player to trust
     */
    void trustPlayer(@NotNull UUID playerUUID);
}
