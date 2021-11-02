package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {

    private String name;
    //figure out how to use Hero object instead
    private String leader;
    //array to store team members(figure out how to use Hero object instead).
    private List <String> teamMembers = new ArrayList<String>();
    //Hold all squads created.
    private int maximumSize;
    //list of missions
    private List <String> missions = new ArrayList<String>();
    private static List<Squad> squadInstances = new ArrayList<Squad>();

    //constructor
    public Squad(String name, String leader, String [] teamMembers, int maximumSize, String[] missions){
        squadInstances.add(this);
    }
    public List<Squad> allSquads(){
        return squadInstances;
    }
}
