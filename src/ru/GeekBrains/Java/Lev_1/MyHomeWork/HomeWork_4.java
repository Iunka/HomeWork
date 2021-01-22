package ru.GeekBrains.Java.Lev_1.MyHomeWork;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_4 {

    public static void main(String[] args) {
        TicTacToe(5);
    }

    static void TicTacToe(int size) {
        char[][] field = getField(size);

        do {
            handlePlayerMove(field);
            drawField(field);

            if (checkFinal(field, 'X')) {
                break;
            }

            System.out.println();

            handleAIMove(field);
            drawField(field);

            if (checkFinal(field, 'O')) {
                break;
            }

        } while (true);
    }

    static boolean checkFinal(char[][] field, char sign) {
        if (checkWin(field, sign, 5)) {
            String name = sign == 'X' ? "Player" : "Computer";
            System.out.printf("Congrats!!! %s is winner!%n", name);
            return true;
        }
        if (isDraw(field)) {
            System.out.println("There is draw!!!");
            return true;
        }
        return false;
    }

    static boolean isDraw(char[][] field) {
        int moves = field.length * field.length;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != emptySymbol()) {
                    moves--;
                }
            }
        }

        return moves == 0;
    }

    static boolean checkWin(char[][] field, char sign, int winningStreak) {
        // horizontal
        int countSign;
        for (int i = 0; i < field.length; i++) {
            countSign = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == sign) {
                    countSign++;
                }
            }
        if (countSign == winningStreak)
            return true;
        }


        // vertical
        for (int i = 0; i < field.length; i++) {
            countSign = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[j][i] == sign) {
                    countSign++;
                }
            }
            if (countSign == winningStreak)
                return true;
        }

        // diagonals
        for (int i = 0; i < field.length; i++) {
            countSign = 0;
            if (field[i][i] == sign) {
                countSign++;
            }
            if (countSign == winningStreak)
                return true;
        }

        for (int i = 0; i < field.length; i++) {
            countSign = 0;
            for (int j = field.length-1; j <= 0; j--) {
                if (field[i][j] == sign) {
                    countSign++;
                }
            }
            if (countSign == winningStreak)
                return true;
        }
        return false;
    }

    static void handleAIMove(char[][] field) {
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(field.length);
            y = random.nextInt(field.length);
        } while (isEmptyCoordinates(field, x, y));
        field[x][y] = 'O';
    }

    static void handlePlayerMove(char[][] field) {
        int x, y;
        do {
            System.out.println("Please choose coordinates [X, Y]...");
            x = chooseCoordinate('X');
            y = chooseCoordinate('Y');
        } while (isEmptyCoordinates(field, x, y));
        field[x][y] = 'X';
    }

    static boolean isEmptyCoordinates(char[][] field, int x, int y) {
        return field[x][y] != emptySymbol();
    }

    static int chooseCoordinate(char sign) {
        Scanner scanner = new Scanner(System.in);
        int coordinate;

        do {
            System.out.printf("Please enter %s-coordinate [Range 1..3]...%n", sign);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate > 2);

        return coordinate;
    }

    static char[][] getField(int size) {
        char[][] field = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = emptySymbol();
            }
        }
        return field;
    }

    static char emptySymbol() {
        return '-';
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

}