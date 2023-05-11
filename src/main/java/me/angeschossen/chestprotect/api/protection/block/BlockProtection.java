package me.angeschossen.chestprotect.api.protection.block;


import me.angeschossen.chestprotect.api.protection.Protection;
import org.bukkit.Location;
import org.bukkit.Material;


public interface BlockProtection extends Protection {

    Material getType();

    Location getLocation();
}
