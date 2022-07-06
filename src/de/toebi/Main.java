package de.toebi;

import de.toebi.ObserverPattern.Dealer;
import de.toebi.ObserverPattern.Share;

public class Main {

    public static void main(String[] args) {

        Share google = new Share();
        google.setAttributes("googl", 2000);

        Share apple = new Share();
        apple.setAttributes("appl", 750);

        Dealer dealer = new Dealer();
        dealer.newShare(google);
        dealer.newShare(apple);



        apple.setAttributes("appl", 850);
        apple.setAttributes("appl", 800);
    }
}
