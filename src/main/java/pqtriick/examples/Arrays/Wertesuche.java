package pqtriick.examples.Arrays;

public class Wertesuche {


    public Wertesuche(int[] a, int b)  {                //Benötigt einen int Array und einen Int, welcher im Array gesucht werden soll
        for (int i = 0; i<a.length; i++) {              // Prüft die Länge des Arrays und addiert ggf. immer 1 auf i dazu
            if (a[i] == b) {                            // Wenn ein Array an der Stelle i mit dem Gesuchten Wert übereinstimmt soll er in der Konsole den Wert mit der POsition ausgeben
                System.out.println("Wert " + b + " Exisitert im Array. Position: " + i);        //Gibt den Wert aus
            }
        }

    }
}
