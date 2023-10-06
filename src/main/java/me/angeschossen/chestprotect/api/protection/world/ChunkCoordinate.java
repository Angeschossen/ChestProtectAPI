package me.angeschossen.chestprotect.api.protection.world;

import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

/**
 * Identifies a chunk.
 */
public interface ChunkCoordinate {
    /**
     * Get the chunk X value.
     * @return chunk X
     */
    int getX();

    /**
     * Get the chunk Z value.
     * @return chunk Z
     */
    int getZ();

    /**
     * Get the world.
     * @return world in which the chunk is located
     */
    @NotNull
    World getWorld();

    /**
     * Compare values of coordinates.
     * @param world the world
     * @param x chunk X
     * @param z chunk Z
     * @return false, if they're different
     */
    boolean equals(@NotNull World world, int x, int z);
}
