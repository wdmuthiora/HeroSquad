package models;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private int age;
    private String[] powers;
    private String [] weaknesses;
    private String squadMembership;
    private String nemesis;
    private int experience;
    //hold all Heroes created
    private static List<Hero> heroInstances = new ArrayList<Hero>();
    //constructor
    public Hero(String name, int age, String[] powers, String[] weaknesses, String squadMembership, String nemesis, int experience){

        this.name=name;
        this.age=age;
        this.powers=powers;
        this.weaknesses=weaknesses;
        this.squadMembership=squadMembership;
        this.nemesis=nemesis;
        this.experience=experience;
        heroInstances.add(this);

    }
    public List<Hero> allHeroes(){
        return heroInstances;
    }

    public String getHeroName() {
        return name;
    }
}
