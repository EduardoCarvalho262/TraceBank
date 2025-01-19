package com.eduardo.solid.requests;

public enum TypeAccount {
    CHECKING("CHECKING"),
    INVESTMENT("INVESTMENT");

    private final String value;

    TypeAccount(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
