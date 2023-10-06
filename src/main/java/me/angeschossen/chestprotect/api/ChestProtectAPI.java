package me.angeschossen.chestprotect.api;

import me.angeschossen.chestprotect.api.handler.APIHandler;
import me.angeschossen.chestprotect.api.player.ProtectPlayer;
import me.angeschossen.chestprotect.api.protection.ProtectionManager;
import me.angeschossen.chestprotect.api.protection.entity.EntityProtection;
import me.angeschossen.chestprotect.api.protection.world.ProtectionWorld;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public interface ChestProtectAPI {

    /**
     * Get implementation of the API.
     *
     * @return API implementation
     */
    static ChestProtectAPI getInstance() {
        return Objects.requireNonNull(APIHandler.getInstance(), "ChestProtect isn't loaded yet. Please access the API, after ChestProtect is loaded. It doesn't need to be fully enabled.").getAPI();
    }

    /**
     * Get protection manager.
     * @return Initialized protection manager
     */
    @NotNull ProtectionManager getProtectionManager();

    /**
     * Get online player.
     *
     * @param player The player
     * @return null, if not online and already unloaded.
     */
    @Nullable ProtectPlayer getProtectPlayer(@NotNull Player player);

    /**
     * Get world that contains all loaded protections.
     *
     * @param world World
     * @return null, if protections aren't enabled in that world or the world isn't loaded anymore.
     */
    @Nullable ProtectionWorld getProtectionWorld(@NotNull World world);

    /**
     * Get entity protection.
     * @param entity The entity
     * @return null, if not protected
     */
    @Nullable EntityProtection getEntityProtection(@NotNull Entity entity);
}
