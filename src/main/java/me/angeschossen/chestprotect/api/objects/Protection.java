package me.angeschossen.chestprotect.api.objects;

import me.angeschossen.chestprotect.api.enums.ProtectionSetting;
import me.angeschossen.chestprotect.api.enums.Type;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public interface Protection {

    int getX();

    int getY();

    int getZ();

    Type type();

    boolean isTrusted(UUID playerUID);

    UUID getOwner();

    /**
     * Delete the protection.
     * @param deleter Player that deletes the protection, will receive a unlock message.
     * @throws IllegalStateException If the owner of the protection is not online. The owner needs to be online to receive the cashback.
     */
    void delete(@Nullable Player deleter) throws IllegalStateException;

    boolean hasSetting(@NotNull ProtectionSetting setting);

    void enableSetting(@NotNull ProtectionSetting setting);

    boolean toggleSetting(@NotNull ProtectionSetting setting);
}
