package models;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @AfterEach
    public void tearDown() {
        Hero.clearAll();
    }

   @Test
   @DisplayName("Hero Instantiates Correctly.")
   public void hero_instantiatesCorrectly() {
       Hero thor = setUpTestHero3();
       assertTrue(thor instanceof Hero);
   }

   @Test
   @DisplayName("Returns one instance of Heroes")
   public void all_returnsOneInstanceOfHeroes_true() {
       Hero hulk = setUpTestHero2();
       assertTrue(Hero.allHeroes().contains(hulk));
       assertEquals(1,Hero.allHeroes().size());
   }

   @Test
   @DisplayName("Returns two instances of Heroes")
   public void all_returnsTwoInstancesOfHeroes_true() {
       Hero hulk = setUpTestHero2();
       Hero thor = setUpTestHero3();
       assertTrue(Hero.allHeroes().contains(hulk));
       assertEquals(2,Hero.allHeroes().size());
       assertTrue(Hero.allHeroes().contains(thor));
   }

   @Test
   @DisplayName("Gets Hero's Name")
   public void get_HeroName_true(){
       Hero hulk = setUpTestHero2();
       assertEquals("Hulk", hulk.getHeroName());
   }

   @Test
   @DisplayName("Gets Hero's age")
   public void get_HeroAge_true(){
       Hero hulk = setUpTestHero2();
       assertEquals(21, hulk.getHeroAge());
   }

    @Test
    @DisplayName("Gets Hero's power")
    public void get_HeroPower_true(){
        Hero hulk = setUpTestHero2();
        assertEquals("Durability", hulk.getHeroPower());
    }

    @Test
    @DisplayName("Gets Hero's weakness")
    public void get_HeroWeakness(){
        Hero hulk = setUpTestHero2();
        assertEquals("Anger", hulk.getWeakness());
    }

   @Test
   @DisplayName("Gets Hero's squad membership")
   public void get_HeroSquadMembership(){
       Hero hulk = setUpTestHero2();
       assertEquals("Avengers", hulk.getHeroSquadMembership());
   }

   @Test
   @DisplayName("Gets Hero's nemesis")
   public void get_HeroNemesis(){
       Hero hulk = setUpTestHero2();
       assertEquals("The Abomination", hulk.getNemesis());
   }

   @Test
   @DisplayName("Gets Hero's experience")
   public void get_HeroExperience(){
       Hero hulk = setUpTestHero2();
       assertEquals(5, hulk.getExperience());
   }

    @Test
    @DisplayName("Find Hero by their id")
    public void get_HeroById() {
        Hero flash  = setUpTestHero();
        Hero foundHero = Hero.findById(1);
        assertEquals(flash, foundHero);
   }
    @Test
    @DisplayName("Delete a Hero by their Id")
    public void deleteSpecificHero() {
        Hero flash=setUpTestHero();
        Hero hulk=setUpTestHero2();
        flash.deleteHero(1);
        assertEquals(1, Hero.allHeroes().size());
        assertFalse(Hero.allHeroes().contains(flash));
        assertTrue(Hero.allHeroes().contains(hulk));
    }

    private Hero setUpTestHero() {
        return new Hero("flash",30,"Super speed","no limit","Justice League","Reverse Flash", 1000);
    }

    private Hero setUpTestHero2(){
        return new Hero("Hulk",21, "Durability","Anger","Avengers","The Abomination", 5 );

    }

    private Hero setUpTestHero3(){
        return new Hero("Thor", 2000, "Durability", "Pride", "Avengers","Loki",2000);

    }

}