package matrices;

import java.util.Random;


public class Ejercicio13 {

    private int[][] matrix;
    private int size;
    private boolean symmetric;
    private static final int DEFAULT_SIZE = 4;
    private static final int MAX_VALUE = 10;

    public void execute() {
        generateData();
        process();
        print();
    }

    private void generateData() {
        Random random = new Random();
        size = DEFAULT_SIZE;
        matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(MAX_VALUE) + 1;
            }
        }
    }

    private void process() {
        symmetric = true;
        for (int i = 0; i < size && symmetric; i++) {
            for (int j = 0; j < size && symmetric; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                }
            }
        }
    }

    private void print() {
        System.out.println("--- Exercise 13: Symmetric matrix check ---");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Is symmetric: " + symmetric);
        System.out.println("Corners:");
        System.out.println("  Top-left:     " + matrix[0][0]);
        System.out.println("  Top-right:    " + matrix[0][size - 1]);
        System.out.println("  Bottom-left:  " + matrix[size - 1][0]);
        System.out.println("  Bottom-right: " + matrix[size - 1][size - 1]);
    }
}
