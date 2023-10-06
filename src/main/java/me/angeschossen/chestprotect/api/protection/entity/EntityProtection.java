package me.angeschossen.chestprotect.api.protection.entity;

import me.angeschossen.chestprotect.api.protection.Protection;
import org.bukkit.entity.EntityType;

public interface EntityProtection extends Protection {

    EntityType getType();
}
