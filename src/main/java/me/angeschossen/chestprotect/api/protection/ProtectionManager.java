package me.angeschossen.chestprotect.api.protection;

import me.angeschossen.chestprotect.api.player.ProtectPlayer;
import me.angeschossen.chestprotect.api.protection.block.BlockProtection;
import me.angeschossen.chestprotect.api.protection.entity.EntityProtection;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.jetbrains.annotations.NotNull;

public interface ProtectionManager {
    /**
     * Check if block is protectable. This depends on the server's configuration.
     * @param material The block
     * @return false, if the server admin doesn't allow this block type to be protected, or it's not supported.
     */
    boolean isProtectableBlock(@NotNull Material material);

    /**
     * Check if block is protectable. This depends on the server's configuration.
     * @param entityType The entity
     * @return false, if the server admin doesn't allow this entity type to be protected, or it's not supported.
     */
    boolean isProtectableEntity(@NotNull EntityType entityType);

    /**
     * Create block protection.
     * @param block The block. Make sure to test {@link #isProtectableBlock(Material)} first
     * @param protectPlayer The owner
     * @return Never null
     * @throws IllegalArgumentException If {@link #isProtectableBlock(Material)} would return false
     * @throws IllegalStateException If already protected
     */
    @NotNull BlockProtection createBlockProtection(@NotNull Block block, @NotNull ProtectPlayer protectPlayer) throws IllegalArgumentException, IllegalStateException;

    /**
     * Create entity protection.
     * @param entity The entity. Make sure to test {@link #isProtectableEntity(EntityType)} first
     * @param player The owner
     * @return Never null
     * @throws IllegalArgumentException If {@link #isProtectableEntity(EntityType)} would return false
     * @throws IllegalStateException If already protected
     */
    @NotNull EntityProtection createEntityProtection(@NotNull Entity entity, @NotNull ProtectPlayer player)throws IllegalArgumentException, IllegalStateException;
}
