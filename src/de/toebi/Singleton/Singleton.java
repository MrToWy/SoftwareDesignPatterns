package de.toebi.Singleton;

public class Singleton {

    // hide constructor
    private Singleton(){};

    // one static instance
    private static Singleton instance;

    // only create new instance if there is none.
    public Singleton getInstance(){
        if(instance == null) instance = new Singleton();

        return instance;
    }
}


