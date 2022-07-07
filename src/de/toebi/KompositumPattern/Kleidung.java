package de.toebi.KompositumPattern;

public class Kleidung extends Ware{

    private int artikelNr;

    @Override
    public double getSum() {
        return this.preis;
    }
}
