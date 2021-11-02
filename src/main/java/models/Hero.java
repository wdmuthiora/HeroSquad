package models;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private int age;
    private String[] powers;
    private String [] weaknesses;
    private String squadMembership;
    private String [] nemesis;
    private int experience;
    private static List<Hero> instances = new ArrayList<Hero>();

 public Hero(){

 }
}
