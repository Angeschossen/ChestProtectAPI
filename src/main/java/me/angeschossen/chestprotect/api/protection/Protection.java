package me.angeschossen.chestprotect.api.protection;

import me.angeschossen.chestprotect.api.exceptions.TrustedThroughGroupException;
import me.angeschossen.chestprotect.api.player.ProtectPlayer;
import me.angeschossen.chestprotect.api.protection.enums.Type;
import me.angeschossen.chestprotect.api.protection.flag.ProtectionFlag;
import me.angeschossen.chestprotect.api.protection.group.Group;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.UUID;

public interface Protection extends Nameable, MemberHolder {

    int getX();

    int getY();

    int getZ();

    Type type();

    /**
     * Get group that this protection belongs to.
     * @return null, if not group set.
     */
    @Nullable Group getGroup();

    /**
     * Delete the protection.
     * @param deleter Player that deletes the protection, will receive an unlock message.
     */
    void delete(@Nullable ProtectPlayer deleter) throws IllegalStateException;

    /**
     * Get players that are trusted directly to this protection and aren't
     * trusted via a group {@link Group}.
     * @return Players directly trusted at this protection
     */
    @NotNull
    Collection<UUID> getTrustedWithoutGroup();

    boolean hasFlag(@NotNull ProtectionFlag setting);

    boolean toggleFlag(@NotNull ProtectionFlag setting);

    /**
     * Untrust a player that is trusted directly to this protection.
     * @param playerUUID The player to untrust
     * @throws TrustedThroughGroupException If the player is trusted through the group {@link Group} and not directly
     */
    void untrustPlayer(@NotNull UUID playerUUID) throws TrustedThroughGroupException;
}
