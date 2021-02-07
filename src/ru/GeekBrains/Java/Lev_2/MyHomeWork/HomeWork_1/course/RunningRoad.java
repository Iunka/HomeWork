package ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1.course;

import ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1.team.Participant;

public class RunningRoad  extends AbstractCourse{
    private int distance = 500;

    public void doIt(Participant participant){
        participant.setPassed(participant.getMaxRunningDistance() >= distance);
    }
}
