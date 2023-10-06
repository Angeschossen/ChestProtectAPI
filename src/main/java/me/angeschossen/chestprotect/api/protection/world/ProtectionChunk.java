package me.angeschossen.chestprotect.api.protection.world;


import me.angeschossen.chestprotect.api.protection.block.BlockProtection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ProtectionChunk {

    /**
     * Get world of a chunk.
     *
     * @return contains more information about protections
     */
    @NotNull
    ProtectionWorld getProtectionWorld();

    /**
     * Get x identifier of chunk
     *
     * @return x identifier
     */
    int getX();

    /**
     * Get z identifier of chunk
     *
     * @return z identifier
     */
    int getZ();

    /**
     * Get a block protection.
     *
     * @param x X block coordinate
     * @param y Y block coordinate
     * @param z Z block coordinate
     * @return null, if none found at the given coordinates or the chunk isn't loaded
     */
    @Nullable
    BlockProtection getProtection(int x, int y, int z);
}
