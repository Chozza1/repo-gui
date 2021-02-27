import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework_4 {

    private static char[][] map;
    private static final int SIZE = 5;
    private static final char EMPTY_DOT = '•';
    private static final char X_DOT = 'X';
    private static final char O_DOT = 'O';
    private static Scanner sc;


    public static void main(String[] args) {

        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            System.out.println();
            if (checkWin(X_DOT)) {
                System.out.println("You win");
                break;
            }
            if (checkDraw()) {
                System.out.println("Draw");
                break;
            }
            computerTurn();
            printMap();
            System.out.println();
            if (checkWin(O_DOT)) {
                System.out.println("You lose");
                break;
            }
            if (checkDraw()) {
                System.out.println("Draw");
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {
            }
        }
    }

    private static boolean checkDraw() {
        for (char[] chars : map) {
            for (char aChar : chars) {
                if (aChar == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkLine(int start_x, int start_y, int dx, int dy, char с) {
        for (int i = 0; i < SIZE-1; i++) {
            if (map[start_x + i * dx][start_y + i * dy] != с)
                return false;
        }
        return true;
    }

    public static boolean checkWin(char с) {
        for (int i = 0; i < SIZE; i++) {
            // строки
            if (checkLine(i, 0, 0, 1, с)) return true;
            // столбцы
            if (checkLine(0, i, 1, 0, с)) return true;
        }
        //диагонали
        if (checkLine(0, 0, 1, 1, с)) return true;
        if (checkLine(0, SIZE - 1, 1, -1, с)) return true;
        return false;
    }

    public static boolean checkWinTurn(char с) {
        for (int i = 0; i < SIZE; i++) {
            if (checkLineTurn(i, 0, 0, 1, с)) return true;
            if (checkLineTurn(0, i, 1, 0, с)) return true;
        }
        if (checkLineTurn(0, 0, 1, 1, с)) return true;
        if (checkLineTurn(0, SIZE - 1, 1, -1, с)) return true;
        return false;
    }

    public static boolean checkLineTurn(int start_x, int start_y, int dx, int dy, char с) {
        for (int i = 0; i < SIZE-2; i++) {
            if (map[start_x + i * dx][start_y + i * dy] != с)
                return false;
        }
        return true;
    }

    private static void computerTurn() {
        int xCoordinate;
        int yCoordinate;
        do {
            if (checkWinTurn(X_DOT)){
                xCoordinate =

            }
            Random random = new Random();
            xCoordinate = random.nextInt(SIZE);
            yCoordinate = random.nextInt(SIZE);
        } while (!isValidCell(xCoordinate, yCoordinate));
        map[yCoordinate][xCoordinate] = O_DOT;
    }

    private static void humanTurn() {
        int xCoordinate = -1;
        int yCoordinate = -1;
        do {
            System.out.println("Введите координаты в формате x y");
            if (sc.hasNextInt()) {
                xCoordinate = sc.nextInt() - 1;
            }
            if (sc.hasNextInt()) {
                yCoordinate = sc.nextInt() - 1;
            }
            sc.nextLine();
        } while (!isValidCell(xCoordinate, yCoordinate));
        map[yCoordinate][xCoordinate] = X_DOT;
    }

    private static boolean isValidCell(int x, int y) {
        if (x < 0 || y < 0 || x > map.length - 1 || y > map.length - 1) {
            return false;
        }
        return map[y][x] == EMPTY_DOT;
    }

    private static void printMap() {
        for (char[] chars : map) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }

    private static void initMap() {
        sc = new Scanner(System.in);
        map = new char[SIZE][SIZE];
        for (char[] chars : map) {
            Arrays.fill(chars, EMPTY_DOT);
        }
    }
}
