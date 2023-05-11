package me.angeschossen.chestprotect.api.protection.flag;

import java.util.HashMap;
import java.util.Map;

public enum ProtectionFlag {
    REDSTONE(0, true),
    PUBLIC_TAKE(1, false),
    PUBLIC_INSERT(2,false),
    HOLOGRAM(3, false);

    private static final Map<Integer, ProtectionFlag> map = new HashMap<>();

    static {
        for (ProtectionFlag s : values()) {
            map.put(s.id, s);
        }
    }

    private final int id;
    public final boolean defState;

    ProtectionFlag(int id, boolean defState) {
        this.id = id;
        this.defState = defState;
    }

    public static ProtectionFlag getById(int id) throws IllegalArgumentException {
        return map.get(id);
    }

    public int getId() {
        return id;
    }
}
