import java.util.Random;
import java.util.Scanner;

public class Main {

    private final static int SIZE = 6;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        matrixArray(colors);
        System.out.println("Обычная матрица");
        printArray(colors);
        System.out.println("Перевернутая матрица");
        printArray(rotateArray(colors));
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", array[i][j]);
            }
            System.out.println();

        }

    }

    private static int[][] rotateArray(int[][] array) {
        int[][] rotatedColors = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[j][SIZE - i - 1] = array[i][j];

            }
        }
        return rotatedColors;
    }

    private static void matrixArray(int[][] colors){
        Random random = new Random();
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
    }
}

