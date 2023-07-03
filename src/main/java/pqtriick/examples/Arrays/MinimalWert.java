package pqtriick.examples.Arrays;

public class MinimalWert {



    public MinimalWert(int[] a) {//Benötigt einen int Array
        int num = a[0];
        int stelle = 0;
        for (int i=0; i < a.length; i++) {          // Prüft die Länge des Arrays und addiert ggf. immer 1 auf i dazu
            if (a[i] < num) {                       //Schaut ob der Array an der Stelle i kleiner ist als int num
                num = a[i];                         //Wenn Ja, dann soll er num zum kleineren Array setzen
                stelle = i;                         //Wenn Ja, dann soll er Speichern wo der kleinste Array ist
            }
        }
        System.out.println("Minimalster Wert: " + num + "\n Stelle: " + stelle); //Gebe den Wert mit der Stelle aus

    }
}
