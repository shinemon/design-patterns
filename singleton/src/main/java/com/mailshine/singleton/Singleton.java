package com.mailshine.singleton;

public class Singleton {

    private static Singleton INSTANCE = null;

    private String value;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (INSTANCE == null)
            INSTANCE = new Singleton();

        return INSTANCE;
    }
}

