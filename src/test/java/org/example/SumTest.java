package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    // "@Test" = Annotation = Testmethode, d.h. sie testet eine Methode
    @Test
    void sum_should_return_correct_result() {
        // GIVEN - Das was wir am Anfang haben
        int zahl1 = 5;
        int zahl2 = 7;
        int expected = zahl1 + zahl2; // 12

        // WHEN - Das was wir testen wollen, rufen wir hier auf
        int result = Sum.sum(zahl1, zahl2);

        // THEN - Das Ergebnis das wir erwarten
        // Assertions = Sicherstellung helfen uns Ergebnisse sicherzustellen
        assertEquals(expected, result);
    }

    @Test
    void sum_should_not_return_incorrect_result() {
        // GIVEN - Das was wir am Anfang haben
        int zahl1 = 5;
        int zahl2 = 7;
        int expected = 13; // "ÄHHH" Computer sagt nein! (falsches Ergebnis)

        // WHEN - Das was wir testen wollen, rufen wir hier auf
        int result = Sum.sum(zahl1, zahl2);

        // THEN - Das Ergebnis das wir erwarten
        // Wir testen ob NICHT das falsche Ergebnis zurückgeliefert wird
        // (Nur zur Demo, kein sinnvoller Test!)
        assertNotEquals(expected, result);
    }
}