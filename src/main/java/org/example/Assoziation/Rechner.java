package org.example.Assoziation;

public class Rechner {

    private Oberflaeche oberflaeche;


    public Rechner(Oberflaeche obf) {
        oberflaeche = obf;
    }

    public void zaehlen() {
        int y = oberflaeche.get_x();
        y = y+1;
        oberflaeche.set_x(y);
    }

}
