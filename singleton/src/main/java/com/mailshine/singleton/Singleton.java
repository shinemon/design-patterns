package com.mailshine.singleton;

public class Singleton {

    private static Singleton INSTANCE = null;

    private String value;

    private Singleton(){}

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static Singleton getInstance(){
        if (INSTANCE == null)
            INSTANCE = new Singleton();
        return INSTANCE;
    }
}

