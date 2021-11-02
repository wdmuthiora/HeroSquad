package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    @DisplayName("Hero Instantiates Correctly.")
    public void hero_instantiatesCorrectly() {
        Hero thor = new Hero();
        assertTrue(thor instanceof Hero);
    }

    @Test
    @DisplayName("Returns all instances of Heroes")
    public void all_returnsAllInstancesOfHeroes_true() {
        Hero firstHero = new Hero();
        assertTrue(firstHero.allHeroes().contains(firstHero));
    }


}