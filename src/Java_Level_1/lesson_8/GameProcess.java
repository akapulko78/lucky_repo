package Java_Level_1.lesson_8;

import java.util.Random;
import java.util.Scanner;

public class GameProcess {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    private static final int SIZE = 5;
    private static final int DOTS_TO_WIN = 4;
    private static final char DOT_X = 'x';
    private static final char DOT_O = 'O';
    private static final char DOT_EMPTY = '.';
    private static final char[] players = new char[]{DOT_X, DOT_O};

    private static int lastRow; // последний ход человека
    private static int lastCol; // последний ход человека

    private static char[][] map;
    private static int emptyFields;


//    public static void main(String[] args) { // #1
//        initMap(); // #2
//        game(); // #3
//    }


    void game() {
        while (true) {
            for (char player : players) {
                if (isFilled()) {
                    System.out.println("draw!");
                    return;
                } else if (turn(player)) {
                    System.out.format("%s win %n", player);
                    return;
                }
            }
        }
    }

    private static boolean turn(char value) {
        switch (value) {
            case DOT_X:
                humanStep();
                break;
            case DOT_O:
                aiStep();
                break;
            default:
                System.out.println("unknown player");
        }
        printMap();
        --emptyFields;
        return hasWinner(value);
    }

    private static void printMap() {
        for (char[] row : map) {
            for (char item : row) {
                System.out.print(" " + item);
            }
            System.out.println();
        }
    }

    void initMap() { // #2.1
        map = new char[SIZE][SIZE];
        emptyFields = SIZE * SIZE;
        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map.length; column++) {
                map[row][column] = DOT_EMPTY;
                //System.out.print(" " + DOT_EMPTY);
            }
            //System.out.println();
        }
    }

    private static boolean isFilled() {
        return emptyFields <= 0;
    }

    private static void aiStep() {
        int row;
        int column;
        if (onMap(lastRow, lastCol - 1) && map[lastRow][lastCol - 1] == DOT_X) {
            row = lastRow;
            column = lastCol + 1;
            if (validate(row, column)) {
                map[row][column] = DOT_O;
                lastRow = row;
                lastCol = column;
            }
        }
        if (onMap(lastRow, lastCol + 1) && map[lastRow][lastCol + 1] == DOT_X) {
            row = lastRow;
            column = lastCol - 1;
            if (validate(row, column)) {
                map[row][column] = DOT_O;
                lastRow = row;
                lastCol = column;
            }
        }
        if (onMap(lastRow - 1, lastCol) && map[lastRow - 1][lastCol] == DOT_X) {
            row = lastRow + 1;
            column = lastCol;
            if (validate(row, column)) {
                map[row][column] = DOT_O;
                lastRow = row;
                lastCol = column;
            }
        }
        if (onMap(lastRow + 1, lastCol) && map[lastRow + 1][lastCol] == DOT_X) {
            row = lastRow - 1;
            column = lastCol;
            if (validate(row, column)) {
                map[row][column] = DOT_O;
                lastRow = row;
                lastCol = column;
            }
        }
        if (onMap(lastRow + 1, lastCol + 1) && map[lastRow + 1][lastCol + 1] == DOT_X) {
            row = lastRow - 1;
            column = lastCol - 1;
            if (validate(row, column)) {
                map[row][column] = DOT_O;
                lastRow = row;
                lastCol = column;
            }
        }
        if (onMap(lastRow - 1, lastCol - 1) && map[lastRow - 1][lastCol - 1] == DOT_X) {
            row = lastRow + 1;
            column = lastCol + 1;
            if (validate(row, column)) {
                map[row][column] = DOT_O;
                lastRow = row;
                lastCol = column;
            }
        }

        row = column = SIZE / 2;
        if (!validate(row, column)) {
            map[row][column] = DOT_O;
        } else {
            do {
                row = random.nextInt(SIZE);
                column = random.nextInt(SIZE);
            } while (!validate(row, column));
        }
        System.out.format("Computer moved to %s %s %n", row + 1, column + 1);
        map[row][column] = DOT_O;
    }

    private static void humanStep() { // #3.2.1
        int row;
        int column;
        System.out.println("Please, choose row and column (1-5)");
        do {
            row = scanner.nextInt() - 1;
            column = scanner.nextInt() - 1;
        } while (!validate(row, column));
        lastRow = row; // последний ход человека
        lastCol = column; // последний ход человека
        map[row][column] = DOT_X;

    }


    private static boolean validate(int row, int column) {
        return onMap(row, column) && map[row][column] == DOT_EMPTY;
    }

    private static boolean onMap(int row, int column) {
        return row >= 0 && row < SIZE &&
                column >= 0 && column < SIZE;
    }


    private static boolean hasWinner(char val) {
        boolean row;
        boolean column;
        boolean diagonalLR;
        boolean diagonalRL;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j <= SIZE - DOTS_TO_WIN; j++) { //так как диагональ может начинаться только с 0-го или 1-го эл-та
                row = true;
                column = true;
                diagonalLR = true;
                diagonalRL = true;
                for (int k = 0; k < DOTS_TO_WIN; k++) { //проход по всем элементам диоганали
                    row = row & (map[i][j + k] == val);
                    column = column & (map[j + k][i] == val);
                    if (i <= SIZE - DOTS_TO_WIN) {
                        diagonalLR &= (map[i + k][j + k] == val);
                        diagonalRL &= (map[i + k][SIZE - 1 - j - k] == val);
                    } else {
                        diagonalLR = false;
                        diagonalRL = false;
                    }
                }
                if (row || column || diagonalLR || diagonalRL) return true;
            }
        }
        return false;
    }


}
