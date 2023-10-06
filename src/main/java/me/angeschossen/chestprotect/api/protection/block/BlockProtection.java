package me.angeschossen.chestprotect.api.protection.block;


import me.angeschossen.chestprotect.api.protection.Protection;
import org.bukkit.Location;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;


public interface BlockProtection extends Protection {

    /**
     * Get the material of the block protection.
     * @return never null
     */
    @NotNull
    Material getType();

    /**
     * Get the location of this protection.
     * @return the location
     */
    @NotNull
    Location getLocation();
}
