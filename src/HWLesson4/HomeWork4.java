package HWLesson4;

import java.util.Random;
import java.util.Scanner;

/**
 * Выполнил: Осыкин Александр
 * Факультет "Тестирование ПО"
 * Домашнее задание урока 4 (Крестики-нолики)
 */

public class HomeWork4 {

    public static char human = 'X';
    public static char ai = 'O';
    public static char emptyField = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static int mapSizeX;
    public static int mapSizeY;

    public static int winLength;
    public static char[][] map;

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(human)) {
                System.out.println("Человек выиграл!!!");
                break;
            }
            if (isFullMap()) {
                System.out.println("Ничья");
                break;
            }
            System.out.println();
            aiTurn();
            printMap();
            if (checkWin(ai)) {
                System.out.println("Компьютер выиграл!!!");
                break;
            }
            if (isFullMap()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void initMap() {
        mapSizeX = 5;
        mapSizeY = 5;
        winLength = 4;
        map = new char[mapSizeY][mapSizeX];

        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                map[i][j] = emptyField;
            }
        }
    }

    public static void printMap() {
        System.out.print(" ");
        for (int i = 0; i < mapSizeX * 2 + 1; i++) { // координаты сверху
            System.out.print((i % 2 == 0) ? " " : i / 2 + 1);
        }
        System.out.println();

        for (int i = 0; i < mapSizeY; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < mapSizeX; j++) {
                System.out.print(map[i][j] + "|");
            }
            System.out.println();
        }
        System.out.print(" ");
        for (int i = 0; i < mapSizeX * 2 + 1; i++) { // координаты снизу
            System.out.print((i % 2 == 0) ? " " : i / 2 + 1);
        }
        System.out.println();
        for (int i = 0; i < mapSizeX * 2 + 2; i++) {
            System.out.print("-");
        }

        System.out.println();

    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите ваши координаты (Х,У): ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        map[y][x] = human;
    }

    public static void aiTurn() {
        if (turnAIWinCell()) {
            return;
        }
        if (turnHumanWinCell()) {
            return;
        }
        int x;
        int y;
        do {
            x = random.nextInt(mapSizeX);
            y = random.nextInt(mapSizeY);
        } while (!isEmptyCell(x, y));
        map[y][x] = ai;
    }

    public static boolean turnAIWinCell() {
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (isEmptyCell(j, i)) {
                    map[i][j] = ai;
                    if (checkWin(ai)) {
                        return true;
                    }
                    map[i][j] = emptyField;
                }
            }
        }
        return false;
    }


    public static boolean turnHumanWinCell() {
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (isEmptyCell(j, i)) {
                    map[i][j] = human;
                    if (checkWin(human)) {
                        map[i][j] = ai;
                        return true;
                    }
                    map[i][j] = emptyField;
                }
            }
        }
        return false;
    }

    // Проверка на победу
    public static boolean checkWin(char c) {
        for (int i = 0; i < mapSizeX; i++) {
            for (int j = 0; j < mapSizeY; j++) {
                if (checkLine(i, j, 1, 0, winLength, c)) {
                    return true;
                }
                if (checkLine(i, j, 1, 1, winLength, c)) {
                    return true;
                }
                if (checkLine(i, j, 0, 1, winLength, c)) {
                    return true;
                }
                if (checkLine(i, j, 1, -1, winLength, c)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Проверка линии
    public static boolean checkLine(int x, int y, int vx, int vy, int len, char c) {
        final int farX = x + (len - 1) * vx;
        final int farY = y + (len - 1) * vy;
        if (!isValidCell(farX, farY)) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (map[y + i * vy][x + i * vx] != c) {
                return false;
            }
        }
        return true;
    }

    public static boolean isFullMap() {
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (map[i][j] == emptyField) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidCell(int x, int y) {
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    public static boolean isEmptyCell(int x, int y) {
        return map[y][x] == emptyField;
    }
}
