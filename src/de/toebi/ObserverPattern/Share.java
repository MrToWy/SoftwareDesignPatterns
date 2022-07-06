package de.toebi.ObserverPattern;

public class Share extends Model {

    private String name;
    private int value;

    public void setAttributes(String name, int value){
        this.name = name;
        this.value = value;

        this.setChanged();
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", value=" + value;
    }
}
