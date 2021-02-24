package me.angeschossen.chestprotect.api.objects;

import org.bukkit.entity.Player;

import java.util.UUID;


public interface ProtectPlayer {

    Player getPlayer();

    UUID getUID();

    int getSize();
}
