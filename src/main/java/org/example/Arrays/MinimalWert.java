package org.example.Arrays;

public class MinimalWert {



    public MinimalWert(int[] a) {//Benötigt einen int Array
        int num = a[0];
        for (int i=0; i < a.length; i++) {          // Prüft die Länge des Arrays und addiert ggf. immer 1 auf i dazu
            if (a[i] < num) {                       //Schaut ob der Array an der Stelle i kleiner ist als int num
                num = a[i];                         //Wenn Ja, dann soll er num zum kleineren Array setzen
            }
        }
        System.out.println("Minimalster Wert: " + num);

    }
}
