package me.angeschossen.chestprotect.api.protection.flag;


import com.github.angeschossen.pluginframework.api.roles.settings.SettingType;

public enum RoleFlag implements com.github.angeschossen.pluginframework.api.roles.settings.RoleSetting {
    HOPPER_TRANSFER(0), OPEN(1);

    private final int id;

    RoleFlag(int id) {
        this.id = id;
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
    public int getId() {
        return id;
    }

    @Override
    public String getMessageKey() {
        return "noaccess.action";
    }

    @Override
    public String getTogglePermission() {
        return "chestprotect.setting." + toString().toLowerCase();
    }

    @Override
    public SettingType getType() {
        return SettingType.ACTION;
    }
}
