package me.angeschossen.chestprotect.api.protection.world;

import org.bukkit.World;

public interface ChunkCoordinate {
    int getX();

    int getZ();

    World getWorld();

    boolean equals(String worldName, int x, int z);
}
