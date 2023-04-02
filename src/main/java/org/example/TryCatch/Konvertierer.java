package org.example.TryCatch;

public class Konvertierer {


    public void NumberConverter(String number) {            //Benötigt einen String als Argument und probiert den Text zu einer Zahl umzuwandeln
        int zahl;                                           //Datentyp zahl ohne Wert
        try {                                               // "Probiere"
            zahl = Integer.parseInt(number);                //Wandel die Zahl vom Argument number in einen Integer
            System.out.println("Zahl: " + zahl);            //Gebe in der KOnsole die Zahl aus
        } catch (Exception e) {                             //Fange wenn es einen Fehler gibt
            System.out.println(e);                          //Gebe den Fehler in einer Konsole aus
        }

    }

    public void ArrayLength(int[] array, int stelle) {      //Benötigt einen Int Array und die Stelle als Argument
        int zahl;                                           //Datentyp zahl ohne Wert
        try {                                               // "Probiere"
            zahl = array[stelle];                           //Setze den Datentyp zahl zum int im array an der Stelle stelle
            System.out.println("Zahl: " + zahl);            //Gebe in der KOnsole die Zahl aus
        } catch (Exception e) {                             //Fange wenn es einen Fehler gibt
            System.out.println(e);                          //Gebe den Fehler in einer Konsole aus
        }
    }
}
