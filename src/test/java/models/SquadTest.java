package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Squad Instantiates Correctly.")
    public void squad_instantiatesCorrectly() {
        Squad avengers = new Squad();
        assertTrue(avengers instanceof Squad);
    }
    @Test
    @DisplayName("Returns one instance of Heroes")
    public void all_returnsAllInstancesOfSquad_true() {
        Squad justiceLeague = new Squad();
        assertTrue(justiceLeague.allSquads().contains(justiceLeague));
    }
    @Test
    @DisplayName("Returns two instance of Heroes")
    public void all_returnsTwoInstancesOfSquad_true() {
        Squad justiceLeague = new Squad();
        Squad avengers = new Squad();
        assertTrue(justiceLeague.allSquads().contains(justiceLeague));
        assertTrue(avengers.allSquads().contains(avengers));

    }
}