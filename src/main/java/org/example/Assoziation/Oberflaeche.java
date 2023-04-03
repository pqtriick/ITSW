package org.example.Assoziation;

public class Oberflaeche {

    int x;

    Rechner rnc = new Rechner(this);


    public Oberflaeche(int px) {
        set_x(px);
        rnc.zaehlen();
        System.out.println("Die Zahl ist " + get_x());

    }



    public void set_x(int Wert) {
        x = Wert;

    }

    public int get_x() {
        return x;

    }
}
