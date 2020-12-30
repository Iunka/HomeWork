package ru.GeekBrains.Java.Lev_1.MyHomeWork;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_3 {
    /*
    1. Написать программу, которая загадывает случайное число от 0 до 9
    и пользователю дается 3 попытки угадать это число.
    При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
    чем загаданное, или меньше. После победы или проигрыша выводится запрос –
    «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */


    static int limitNumber = 9;
    static int tryNumber = 3;



    public static void main(String[] args){


        System.out.printf("Привет! Добро пожаловать в игру \"Угадай число\"! Я загадаю число от 0 до %d, а твоя задача - отгадать его. Поехали!", limitNumber);
        playGame();


    }

    static void playGame(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guessNumber;

        do {
            int randomNumber = random.nextInt(10);
            for (int i = 0; i < tryNumber; i++) {
                System.out.printf("Введите число от 0 до %d.....", limitNumber);
                guessNumber = scanner.nextInt();

                if (guessNumber == randomNumber) {
                    System.out.printf(" Победа! Вы угадали! ");
                    break;
                }
                if (guessNumber > randomNumber) {
                    System.out.printf(" Загаданное число меньше. Попробуйте ещё раз, у вас %d попытки.", (tryNumber - 1 - i));
                } else {
                    System.out.printf(" Загаданное число больше. Попробуйте ещё раз, у вас %d попытки.", (tryNumber - 1 - i));
                }

            }

            System.out.printf(" Загаданное число: %d. ", randomNumber);
            System.out.printf(" Повторить игру еще раз? 1 – да / 0 – нет....");
            int returnGame = scanner.nextInt();
            if (returnGame == 0){
            break;
            }

        } while (true);


    }

}
