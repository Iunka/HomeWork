package ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1;

import ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1.course.Course;
import ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1.course.LongJumping;
import ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1.course.RunningRoad;
import ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1.course.SwimmingPool;
import ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1.team.Participant;
import ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1.team.Team;

public class Main {

    public static void main(String[] args) {

        Team team = new Team(
                "Winners",
                new Participant("Jack", 500, 25, 3.00f),
                new Participant("Gleb", 400, 35, 2.08f),
                new Participant("Ross", 300, 45, 3.50f),
                new Participant("Vlad", 600, 60, 1.80f),
                new Participant("Ted", 250, 30, 3.20f),
                new Participant("Chak", 390, 54, 3.50f)
        );

        Course[] courses = {new RunningRoad(), new SwimmingPool(), new LongJumping()};

        for (int i = 0; i < courses.length; i++) {
            System.out.println("Course: " + courses[i].getClass().getName());
            courses[i].doIt(team);
            team.showAllInfo();
            team.showPassedInfo();

        }


    }
}
