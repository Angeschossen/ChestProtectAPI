package me.angeschossen.chestprotect.api.protection.flag;

import com.github.angeschossen.pluginframework.api.roles.settings.SettingType;

public enum ManagementFlag implements com.github.angeschossen.pluginframework.api.roles.settings.ManagementSetting {
    PLAYER_TRUST(0),
    PLAYER_SETROLE(1),
    PLAYER_UNTRUST(2),
    UNLOCK(4),
    EDIT_FLAGS(5);


    private final int id;

    ManagementFlag(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getBypassPermission() {
        return "chestprotect.bypass." + toString().toLowerCase();
    }

    @Override
    public String getName() {
        return toString();
    }

    @Override
    public SettingType getType() {
        return SettingType.MANAGEMENT;
    }

    @Override
    public String getTogglePermission() {
        return "chestprotect.setting." + toString().toLowerCase();
    }

    @Override
    public String getMessageKey() {
        return "noaccess.management" ;
    }

    public static ManagementFlag getById(int iD) {
        for (ManagementFlag setting : values()) {
            if (setting.getId() == iD)
                return setting;
        }

        throw new IllegalArgumentException("No managementsetting with iD '" + iD + "' found.");
    }
}
