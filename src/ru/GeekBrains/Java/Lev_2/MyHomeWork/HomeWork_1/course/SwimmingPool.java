package ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1.course;

import ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1.team.Participant;

public class SwimmingPool extends AbstractCourse{
    private int distance = 50;

    public void doIt(Participant participant){
        participant.setPassed(participant.getMaxSwimmingDistance() >= distance);
    }
}
