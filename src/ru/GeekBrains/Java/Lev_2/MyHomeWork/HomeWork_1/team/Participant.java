package ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1.team;

import ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_1.course.AbstractCourse;

public class Participant {
    private String name;
    private boolean isPassed;
    private int maxRunningDistance;
    private int maxSwimmingDistance;
    private float maxJumpingDistance;

    public Participant(String name, int maxRunningDistance, int maxSwimmingDistance, float maxJumpingDistance) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxSwimmingDistance = maxSwimmingDistance;
        this.maxJumpingDistance = maxJumpingDistance;
    }

    public int getMaxRunningDistance() {
        return maxRunningDistance;
    }

    public int getMaxSwimmingDistance() {
        return maxSwimmingDistance;
    }

    public float getMaxJumpingDistance() {
        return maxJumpingDistance;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", isPassed=" + isPassed +
                ", maxRunningDistance=" + maxRunningDistance +
                ", maxSwimmingDistance=" + maxSwimmingDistance +
                ", maxJumpingDistance=" + maxJumpingDistance +
                '}';
    }
}
