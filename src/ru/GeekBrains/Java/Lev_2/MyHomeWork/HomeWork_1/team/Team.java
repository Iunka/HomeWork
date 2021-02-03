package ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1.team;

import java.util.Arrays;

public class Team {
    private String name;
    private Participant[] participants;

    public Team(String name, Participant... participants) {
        this.name = name;
        this.participants = participants;
    }

    public Participant[] getParticipants() {
        return participants;
    }

    public void showAllInfo(){
        System.out.println("It's all info:");
        System.out.println("Team name: " + name);
        System.out.println(Arrays.toString(participants));
    }

    public void showPassedInfo(){
        System.out.println("It's passed info:");
        System.out.println("Team name: " + name);
        for (int i = 0; i < getParticipants().length; i++) {
            if (participants[i].isPassed()){
                System.out.println(participants[i]);
            }
        }
    }
}
