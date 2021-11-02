package models;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private int id;
    private String name;
    private int age;
    private String power;
    private String weakness;
    private String squadMembership;
    private String nemesis;
    private int experience;

    //hold all Heroes created
    private static List<Hero> heroInstances = new ArrayList<Hero>();

    public Hero(String name, int age, String power, String weakness, String squadMembership, String nemesis, int experience) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        this.squadMembership = squadMembership;
        this.nemesis = nemesis;
        this.experience = experience;
        this.id=heroInstances.size();
        heroInstances.add(this);

    }

    public static void clearAll() {
        heroInstances.clear();
    }

    public List<Hero> allHeroes(){
        return heroInstances;
    }

    public String getHeroName() {
        return name;
    }

    public int getHeroAge() {
        return age;
    }

    public String getHeroPower() {
        return power;
    }

    public String getHeroSquadMembership() {
        return squadMembership;
    }

    public String getNemesis() {
        return nemesis;
    }

    public int getExperience() {
        return experience;
    }

    public String getWeakness() {
        return weakness;
    }
    public void deleteHero(){
        heroInstances.remove(id-1);
    }
    public static Hero findById(int id) {
        try {
            return heroInstances.get(id - 1);
        } catch (IndexOutOfBoundsException exception) {
            return null;
        }

    }
}
