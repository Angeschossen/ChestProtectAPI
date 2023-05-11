package me.angeschossen.chestprotect.api.exceptions;

public class NameAlreadyTakenException extends RuntimeException {

    public static String name = "%%__USER__%%";
    public NameAlreadyTakenException(String errorMessage) {
        super(errorMessage);
    }
}
