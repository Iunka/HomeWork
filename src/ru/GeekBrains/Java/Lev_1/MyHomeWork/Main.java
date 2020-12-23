package ru.GeekBrains.Java.Lev_1.MyHomeWork;

import java.sql.SQLOutput;

public class Main {

    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main()
    public static void main(String[] args) {

    //2. Создать переменные всех пройденных типов данных и инициализировать их значения
        byte by = 127;
        short sh = 30766;
        int i = 56789;
        long l = 200300400;
        float f = 1.45f;
        double dou = 2.55555;
        char ch = 'x';
        String s = "string";
        boolean boo = true;

    //3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат
    //   где a, b, c, d – аргументы этого метода, имеющие тип float.

        System.out.println(doCompute(1.0f, 2.0f, 3.0f, 4.0f));

    //4. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    // в противном случае – false.

        System.out.println(checkSum(2, 7));

    //5. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом

        isPositiveOrNegative(10);

    //6. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

        System.out.println(isNegative(50));

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

        doHello("Max");

    //8. * Написать метод, который определяет, является ли год високосным,
    // и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го,
    // при этом каждый 400-й – високосный.
        checkLeap(100);


        }

        //#3
    static float doCompute(float a, float b, float c, float d){
        return (a * (b + (c / d)));
    }

        //#4
    static boolean checkSum(int first, int second){
        return ((first+second)>10 && (first+second)<20);
    }

        //#5
    static void isPositiveOrNegative(int x){
        if (x < 0){
            System.out.println("x is negative");
        } else {
            System.out.println("x is positive");
        }
    }

        //#6
    static boolean isNegative(int y){
        return y < 0;
    }

        //#7
    static void doHello(String name){
        System.out.println("Привет, " + name + "!");
    }

        //#8
    static void checkLeap(int year){
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Этот год високосный.");
        } else {
            System.out.println("Этот год не високосный.");
        }
    }

}
