package me.angeschossen.chestprotect.api.protection.entity;

import me.angeschossen.chestprotect.api.protection.Protection;
import org.bukkit.entity.EntityType;
import org.jetbrains.annotations.NotNull;

public interface EntityProtection extends Protection {

    /**
     * Get the entity type of this protection.
     * @return entity type
     */
    @NotNull
    EntityType getType();
}
