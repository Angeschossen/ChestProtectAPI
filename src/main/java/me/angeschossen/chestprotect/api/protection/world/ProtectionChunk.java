package me.angeschossen.chestprotect.api.protection.world;


import me.angeschossen.chestprotect.api.protection.block.BlockProtection;
import org.jetbrains.annotations.Nullable;

public interface ProtectionChunk {

    /**
     * Get protectionWorld of chunk
     *
     * @return ProtectionWorld
     */
    ProtectionWorld getProtectionWorld();

    /**
     * Get x identifier of chunk
     *
     * @return Identifier
     */
    int getX();

    /**
     * Get z identifier of chunk
     *
     * @return Identier
     */
    int getZ();

    /**
     * Get protection
     *
     * @param x X block coordinate
     * @param y Y block coordinate
     * @param z Z block coordinate
     * @return BlockProtection or null, if none found.
     */
    @Nullable
    BlockProtection getProtection(int x, int y, int z);
}
