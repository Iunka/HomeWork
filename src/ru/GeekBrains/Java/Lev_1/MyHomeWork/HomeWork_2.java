package ru.GeekBrains.Java.Lev_1.MyHomeWork;

import java.util.Arrays;

public class HomeWork_2 {

    public static void main(String[] args){
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        replaceNumber(array);

        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] array2 = new int[8];
        fillInArray(array2);

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiply(array3);

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] array4 = new int[10][10];
        insertDiagonally(array4);

        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] array5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        findMinMaxArraysNumber(array5);





    }
    //#1
    static void replaceNumber(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

    }

    //#2
    static void fillInArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = i*3;
        }
    }

    //#3
    static void multiply(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] *= 2;
            }
        }
    }

    //#4
    static void insertDiagonally(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (i == j || i == (arr.length - j -1)){
                    arr[j][i] = 1;
                }
            }
        }
    }

    //#5
    static void findMinMaxArraysNumber(int[] arr){
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++)
            if (min > arr[i]) {
                min = arr[i];
            } else if (max < arr[i]) {
                max = arr[i];
            }
    }
}
