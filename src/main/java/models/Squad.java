package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {

    private String name;  //figure out how to use Hero object instead
    private String leader;
    private List <String> teamMembers = new ArrayList<String>();     //array to store team members(figure out how to use Hero object instead).
    private int maximumSize;
    private List <String> missions = new ArrayList<String>();
    private static List<Squad> squadInstances = new ArrayList<Squad>();

    //constructor
    public Squad(String name, String leader, String [] teamMembers, int maximumSize, String[] missions){
        this.name=name;
        this.leader=leader;
//        this.teamMembers=teamMembers;
        this.maximumSize=maximumSize;
//        this.missions=missions;
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
}
