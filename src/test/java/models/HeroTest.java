package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @AfterEach
    public void setUp(){
        Hero.clearAllHeroes();
    }

   @Test
   @DisplayName("Hero Instantiates Correctly.")
   public void hero_instantiatesCorrectly() {
       Hero thor = new Hero("Thor", 2000, "Durability", "Pride", "Avengers","Loki",2000);
       assertTrue(thor instanceof Hero);
   }

   @Test
   @DisplayName("Returns one instance of Heroes")
   public void all_returnsOneInstanceOfHeroes_true() {
       Hero.clearAllHeroes();
       Hero hulk = new Hero("Hulk",21, "Durability","Anger","Avengers","The Abomination", 5 );
       assertTrue(hulk.allHeroes().contains(hulk));
   }

   @Test
   @DisplayName("Returns two instances of Heroes")
   public void all_returnsTwoInstancesOfHeroes_true() {
       Hero spiderMan = new Hero("SpiderMan", 19, "Spidey-sense", "Inexperience", "Avengers", "Sinister Six", 1);
       Hero ironMan = new Hero("IronMan", 34, "Genius", "ego", "Avengers", "The Mandalorian",5);
       assertTrue(spiderMan.allHeroes().contains(spiderMan));
       assertTrue(ironMan.allHeroes().contains(ironMan));
   }

   @Test
   @DisplayName("Gets Hero's Name")
   public void get_HeroName_true(){
       Hero hulk = new Hero("Hulk",21, "Durability","Anger","Avengers","The Abomination", 5 );
       assertEquals("Hulk", hulk.getHeroName());
   }

   @Test
   @DisplayName("Gets Hero's age")
   public void get_HeroAge_true(){
       Hero hulk = new Hero("Hulk",21, "Durability", "Anger","Avengers","The Abomination", 5 );
       assertEquals(21, hulk.getHeroAge());
   }

    @Test
    @DisplayName("Gets Hero's power")
    public void get_HeroPower_true(){
        Hero hulk = new Hero("Hulk",21, "Super Strength", "Anger","Avengers","The Abomination", 5 );
        assertEquals("Super Strength", hulk.getHeroPower());
    }

    @Test
    @DisplayName("Gets Hero's weakness")
    public void get_HeroWeakness(){
        Hero hulk = new Hero("Hulk",21, "Durability","Anger","Avengers","The Abomination", 5 );
        assertEquals("Anger", hulk.getWeakness());
    }

   @Test
   @DisplayName("Gets Hero's squad membership")
   public void get_HeroSquadMembership(){
       Hero hulk = new Hero("Hulk",21, "Durability","Anger","Avengers","The Abomination", 5 );
       assertEquals("Avengers", hulk.getHeroSquadMembership());
   }

   @Test
   @DisplayName("Gets Hero's nemesis")
   public void get_HeroNemesis(){
       Hero hulk = new Hero("Hulk",21, "Durability","Anger","Avengers","The Abomination", 5 );
       assertEquals("The Abomination", hulk.getNemesis());
   }

   @Test
   @DisplayName("Gets Hero's experience")
   public void get_HeroExperience(){
       Hero hulk = new Hero("Hulk",21, "Durability","Anger","Avengers","The Abomination", 5 );
       assertEquals(5, hulk.getExperience());
   }



}