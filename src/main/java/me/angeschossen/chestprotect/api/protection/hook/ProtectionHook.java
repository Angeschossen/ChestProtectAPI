package me.angeschossen.chestprotect.api.protection.hook;

import com.github.angeschossen.pluginframework.api.trusted.RoleHolder;
import com.github.angeschossen.pluginframework.api.utils.Checks;
import me.angeschossen.chestprotect.api.handler.APIHandler;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.sql.Timestamp;

public abstract class ProtectionHook {

    private final @NotNull Plugin plugin;
    private final @NotNull Data data;

    public ProtectionHook(@NotNull Plugin plugin) {
        this(plugin, APIHandler.getInstance().getFactory().getProtectionHookData(plugin));
    }

    protected ProtectionHook(@NotNull Plugin plugin, @NotNull Data data) {
        this.plugin = Checks.requireNonNull(plugin, "your plugin");
        this.data = Checks.requireNonNull(data, "data");
    }

    public final @NotNull Data getData() {
        return data;
    }

    public final @NotNull String getId() {
        return data.getId();
    }

    public final @NotNull Plugin getPlugin() {
        return plugin;
    }

    public static final class Data {
        private final @NotNull Timestamp timestamp;
        private final @NotNull String id;

        public Data(@NotNull String id, @NotNull Timestamp timestamp) {
            this.timestamp = Checks.requireNonNull(timestamp, "timestamp");
            this.id = id;
        }

        public @Nullable ProtectionHook getRegisteredHook() {
            return APIHandler.getInstance().getFactory().getProtectionHookById(id);
        }

        public @NotNull String getId() {
            return id;
        }

        public void setTime(long time) {
            this.timestamp.setTime(time);
        }

        @NotNull
        public Timestamp getTimestamp() {
            return timestamp;
        }
    }

    public abstract @Nullable RoleHolder getBlock(@NotNull Block block);

    public abstract boolean hasItem(@NotNull ItemStack itemStack);

    public final void register() {
        APIHandler.getInstance().getFactory().registerProtectionHook(this);
    }
}
