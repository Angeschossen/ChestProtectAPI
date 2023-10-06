package me.angeschossen.chestprotect.api.protection.flag;


import com.github.angeschossen.pluginframework.api.roles.settings.SettingType;
import org.jetbrains.annotations.NotNull;

/**
 * Used to restricted non management actions initiated by players.
 */
public enum RoleFlag implements com.github.angeschossen.pluginframework.api.roles.settings.RoleSetting {
    HOPPER_TRANSFER(0),
    OPEN(1);

    private final int id;

    RoleFlag(int id) {
        this.id = id;
    }

    /**
     * Get the permission to bypass restrictions enforced by the flag.
     *
     * @return bypass permission
     */
    @NotNull
    @Override
    public String getBypassPermission() {
        return "chestprotect.bypass." + toString().toLowerCase();
    }

    /**
     * Get the name of this flag.
     *
     * @return name of this flag
     */
    @NotNull
    @Override
    public String getName() {
        return toString();
    }

    /**
     * Get the numerical id.
     *
     * @return numerical id.
     */
    @Override
    public int getId() {
        return id;
    }

    /**
     * Get message key which is used to send no access messages.
     *
     * @return message key
     */
    @NotNull
    @Override
    public String getMessageKey() {
        return "noaccess.action";
    }

    /**
     * Get the permission needed to toggle this flag.
     *
     * @return permission to toggle this flag
     */
    @NotNull
    @Override
    public String getTogglePermission() {
        return "chestprotect.setting." + toString().toLowerCase();
    }

    /**
     * Get the type of the flag.
     *
     * @return never null
     */
    @NotNull
    @Override
    public SettingType getType() {
        return SettingType.ACTION;
    }
}
