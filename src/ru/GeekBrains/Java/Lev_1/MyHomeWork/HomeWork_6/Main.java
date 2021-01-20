package ru.GeekBrains.Java.Lev_1.MyHomeWork.HomeWork_6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //1. Создать классы Собака и Кот с наследованием от класса Животное.

        //2. Все животные могут бежать и плыть.
        // В качестве параметра каждому методу передается длина препятствия.
        // Результатом выполнения действия будет печать в консоль.
        // (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');

        //3. У каждого животного есть ограничения на действия
        // (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).

        //4. * Добавить подсчет созданных котов, собак и животных.


        Random random = new Random();

        Cat cat1 = new Cat("Barsik");
        cat1.run(90);
        cat1.swim(250);

        Cat cat2 = new Cat("Kuz'ma");
        cat2.run(50);
        cat2.swim(1);

        Dog dog1 = new Dog("bobik");
        dog1.run(30);
        dog1.swim(20);

        Dog dog2 = new Dog("sharik");
        dog2.run(400);
        dog2.swim(5);

    }
}