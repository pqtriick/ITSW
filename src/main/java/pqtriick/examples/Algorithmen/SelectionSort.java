package pqtriick.examples.Algorithmen;

public class SelectionSort {

    public static void sort(int[] liste) {
        for(int i = 0; i<=liste.length-2;i++) { //Zähle bis man die Grenze des Arrays-2 erreich hat (in unserem Fall 18)
            int kleinstes = liste[i]; //Setze kleinstes zum Wert im Array an der Stelle i
            int stelle = i; //Speicher die aktuelle Stelle

            for(int a = i+1; a <= liste.length-1;a++) { //Zähle bis man die Grenze des Arrays-1 erreicht hat
                if (kleinstes > liste[a]) { //Prüfe ob das gespeicherte kleinste grö0er ist als der Wert an der Stelle a im Array
                    kleinstes = liste[a]; //Wenn Ja setze das kleinste zum Wert im Array an der Stelle a
                    stelle = a; //Setze die Stelle zu a
                }
            }
            int temp = liste[i]; //Speichere den Aktuellen Wert an der Stelle i (Brauchen wir für den Tausch)
            liste[i] = kleinstes; //Setze den Wert an der Stelle i zu dem kleinsten Wert, den wir in der vorherigen Schleife gefunden haben
            liste[stelle] = temp; //Setze den Temporären Wert, an der Stelle vom vorherig kleinsten
        }
    }
}
