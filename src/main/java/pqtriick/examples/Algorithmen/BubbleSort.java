package pqtriick.examples.Algorithmen;

public class BubbleSort {

    //Beim Bubblesort gibt es mindestens die Länge des Arrays+1 Schritte

    public static void bubbleSort(int[] liste) {
        for (int i = 0; i < liste.length - 1; i++) { //Wiederholt den Prozess bis die Länge des Arrays -1 Erreicht ist
            for (int x = 0; x < liste.length - 1; x++) { //Gleiche Schleife wird aber zum sortieren benutzt
                int a = liste[x]; //Setze a zum Wert vom Array an der Stelle x
                int b = liste[x+1]; //Setze b zum Wert 1 weiter vom Array an der stelle x
                if (a > b) { //Prüfe ob a größer als b ist
                    liste[x] = b; //Wenn Ja setze b zum Wert an der Stelle x im Array
                    liste[x+1] = a; //Wenn Ja setze a zum Wert eins weiter von x im Array
                }
            }
        }
    }
}
