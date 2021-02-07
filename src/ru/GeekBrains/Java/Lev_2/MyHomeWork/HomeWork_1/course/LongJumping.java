package ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1.course;

import ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1.team.Participant;

public class LongJumping extends AbstractCourse{
    private float distance = 3.02f;

    public void doIt(Participant participant){
        participant.setPassed(participant.getMaxJumpingDistance() >= distance);
    }
}
