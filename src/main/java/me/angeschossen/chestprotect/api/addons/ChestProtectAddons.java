package me.angeschossen.chestprotect.api.addons;

import me.angeschossen.chestprotect.api.objects.BlockProtection;
import me.angeschossen.chestprotect.api.objects.ProtectPlayer;
import me.angeschossen.chestprotect.api.objects.ProtectionChunk;
import me.angeschossen.chestprotect.api.objects.ProtectionWorld;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;


public interface ChestProtectAddons {


    @NotNull String getName();

    /**
     * Get cached landPlayer
     *
     * @param UUID UUID string of player
     * @return LandPlayer or null, if not cached
     * @since 2.5.7
     */
    ProtectPlayer getProtectPlayer(UUID UUID);

    ProtectionChunk getProtectionChunk(@NotNull World world, int x, int z);

    ProtectionWorld getProtectionWorld(@NotNull World world);

    /**
     * Get cached landChunk
     *
     * @param worldName World
     * @param x         X chunk
     * @param z         Z chunk
     * @return Chunk or null, if not cached
     * @since 2.5.7
     */
    @Deprecated
    ProtectionChunk getProtectionChunk(String worldName, int x, int z);

    /**
     * Get protection.
     *
     * @param location Location of protection
     * @return BlockProtection or null, if not loaded
     */
    BlockProtection getProtection(Location location);

    /**
     * Get world.
     *
     * @param worldName Name of world.
     * @return LandWorld or null, if it's not an landWorld.
     */
    @Deprecated
    ProtectionWorld getProtectionWorld(String worldName);

    /**
     * Get's plugin wich hooks ChestProtect.
     *
     * @return Plugin
     */
    Plugin getPlugin();

    /**
     * Disables the APIHook
     */
    @Deprecated
    void disable(String hookKey);

    /**
     * Not any longer needed.
     */
    @Deprecated
    String initialize();

    boolean isProtectable(Block block);

    /**
     * Check if hook is enabled.
     *
     * @return Status
     */
    @Deprecated
    boolean isEnabled();

    /**
     * Checks if you can access the hook
     * with your key.
     *
     * @param hookKey Key of hook
     * @return Access status
     */
    @Deprecated
    boolean getAccess(String hookKey);

    /**
     * If public is true, other developers can access
     * your LandsAPIHook.
     *
     * @return
     */
    @Deprecated
    boolean isPublic();
}
