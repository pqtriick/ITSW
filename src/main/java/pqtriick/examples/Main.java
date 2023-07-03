package pqtriick.examples;


import java.util.Random;

import static pqtriick.examples.RekursiveFunktionen.Beispiel.function1;

public class Main {

    private static int[] werte = new int[20];




    public static void main(String[] args) {
        fillRandom();
        //new MinimalWert(werte);  //Kleinsten Wert des Arrays ausgeben
        //new MaximalWert(werte); //Größten Wert des Arrays ausgeben


        //Ab hier für Sortieralgorithmen
        //System.out.println(Arrays.toString(werte)); //Aktuellen Array ausgeben für den Vergleich
        //SelectionSort.sort(werte); //SelectionSort Methode
        //BubbleSort.bubbleSort(werte); //BubbleSort Methode
        //System.out.println(Arrays.toString(werte)); //Veränderten Arrays durch die Sortierung ausgeben

        System.out.println(function1(2,4));



    }

    private static void fillRandom() {
        Random r = new Random(); //Erstelle einen Zufallsgenerator
        for(int i =0; i < werte.length; i++) { //Zählschleife bis zur Länge von unserem Array
            werte[i] = r.nextInt(100); //Wert an der Stelle i im Arrray soll zu einer Random Zahl zwischen 0 und 100 gesetzt werden
        }
    }



}