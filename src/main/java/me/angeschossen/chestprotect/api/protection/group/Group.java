package me.angeschossen.chestprotect.api.protection.group;

import me.angeschossen.chestprotect.api.exceptions.TrustedThroughGroupException;
import me.angeschossen.chestprotect.api.protection.MemberHolder;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.UUID;

public interface Group extends MemberHolder {

    /**
     * Untrust a player that is trusted directly to this protection.
     * @param playerUUID The player to untrust
     */
    void untrustPlayer(@NotNull UUID playerUUID);
}
