package me.angeschossen.chestprotect.api.protection.hook;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ProtectionHookHolder {

    void removeProtectionHook();

    void setProtectionHook(@NotNull ProtectionHook protectionHook);

    @Nullable
    ProtectionHook getProtectionHook();
}
