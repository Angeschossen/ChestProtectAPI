package me.angeschossen.chestprotect.api.protection.group;

import me.angeschossen.chestprotect.api.exceptions.TrustedThroughGroupException;
import me.angeschossen.chestprotect.api.protection.MemberHolder;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.UUID;

public interface Group extends MemberHolder {

    /**
     * Check if the group is the default group.
     * The default group contains all protections that aren't part of another group.
     *
     * @return true, if is default
     */
    boolean isDefault();

    /**
     * Untrust a player that is trusted directly to this protection.
     *
     * @param playerUUID The player to untrust
     */
    void untrustPlayer(@NotNull UUID playerUUID);

    /**
     * Get the name with color. If you want the plain name, use {@link #getName()} instead.
     *
     * @return may include color
     */
    @NotNull String getColorName();

    /**
     * Get the name without color. If you want to name with color, use {@link #getColorName()} instead.
     *
     * @return doesn't include color
     */
    @NotNull String getName();
}
