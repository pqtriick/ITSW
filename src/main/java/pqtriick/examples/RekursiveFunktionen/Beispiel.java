package pqtriick.examples.RekursiveFunktionen;

public class Beispiel {

    //Bei Rekursiven Funktionen ruft man die aktuelle Funktion in der Funktion nochmals auf
    //Hierzu ein simples Beispiel um eine hochzahl zu berechnen (Zahl = a; Hochzahl = b)

    public static int function1(int a, int b) {
        if(b==0) {
            return 1;
        } else {
            return function1(a,b-1)*a;
        }
    }
}
