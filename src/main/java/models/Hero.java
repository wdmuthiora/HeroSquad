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
    //hold all Heroes created
    private static List<Hero> heroInstances = new ArrayList<Hero>();
//constructor
 public Hero(){

 }
}
