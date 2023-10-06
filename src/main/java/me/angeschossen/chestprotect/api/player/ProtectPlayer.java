package me.angeschossen.chestprotect.api.player;

import org.bukkit.entity.Player;

import java.util.UUID;


public interface ProtectPlayer {

    Player getPlayer();

    UUID getUID();
}
