package de.toebi.KompositumPattern;

public class Buch extends Ware {

    private String isbn;

    @Override
    public double getSum() {
        return this.preis;
    }
}
