package me.angeschossen.chestprotect.api.protection.flag;

import me.angeschossen.chestprotect.api.protection.Protection;
import me.angeschossen.chestprotect.api.protection.block.BlockProtection;
import me.angeschossen.chestprotect.api.protection.entity.EntityProtection;
import org.bukkit.Material;
import org.bukkit.Tag;

import java.util.HashMap;
import java.util.Map;

public enum ProtectionFlag {
    REDSTONE(0, true),
    PUBLIC_TAKE(1, false),
    PUBLIC_INSERT(2, false),
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

    public boolean shouldAddToMenu(Protection protection) {
        if (protection instanceof EntityProtection) {
            return false;
        }

        BlockProtection blockProtection = (BlockProtection) protection;
        Material material = blockProtection.getType();
        return Tag.DOORS.isTagged(material) || Tag.TRAPDOORS.isTagged(material);
    }
}
