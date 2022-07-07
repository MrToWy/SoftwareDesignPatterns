package de.toebi;

import de.toebi.KompositumPattern.Buch;
import de.toebi.KompositumPattern.Kleidung;
import de.toebi.KompositumPattern.TeilBestellung;

public class Main {

    public static void main(String[] args) {

        Buch bibel = new Buch();
        bibel.setPreis(10);

        Buch dschungelBuch = new Buch();
        dschungelBuch.setPreis(19.99);

        Kleidung socke = new Kleidung();
        socke.setPreis(2);

        Kleidung dreierPackSocken = new Kleidung();
        dreierPackSocken.setPreis(7.99);




        TeilBestellung zalando = new TeilBestellung();
        zalando.addWare(socke);
        zalando.addWare(dreierPackSocken);

        TeilBestellung thalia = new TeilBestellung();
        thalia.addWare(bibel);
        thalia.addWare(dschungelBuch);


        TeilBestellung allesZusammen = new TeilBestellung();
        allesZusammen.addWare(thalia);
        allesZusammen.addWare(zalando);

        System.out.println("Gesamtpreis: " + allesZusammen.getSum());
    }
}
