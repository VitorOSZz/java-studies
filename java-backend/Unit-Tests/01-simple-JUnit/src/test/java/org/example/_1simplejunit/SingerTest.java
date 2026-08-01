package org.example._1simplejunit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingerTest {

    @Test
    void getGrammys() {
        Singer billieEilish = new Singer("Billie Eilish", 10);
        assertTrue(billieEilish.getGrammys() >= 10);
    }

    @Test
    @DisplayName("Best singer, obviously Billie Eilish")
    void bestSingerShouldReturnBillieEilish() {
        Singer brunoMars = new Singer("Bruno Mars", 16);
        assertEquals("Billie Eilish", brunoMars.bestSinger());
    }
}