package de.toebi.KompositumPattern;

public abstract class Ware {

    double preis;

    public abstract double getSum();

    public void setPreis(double preis){
        this.preis = preis;
    }
}
