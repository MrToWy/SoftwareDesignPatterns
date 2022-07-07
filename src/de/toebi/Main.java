package de.toebi;

import de.toebi.StrategiePattern.Bellverhalten;
import de.toebi.StrategiePattern.Dog;
import de.toebi.StrategiePattern.LeisesBellen;

public class Main {

    public static void main(String[] args) {

        Dog wolfgang = new Dog();
        Bellverhalten wolfgangBellt = new LeisesBellen();

        wolfgang.setBellverhalten(wolfgangBellt);


        wolfgang.getBellverhalten().bellen();
    }
}
