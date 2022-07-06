package de.toebi.ObserverPattern;

import java.io.Console;

public class Dealer extends Observer {


    private String name;


    @Override
    public void update(Object updatedObject) {
        System.out.println(updatedObject);
    }


    public void newShare(Share s){
        s.add(this);
    }
}
