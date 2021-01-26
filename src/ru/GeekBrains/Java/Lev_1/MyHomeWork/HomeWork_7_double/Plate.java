package ru.GeekBrains.Java.Lev_1.MyHomeWork.HomeWork_7_double;

public class Plate {
    private int size;
    private int food;

    public Plate(int food) {
        this.food = food;
        this.size = 100;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n) {
        food -= n;
        if (food < 0){
            food = 0;
        }
    }

    public void addFood(int n) {
        food += n;
        if (food > size){
            food = size;
        }
    }

    public void info(){
        System.out.printf("There are %d g of food in this plate. %n", food);
    }
}