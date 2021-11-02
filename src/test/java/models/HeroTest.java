package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    @DisplayName("Hero Instantiates Correctly.")
    public void hero_instantiatesCorrectly() {
        Hero thor = new Hero("Thor", 2000, new String[]{"Durability"}, new String[]{"Pride"}, "Avengers","Loki",2000);
        assertTrue(thor instanceof Hero);
    }
    @Test
    @DisplayName("Returns one instance of Heroes")
    public void all_returnsOneInstanceOfHeroes_true() {
        Hero hulk = new Hero("Hulk",21, new String[]{"Durability"},new String[]{"Anger"},"Avengers","The Abomination", 5 );
        assertTrue(hulk.allHeroes().contains(hulk));
    }
    @Test
    @DisplayName("Returns two instances of Heroes")
    public void all_returnsTwoInstancesOfHeroes_true() {
        Hero spiderMan = new Hero("SpiderMan", 19, new String[]{"Spidey-sense"}, new String[]{"Inexperience"}, "Avengers", "Sinister Six", 1);
        Hero ironMan = new Hero("IronMan", 34, new String[]{"Genius"}, new String[]{"ego"}, "Avengers", "The Mandalorian",5);
        assertTrue(spiderMan.allHeroes().contains(spiderMan));
        assertTrue(ironMan.allHeroes().contains(ironMan));
    }
    @Test
    @DisplayName("Gets Hero's Name")
    public void get_HeroName_true(){
        Hero hulk = new Hero("Hulk",21, new String[]{"Durability"},new String[]{"Anger"},"Avengers","The Abomination", 5 );
        assertEquals("Hulk", hulk.getHeroName());
    }
    @Test
    @DisplayName("Gets Hero's age")
    public void get_HeroAge_true(){
        Hero hulk = new Hero("Hulk",21, new String[]{"Durability"},new String[]{"Anger"},"Avengers","The Abomination", 5 );
        assertEquals(21, hulk.getHeroAge());
    }
    @Test
    @DisplayName("Gets Hero's squad membership")
    public void get_HeroSquadMembership(){
        Hero hulk = new Hero("Hulk",21, new String[]{"Durability"},new String[]{"Anger"},"Avengers","The Abomination", 5 );
        assertEquals("Avengers", hulk.getHeroSquadMembership());
    }
    @Test
    @DisplayName("Gets Hero's nemesis")
    public void get_HeroNemesis(){
        Hero hulk = new Hero("Hulk",21, new String[]{"Durability"},new String[]{"Anger"},"Avengers","The Abomination", 5 );
        assertEquals("The Abomination", hulk.getNemesis());
    }






//    @Test
//    @DisplayName("Gets Hero's powers")
//    public void get_HeroPowers_true(){
//        Hero hulk = new Hero("Hulk",21, new String[]{"Durability"},new String[]{"Anger"},"Avengers","The Abomination", 5 );
//        assertEquals(new String[]{"Durability"}, hulk.getHeroPowers());
//    }
}