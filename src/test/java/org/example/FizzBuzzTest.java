package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    // Im Normalfall soll einfach die Zahl als String zurückgegeben werden (4 => "4")
    @Test
    void when_normal_number_output_string() {
        // GIVEN
        int zahl = 4;
        String expected = "4";

        // WHEN
        // Wir rufen die Methode "fizzBuzz" der Klasse "FizzBuzz" auf
        String result = FizzBuzz.fizzBuzz(zahl);

        // THEN
        // Erwartetes Ergebnis mit tatsächlichem Ergebnis vergleichen
        assertEquals(expected, result);
    }

    // Ist die Zahl durch 3 teilbar, gib "fizz" zurück
    @Test
    void when_number_is_multiple_of_3_output_fizz() {
        // GIVEN
        int zahl = 6;
        String expected = "fizz";

        // WHEN
        String result = FizzBuzz.fizzBuzz(zahl);

        // THEN
        assertEquals(expected, result);
    }

    // Ist die Zahl durch 5 teilbar, gib "buzz" zurück
    @Test
    void when_number_is_multiple_of_5_output_buzz() {
        // GIVEN
        int zahl = 5;
        String expected = "buzz";

        // WHEN
        String result = FizzBuzz.fizzBuzz(zahl);

        // THEN
        assertEquals(expected, result);
    }

    // Ist die Zahl durch 3 und 5 teilbar, gib "fizzbuzz" zurück
    @Test
    void when_number_is_multiple_of_3_and_5_output_fizzbuzz() {
        // GIVEN
        int zahl = 30;
        String expected = "fizzbuzz";

        // WHEN
        String result = FizzBuzz.fizzBuzz(zahl);

        // THEN
        assertEquals(expected, result);
    }

    @Test
    void when_number_is_1_5million_output_fizzbuzz() {
        // GIVEN
        int zahl = 1500000;
        String expected = "fizzbuzz";

        // WHEN
        String result = FizzBuzz.fizzBuzz(zahl);

        // THEN
        assertEquals(expected, result);
    }

    @Test
    void when_number_is_1_4million_output_fizzbuzz() {
        // GIVEN
        int zahl = 1400000;
        String expected = "buzz";

        // WHEN
        String result = FizzBuzz.fizzBuzz(zahl);

        // THEN
        assertEquals(expected, result);
    }

    @Test
    void when_number_is_0_output_fizzbuzz() {
        // GIVEN
        int zahl = 0;
        String expected = "0";

        // WHEN
        String result = FizzBuzz.fizzBuzz(zahl);

        // THEN
        assertEquals(expected, result);
    }
}
