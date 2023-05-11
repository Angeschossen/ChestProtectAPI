package me.angeschossen.chestprotect.api.protection.flag;


public enum ManagementFlag {
    PLAYER_TRUST(0),
    PLAYER_SETROLE(1),
    PLAYER_UNTRUST(2),
    UNLOCK(4),
    EDIT_FLAGS(5);


    private final int id;

    ManagementFlag(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
