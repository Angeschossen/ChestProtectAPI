package me.angeschossen.chestprotect.api.protection;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Nameable {

    @NotNull String getDisplayName();

    @Nullable String getName();
}
