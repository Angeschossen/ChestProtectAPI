package me.angeschossen.chestprotect.api.player.flag;

import java.util.HashMap;
import java.util.Map;

public enum PlayerFlag {

    PERSISTENT_LOCK(0), PERSISTENT_TRUST(1), AUTO_LOCK(2), NOTIFICATIONS(3);
    private static final Map<Integer, PlayerFlag> map = new HashMap<>();

    static {
        for (PlayerFlag s : values()) {
            map.put(s.id, s);
        }
    }

    public final int id;

    PlayerFlag(int id) {
        this.id = id;
    }

    public static PlayerFlag getById(int id) {
        return map.get(id);
    }
}
