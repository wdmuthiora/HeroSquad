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
        Squad avengers = new Squad("Avengers","Captain America", new String[]{"Captain America"},10,new String[]{"Destroy Hydra"});
        assertTrue(avengers instanceof Squad);
    }
    @Test
    @DisplayName("Returns one instance of Heroes")
    public void all_returnsAllInstancesOfSquad_true() {
        Squad justiceLeague = new Squad("Justice League", "Superman", new String[]{"Cyborg"}, 7, new String[]{"Be as cool as the Avengers"});
        assertTrue(justiceLeague.allSquads().contains(justiceLeague));
    }
    @Test
    @DisplayName("Returns two instance of Heroes")
    public void all_returnsTwoInstancesOfSquad_true() {
        Squad justiceLeague = new Squad("Justice League", "Superman", new String[]{"Cyborg"}, 7, new String[]{"Be as cool as the Avengers"});
        Squad avengers = new Squad("Avengers","Captain America", new String[]{"Captain America"},10,new String[]{"Destroy Hydra"});
        assertTrue(justiceLeague.allSquads().contains(justiceLeague));
        assertTrue(avengers.allSquads().contains(avengers));

    }
//    @Test
//    @DisplayName("Get Squad Name")
//    public void get_HeroName_true(){
//        Squad justiceLeague = new Squad("Justice League", "Superman", new String[]{"Cyborg"}, 7, new String[]{"Be as cool as the Avengers"});
//        assertEquals("Justice League", justiceLeague.getSquadName());
//    }
}