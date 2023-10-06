package me.angeschossen.chestprotect.api.protection.world;

import me.angeschossen.chestprotect.api.protection.block.BlockProtection;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ProtectionWorld {

    /**
     * Get the bukkit world.
     * @return Bukkit world
     */
    @NotNull
    World getBukkitWorld();

    /**
     * Get all block protection that are located in a specific chunk.
     * @param chunkX X identifier of chunk
     * @param chunkZ Z identifier of chunk
     * @return Chunk with protections in it or null if not loaded or doesn't exist
     */
    @Nullable
    ProtectionChunk getBlockProtectionsByChunk(int chunkX, int chunkZ);

    /**
     * Get protection by its coordinates.
     * @param x X block coordinate
     * @param y Y block coordinate
     * @param z Z block coordinate
     * @return null, if it doesn't exist or chunk isn't loaded
     */
    @Nullable
    BlockProtection getBlockProtection(int x, int y, int z);
}
