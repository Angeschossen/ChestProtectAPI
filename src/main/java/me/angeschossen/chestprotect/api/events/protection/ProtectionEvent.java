package me.angeschossen.chestprotect.api.events.protection;

import com.github.angeschossen.pluginframework.api.utils.Checks;
import me.angeschossen.chestprotect.api.protection.Protection;
import org.bukkit.event.Event;
import org.jetbrains.annotations.NotNull;

public abstract class ProtectionEvent extends Event {
    private final @NotNull Protection protection;

    protected ProtectionEvent(@NotNull Protection protection) {
        this.protection = Checks.requireNonNull(protection, "protection");
    }

    @NotNull
    public final Protection getProtection() {
        return protection;
    }
}
