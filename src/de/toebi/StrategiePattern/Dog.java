package de.toebi.StrategiePattern;

public class Dog {
    private Bellverhalten bellverhalten;

    public void setBellverhalten(Bellverhalten bellverhalten) {
        this.bellverhalten = bellverhalten;
    }

    public Bellverhalten getBellverhalten() {
        return bellverhalten;
    }
}
