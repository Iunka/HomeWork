package ru.GeekBrains.Java.Lev_1.MyHomeWork.HomeWork_6;

public class Animal {
    protected String name;
    private int limitRun;
    private int limitSwim;

    public Animal(String name) {
        this.name = name;
    }

    public int getLimitRun() {
        return this.limitRun;
    }

    public int getLimitSwim() {
        return this.limitSwim;
    }

    public void run(int longRun) {
        if (longRun > this.limitRun) {
            System.out.println(this.name + " runs " + longRun + " m");
        } else {
            System.out.println("It's so far. Limit for " + this.name + " is " + limitRun);
        }

    }

    protected void swim(int longSwim) {
        if (longSwim > this.limitSwim) {
            System.out.println(this.name + " swims " + longSwim + " m");
        } else {
            System.out.println("It's so far. Limit for " + this.name + " is " + limitSwim);
        }

    }
}
