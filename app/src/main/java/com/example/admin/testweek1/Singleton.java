package com.example.admin.testweek1;

/**
 * Created by Admin on 8/7/2017.
 */

public class Singleton {
    public static Singleton instance;

    public Singleton() {
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }
}
