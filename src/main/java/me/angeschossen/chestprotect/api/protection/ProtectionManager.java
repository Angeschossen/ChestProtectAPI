package me.angeschossen.chestprotect.api.protection;

import me.angeschossen.chestprotect.api.player.ProtectPlayer;
import me.angeschossen.chestprotect.api.protection.block.BlockProtection;
import me.angeschossen.chestprotect.api.protection.entity.EntityProtection;
import me.angeschossen.chestprotect.api.protection.hook.ProtectionHook;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.jetbrains.annotations.NotNull;

public interface ProtectionManager {
    /**
     * Check if block is protectable. This depends on the server's configuration.
     *
     * @param material the block type
     * @return false, if the server admin doesn't allow this block type to be protected, or it's not supported.
     */
    boolean isProtectableBlock(@NotNull Material material);

    /**
     * Check if block is protectable. This depends on the server's configuration.
     *
     * @param entityType the entity
     * @return false, if the server admin doesn't allow this entity type to be protected, or it's not supported.
     */
    boolean isProtectableEntity(@NotNull EntityType entityType);

    /**
     * Create block protection.
     *
     * @param protectionHook your plugin
     * @param block          Make sure to test {@link #isProtectableBlock(Material)} first
     * @param protectPlayer  the owner
     * @return never null
     * @throws IllegalArgumentException If {@link #isProtectableBlock(Material)} would return false
     * @throws IllegalStateException    If already protected
     */
    @NotNull BlockProtection createBlockProtection(@NotNull ProtectionHook protectionHook, @NotNull Block block, @NotNull ProtectPlayer protectPlayer) throws IllegalArgumentException, IllegalStateException;

    /**
     * Create entity protection.
     *
     * @param protectionHook your plugin
     * @param entity         Make sure to test {@link #isProtectableEntity(EntityType)} first
     * @param player         the owner
     * @return never null
     * @throws IllegalArgumentException If {@link #isProtectableEntity(EntityType)} would return false
     * @throws IllegalStateException    If already protected
     */
    @NotNull EntityProtection createEntityProtection(@NotNull ProtectionHook protectionHook, @NotNull Entity entity, @NotNull ProtectPlayer player) throws IllegalArgumentException, IllegalStateException;
}
