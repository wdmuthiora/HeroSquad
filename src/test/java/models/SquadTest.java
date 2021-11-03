package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {
    @AfterEach
    public void setUp(){
        Squad.clearAllSquads();
    }

    @Test
    @DisplayName("Squad Instantiates Correctly.")
    public void squad_instantiatesCorrectly() {
        Squad avengers = setUpSquad();
        assertTrue(avengers instanceof Squad);

    }
    @Test
    @DisplayName("Returns one instance of Heroes")
    public void all_returnsAllInstancesOfSquad_true() {
        Squad justiceLeague = setUpSquad2();
        assertTrue(justiceLeague.allSquads().contains(justiceLeague));
    }
    @Test
    @DisplayName("Returns two instance of Heroes")
    public void all_returnsTwoInstancesOfSquad_true() {
        Squad justiceLeague = setUpSquad2();
        Squad avengers = setUpSquad();
        assertTrue(justiceLeague.allSquads().contains(justiceLeague));
        assertTrue(avengers.allSquads().contains(avengers));

    }
    @Test
    @DisplayName("Gets Squad's Name")
    public void get_SquadName_true(){
        Squad justiceLeague = setUpSquad2();
        assertEquals("Justice League", justiceLeague.getSquadName());
    }
    @Test
    @DisplayName("Gets Squad's Leader")
    public void get_SquadLeader_true(){
        Squad justiceLeague = setUpSquad2();
        assertEquals("Superman", justiceLeague.getSquadLeader());
    }
    @Test
    @DisplayName("Gets Squad's Size")
    public void get_SquadSize_true(){
        Squad justiceLeague = setUpSquad2();
        assertEquals(7, justiceLeague.getSquadSize());
    }
    @Test
    @DisplayName("Gets Squad's Mission")
    public void get_SquadMission_true(){
        Squad justiceLeague = setUpSquad2();
        assertEquals("Be as cool as the Avengers", justiceLeague.getSquadMission());
    }

    @Test
    @DisplayName("Find Squad by their id")
    public void get_HeroById() {
        Squad justiceLeague  = setUpSquad2();
        Squad foundSquad = Squad.findById(1);
        assertEquals(justiceLeague, foundSquad);
    }
    @Test
    @DisplayName("Delete a Hero by their Id")
    public void deleteSpecificHero() {
        Squad avengers = setUpSquad();
        Squad justiceLeague = setUpSquad2();
        avengers.deleteSquad(1);
        assertEquals(1, avengers.allSquads().size());
        assertEquals(false,avengers.allSquads().contains(avengers));
        assertEquals(true, avengers.allSquads().contains(justiceLeague));
    }
    public Squad setUpSquad(){
        return new Squad("Avengers","Captain America", 10,"Destroy Hydra");
    }
    public Squad setUpSquad2(){
        return new Squad("Justice League", "Superman",  7, "Be as cool as the Avengers");

    }
}