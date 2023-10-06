package me.angeschossen.chestprotect.api.addons;


import me.angeschossen.chestprotect.api.ChestProtectAPI;
import me.angeschossen.chestprotect.api.player.ProtectPlayer;
import me.angeschossen.chestprotect.api.protection.block.BlockProtection;
import me.angeschossen.chestprotect.api.protection.world.ProtectionChunk;
import me.angeschossen.chestprotect.api.protection.world.ProtectionWorld;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.lang.invoke.SwitchPoint;
import java.util.Objects;
import java.util.UUID;


/**
 * Use {@link me.angeschossen.chestprotect.api.ChestProtectAPI} instead.
 */
@Deprecated
public class ChestProtectAddon implements ChestProtectAddons {

    private final Plugin plugin;

    @Deprecated
    public ChestProtectAddon(Plugin plugin, boolean isPublic) {
        this(plugin);
    }

    public ChestProtectAddon(@NotNull Plugin plugin) {
        if (plugin == null || !plugin.isEnabled()) {
            throw new IllegalStateException("Plugin " + (plugin == null ? "?" : plugin.getName()) + " needs to be enabled.");
        }

        this.plugin = plugin;
        Bukkit.getLogger().info("[ChestProtect] Nag author(s) of plugin " + plugin.getName() + ". It uses the deprecated ChestProtectAddon of ChestProtect. Use ChestProtectAPI instead.");
    }

    @Override
    @NotNull
    public String getName() {
        return plugin.getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlugin());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ChestProtectAddon)) {
            return false;
        }

        return getPlugin().equals(((ChestProtectAddon) obj).getPlugin());
    }


    @Override
    public ProtectPlayer getProtectPlayer(UUID playerUUID) {
        Player player = Bukkit.getPlayer(playerUUID);
        if (player == null) {
            return null;
        }

        return ChestProtectAPI.getInstance().getProtectPlayer(player);
    }

    @Override
    public ProtectionWorld getProtectionWorld(@NotNull World world) {
        return ChestProtectAPI.getInstance().getProtectionWorld(world);
    }

    @Override
    public ProtectionChunk getProtectionChunk(@NotNull World world, int x, int z) {
        return null;
    }

    @Override
    public BlockProtection getProtection(Location location) {
        ProtectionWorld world = getProtectionWorld(location.getWorld());
        return world == null ? null : world.getBlockProtection(location.getBlockX(), location.getBlockY(), location.getBlockZ());
    }

    @Override
    public boolean isProtectable(Block block) {
        return ChestProtectAPI.getInstance().getProtectionManager().isProtectableBlock(block.getType());
    }

    @Override
    public Plugin getPlugin() {
        return plugin;
    }

    @Override
    @Deprecated
    public void disable(String hookKey) {

    }

    @Deprecated
    @Override
    public String initialize() {
        return "";
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
