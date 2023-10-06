package me.angeschossen.chestprotect.api.protection;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Nameable {

    /**
     * Get the display name.
     * @return if {@link #getName()} returns null, this will return a system generated name depending on the protection type.
     */
    @NotNull String getDisplayName();

    /**
     * Get the name.
     * @return null, if no custom name was set.
     */
    @Nullable String getName();
}
