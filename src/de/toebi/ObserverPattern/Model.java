package de.toebi.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Model {

    private final List<Observer> observerList;

    public Model(){
        this.observerList = new ArrayList<>();
    }


    public void add(Observer o){
        observerList.add(o);
    }


    public void remove(Observer o){
        observerList.remove(o);
    }


    private void notifyObservers(){
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }


    public void setChanged(){
        this.notifyObservers();
    }
}
