package org.example.Arrays;

public class MaximalWert {

    int wert = 0;

    public MaximalWert(int[] a) {               //Benötigt einen int Array
        for(int i = 0; i < a.length; i++) {     // Prüft die Länge des Arrays und addiert ggf. immer 1 auf i dazu
            if (a[i] > wert) {                  //Schaut ob der Array an der Stelle i größer ist als unser int wert
                wert = a[i];                    //Wenn Ja, soll er den Wert vom Array übernehmen.
            }
        }
        System.out.println("Maximalster Wert: " + wert); //Gibt anschließend NACH der For-Schleife den Wert in den Konsole aus
    }
}
