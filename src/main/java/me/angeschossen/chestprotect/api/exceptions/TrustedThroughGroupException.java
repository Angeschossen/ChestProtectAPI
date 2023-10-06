package me.angeschossen.chestprotect.api.exceptions;

public class TrustedThroughGroupException extends Exception {
    public TrustedThroughGroupException() {
        super("The player is trusted to this protection through the group that this protection belongs to. That means that either the group needs to be removed or the player needs to be untrusted at the group.");
    }
}
