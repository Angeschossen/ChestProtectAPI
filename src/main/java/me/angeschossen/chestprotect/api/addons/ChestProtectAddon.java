package me.angeschossen.chestprotect.api.addons;


import me.angeschossen.chestprotect.api.player.ProtectPlayer;
import me.angeschossen.chestprotect.api.protection.block.BlockProtection;
import me.angeschossen.chestprotect.api.protection.world.ProtectionChunk;
import me.angeschossen.chestprotect.api.protection.world.ProtectionWorld;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;


/**
 * Use {@link me.angeschossen.chestprotect.api.ChestProtectAPI} instead.
 */
@Deprecated
public class ChestProtectAddon implements ChestProtectAddons {


    @Deprecated
    public ChestProtectAddon(Plugin plugin, boolean isPublic) {
    }

    public ChestProtectAddon(@NotNull Plugin plugin) {

    }

    @Override
    public @NotNull String getName() {
        return null;
    }

    @Override
    public ProtectPlayer getProtectPlayer(UUID UUID) {
        return null;
    }

    @Override
    public ProtectionWorld getProtectionWorld(@NotNull World world) {
        return null;
    }

    @Override
    public ProtectionChunk getProtectionChunk(@NotNull World world, int x, int z) {
        return null;
    }

    @Override
    public BlockProtection getProtection(Location location) {
        return null;
    }

    @Override
    public Plugin getPlugin() {
        return null;
    }

    @Override
    public void disable(String hookKey) {

    }

    @Override
    public String initialize() {
        return null;
    }

    @Override
    public boolean isProtectable(Block block) {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public boolean getAccess(String hookKey) {
        return false;
    }

    @Override
    public boolean isPublic() {
        return false;
    }
}
