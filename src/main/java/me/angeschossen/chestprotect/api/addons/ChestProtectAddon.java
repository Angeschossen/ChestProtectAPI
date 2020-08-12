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


public class ChestProtectAddon implements ChestProtectAddons {


    @Deprecated
    public ChestProtectAddon(Plugin plugin, boolean isPublic) {
    }

    public ChestProtectAddon(@NotNull Plugin plugin) {

    }

    @Override
    @NotNull
    public String getName() {
        return null;
    }


    @Override
    public ProtectPlayer getProtectPlayer(UUID playerUUID) {
        return null;
    }

    @Override
    public ProtectionChunk getProtectionChunk(@NotNull World world, int x, int z) {
        return null;
    }

    @Override
    public ProtectionWorld getProtectionWorld(@NotNull World world) {
        return null;
    }

    @Override
    public ProtectionWorld getProtectionWorld(String worldName) {
        return null;
    }

    @Override
    public ProtectionChunk getProtectionChunk(String worldName, int x, int z) {
        return null;
    }

    @Override
    public BlockProtection getProtection(Location location) {
        return null;
    }

    @Override
    public boolean isProtectable(Block block) {
        return false;
    }

    @Override
    public Plugin getPlugin() {
        return null;
    }

    @Override
    @Deprecated
    public void disable(String hookKey) {

    }

    @Deprecated
    @Override
    public String initialize() {
        return null;
    }

    @Override
    @Deprecated
    public boolean isEnabled() {
        return false;
    }

    @Override
    @Deprecated
    public boolean getAccess(String hookKey) {
        return false;
    }

    @Override
    @Deprecated
    public boolean isPublic() {
        return false;
    }
}
