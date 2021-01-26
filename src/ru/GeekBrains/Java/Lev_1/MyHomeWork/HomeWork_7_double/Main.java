package ru.GeekBrains.Java.Lev_1.MyHomeWork.HomeWork_7_double;


public class Main {
    public static void main(String[] args){
        Cat cat1 = new Cat("Barsik", 20);
        Cat cat2 = new Cat("Kuz'ma", 60);
        Cat cat3 = new Cat("Murzik", 60);

        Plate plate = new Plate(100);
        Cat[] cats = {
                cat1,
                cat2,
                cat3
        };

        plate.info();

        for (int i = 0; i < cats.length; i++){
           cats[i].eat(plate);
           cats[i].satietyInfo(cats[i]);
        }

        plate.info();
    }

}
