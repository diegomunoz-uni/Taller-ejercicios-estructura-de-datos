package matrices;

import java.util.Random;


public class Ejercicio11 {

    private int[][] matrix;
    private int rows;
    private int cols;
    private int target;
    private static final int DEFAULT_ROWS = 4;
    private static final int DEFAULT_COLS = 5;
    private static final int MAX_VALUE = 50;

    public void execute() {
        generateData();
        print();
        search();
    }

    private void generateData() {
        Random random = new Random();
        rows = DEFAULT_ROWS;
        cols = DEFAULT_COLS;
        matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(MAX_VALUE) + 1;
            }
        }
        target = random.nextInt(MAX_VALUE) + 1;
    }

    private void search() {
        System.out.println("--- Exercise 11: Searching for " + target + " ---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Found " + target + " at row " + i + ", column " + j);
                    return;
                }
            }
        }
        System.out.println("The number " + target + " was not found in the matrix.");
    }

    private void print() {
        System.out.println("--- Exercise 11: Matrix " + rows + "x" + cols + " ---");
        printMatrix(matrix, rows, cols);
    }

    private void printMatrix(int[][] m, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%4d", m[i][j]);
            }
            System.out.println();
        }
    }
}
