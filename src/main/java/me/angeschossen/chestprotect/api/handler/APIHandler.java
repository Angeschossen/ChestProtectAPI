package me.angeschossen.chestprotect.api.handler;

import me.angeschossen.chestprotect.api.ChestProtectAPI;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class APIHandler {

    private static APIHandler instance;
    private final ChestProtectAPI api;

    @NotNull
    public ChestProtectAPI getAPI() {
        return api;
    }

    private APIHandler(@NotNull ChestProtectAPI api) {
        this.api = api;
    }

    public static APIHandler getInstance() {
        return instance;
    }

    public static void init(@NotNull ChestProtectAPI api) {
        Objects.requireNonNull(api);
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }

        instance = new APIHandler(api);
    }
}
