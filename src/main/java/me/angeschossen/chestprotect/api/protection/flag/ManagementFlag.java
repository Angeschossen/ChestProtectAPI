package me.angeschossen.chestprotect.api.protection.flag;

import com.github.angeschossen.pluginframework.api.roles.settings.SettingType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Used to restrict actions such as trusting players etc.
 */
public enum ManagementFlag implements com.github.angeschossen.pluginframework.api.roles.settings.ManagementSetting {
    /**
     * Trusting a player.
     */
    PLAYER_TRUST(0),
    /**
     * Setting the role of a player with a lower role than the role of the editor.
     */
    PLAYER_SETROLE(1),
    /**
     * Untrusting a trusted player with a lower role than the role of the editor.
     */
    PLAYER_UNTRUST(2),
    /**
     * Unlocking the protection.
     */
    UNLOCK(4),
    /**
     * Editing settings for a protection.
     */
    EDIT_FLAGS(5);


    private final int id;

    ManagementFlag(int id) {
        this.id = id;
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
     * Get the type of the flag.
     *
     * @return never null
     */
    @NotNull
    @Override
    public SettingType getType() {
        return SettingType.MANAGEMENT;
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
     * Get message key which is used to send no access messages.
     *
     * @return message key
     */
    @NotNull
    @Override
    public String getMessageKey() {
        return "noaccess.management";
    }

    /**
     * Get a flag by its numerical id.
     *
     * @param iD numerical id of the flag
     * @return null, if no flag with this id exists
     */
    @Nullable
    public static ManagementFlag getById(int iD) {
        for (ManagementFlag setting : values()) {
            if (setting.getId() == iD)
                return setting;
        }

        return null;
    }
}
