package org.example;

public class FizzBuzz {

    public static String fizzBuzz(int number) {

        // Spezialfall bei 0
        if(number == 0) {
            return "0";
        }

        // Ist die Zahl durch 3 und 5 teilbar, gib "fizzbuzz" zurück
        // % = Modulo-Operator = Sagt wie viel Rest bei einer Division übrig bleibt
        if(number % 3 == 0 && number % 5 == 0) {
            return "fizzbuzz";
        }

        // Ist die Zahl durch 3 teilbar, gib "fizz" zurück
        // % = Modulo-Operator
        if(number % 3 == 0) {
            return "fizz";
        }

        // Ist die Zahl durch 5 teilbar, gib "buzz" zurück
        // % = Modulo-Operator
        if(number % 5 == 0) {
            return "buzz";
        }

        // Im Normalfall soll einfach die Zahl als String zurückgegeben werden
        // Andere Möglichkeit eine Zahl in einen String zu konvertieren
        // Datentyp konvertieren = "Casten"
        // String s  = "" + number;
        return String.valueOf(number);
    }
}
