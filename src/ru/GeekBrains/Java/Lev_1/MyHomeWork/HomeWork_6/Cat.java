package ru.GeekBrains.Java.Lev_1.MyHomeWork.HomeWork_6;

public class Cat extends Animal {
    int limitRun = 200;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void swim(int longSwim) {
        System.out.println(this.name + " cannot swim");
    }


}
