package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private int id;
    private String name;  //figure out how to use Hero object instead
    private String leader;
    private List <String> teamMembers = new ArrayList<String>();     //array to store team members(figure out how to use Hero object instead).
    private int maximumSize;
    private String mission;
    private static List<Squad> squadInstances = new ArrayList<Squad>();

    //constructor
    public Squad(String name, String leader, int maximumSize, String mission){
        this.id=squadInstances.size();
        this.name=name;
        this.leader=leader;
        this.teamMembers=teamMembers;
        this.maximumSize=maximumSize;
        this.mission=mission;
        squadInstances.add(this);
    }
    public static List<Squad> allSquads(){
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

    public String getSquadMission() {
        return mission;
    }
    public void deleteSquad(int id){
        squadInstances.remove(id-1);
    }
    public static Squad findById(int id){
        try {
            return squadInstances.get(id-1);
        } catch (IndexOutOfBoundsException exception) {
            return null;
        }

    }
    public static void clearAllSquads(){
        squadInstances.clear(); //clear as a method is part of the ArrayList class.
    }
}
