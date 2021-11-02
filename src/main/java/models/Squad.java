package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private Hero leader;
    private String name;
    //array to store team members.
    private List <Hero> teamMembers = new ArrayList<Hero>();
    //Hold all squads created.
    private int maximumSize;
    //list of missions
    private List <Object> missions = new ArrayList<Object>();
    private  static List<Squad> squadInstances = new ArrayList<Squad>();

    //constructor
    public Squad(){

    }
}
