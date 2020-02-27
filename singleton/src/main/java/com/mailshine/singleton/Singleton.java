package com.mailshine.singleton;

/**
 * The type Singleton.
 */
public class Singleton {

    private static Singleton INSTANCE = null;

    private String value;

    private Singleton(){
        setValue("Initial Message");
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Get instance singleton.
     *
     * @return the singleton
     */
    public static Singleton getInstance(){
        if (INSTANCE == null)
            INSTANCE = new Singleton();
        return INSTANCE;
    }
}

