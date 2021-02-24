package me.angeschossen.chestprotect.api.objects;


import org.bukkit.Location;
import org.bukkit.Material;


public interface BlockProtection extends Protection{

    Material getType();

    Location getLocation();
}
