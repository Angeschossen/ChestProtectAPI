package me.angeschossen.chestprotect.api.player;

import com.github.angeschossen.pluginframework.api.trusted.group.Group;
import me.angeschossen.chestprotect.api.player.flag.PlayerFlag;
import me.angeschossen.chestprotect.api.protection.block.BlockProtectionInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface ProtectOfflinePlayer {
    /**
     * Get the player's identification
     *
     * @return UUID of the player
     */
    @NotNull
    UUID getUID();

    /**
     * Get a group by its name.
     *
     * @param plainName name without color
     * @return null, if the player has no group with that name
     */
    @Nullable Group getGroup(@NotNull String plainName);

    /**
     * Get the default group.
     *
     * @return New protections will belong to this group, if their block type isn't part of any group yet.
     */
    @NotNull Group getDefaultGroup();

    /**
     * Check if a player has a specific flag set.
     *
     * @param flag the flag
     * @return true, if flag is set
     */
    boolean hasFlag(@NotNull PlayerFlag flag);

    /**
     * Toggle a flag for the player.
     *
     * @param flag the flag to toggle
     * @return the new state
     */
    boolean toggleFlag(@NotNull PlayerFlag flag);

    /**
     * Delete all protections of this player.
     *
     * @return never null
     */
    @NotNull CompletableFuture<Void> delete();

    /**
     * Check if the player has any protections or any changed (different than default) flags.
     *
     * @return false, if the player has no protections or flags set
     */
    boolean hasData();

    /**
     * Get all group of this player. Might not include {@link #getDefaultGroup()}, if the default group was never requested before.
     *
     * @return groups of this player
     */
    @NotNull List<? extends Group> getGroups();

    /**
     * Get the amount of block protections.
     *
     * @return amount of block protections
     */
    int getBlockProtectionsAmount();

    /**
     * Get the amount of entity protections.
     *
     * @return amount of entity protections
     */
    int getEntityProtectionsAmount();

    /**
     * Get information about a specific block protection.
     *
     * @param key protection ID
     * @return null, if player doesn't have a protection with this id
     */
    @Nullable BlockProtectionInfo getBlockProtection(long key);
}
