package ru.GeekBrains.Java.Lev_1.MyHomeWork.HomeWork_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public void eat(Plate p){
        if (p.getFood() >= appetite){
            p.decreaseFood(appetite);
            satiety = true;
        }
    }

    public void satietyInfo(Cat cat){
        if (satiety == true){
            System.out.println(cat.name + " is satiety.");
        } else {
            System.out.println(cat.name + " is not satiety.");
        }
    }
}
