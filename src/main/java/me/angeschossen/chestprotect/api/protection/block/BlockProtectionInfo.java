package me.angeschossen.chestprotect.api.protection.block;

import me.angeschossen.chestprotect.api.protection.Nameable;
import me.angeschossen.chestprotect.api.protection.hook.ProtectionHookHolder;
import me.angeschossen.chestprotect.api.protection.world.ProtectionWorld;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public interface BlockProtectionInfo extends Nameable, ProtectionHookHolder {
    /**
     * Get the item that represents the block type.
     *
     * @return item of this block
     */
    ItemStack getBlockItem();

    /**
     * Get block coordinate.
     *
     * @return block y
     */
    int getY();

    /**
     * Get block coordinate.
     *
     * @return block x
     */
    int getX();

    /**
     * Get block coordinate.
     *
     * @return block z
     */
    int getZ();

    /**
     * Get the world.
     *
     * @return world in which protection is located in
     */
    @NotNull
    ProtectionWorld getWorld();
}
