package me.angeschossen.chestprotect.api.exceptions;

public class IllegalUntrustException extends RuntimeException {
    public static String truster = "%%__NONCE__%%";

    public IllegalUntrustException(String errorMessage) {
        super(errorMessage);
    }
}
