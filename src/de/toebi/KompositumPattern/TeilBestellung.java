package de.toebi.KompositumPattern;

import java.util.ArrayList;
import java.util.List;

public class TeilBestellung extends Ware{

    private List<Ware> bestellung;
    private String händler;

    public TeilBestellung (){
        this.bestellung = new ArrayList<>();
    }

    public void addWare(Ware ware){
        this.bestellung.add(ware);
    }

    public void removeWare(Ware ware){
        this.bestellung.remove(ware);
    }

    public double getSum(){
        return this.bestellung.stream().mapToDouble(Ware::getSum).sum();
    }
}
