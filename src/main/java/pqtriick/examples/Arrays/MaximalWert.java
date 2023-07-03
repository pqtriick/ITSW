package pqtriick.examples.Arrays;

public class MaximalWert {



    public MaximalWert(int[] a) {               //Benötigt einen int Array
        int wert = a[0];
        int stelle = 0;
        for(int i = 0; i < a.length; i++) {     // Prüft die Länge des Arrays und addiert ggf. immer 1 auf i dazu
            if (a[i] > wert) {                  //Schaut ob der Array an der Stelle i größer ist als unser int wert
                wert = a[i];                    //Wenn Ja, soll er den Wert vom Array übernehmen.
                stelle = i;                     //Wenn Ja, soll er die Stelle vom Array festhalten
            }
        }
        System.out.println("Maximalster Wert: " + wert + "\n Stelle: "+stelle); //Gibt anschließend NACH der For-Schleife den Wert in den Konsole aus
    }
}
