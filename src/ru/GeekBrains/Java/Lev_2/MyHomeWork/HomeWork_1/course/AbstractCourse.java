package ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1.course;

import ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1.team.Participant;
import ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1.team.Team;

public abstract class AbstractCourse implements Course {

    @Override
    public void doIt(Team team){
        Participant[] participants = team.getParticipants();
        for (int i = 0; i < team.getParticipants().length; i++) {
            doIt(team.getParticipants()[i]);
        }
    }

    protected abstract void doIt(Participant participant);
}
