package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {

    private String name;  //figure out how to use Hero object instead
    private String leader;
    private List <String> teamMembers = new ArrayList<String>();     //array to store team members(figure out how to use Hero object instead).
    private int maximumSize;
    private String mission;
    private static List<Squad> squadInstances = new ArrayList<Squad>();

    //constructor
    public Squad(String name, String leader, String [] teamMembers, int maximumSize, String mission){
        this.name=name;
        this.leader=leader;
//        this.teamMembers=teamMembers;
        this.maximumSize=maximumSize;
        this.mission=mission;
        squadInstances.add(this);
    }
    public List<Squad> allSquads(){
        return squadInstances;
    }

    public String getSquadName() {
        return name;
    }

    public String getSquadLeader() {
        return leader;
    }

    public int getSquadSize() {
        return 7;
    }
    public static void clearAllSquads(){
        squadInstances.clear(); //clear as a method is part of the ArrayList class.
    }
}
