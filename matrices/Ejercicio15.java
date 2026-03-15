package matrices;

import java.util.Random;


public class Ejercicio15 {

    private int[][] matrix;
    private int rows;
    private int cols;
    private static final int DEFAULT_ROWS = 4;
    private static final int DEFAULT_COLS = 5;
    private static final int MAX_VALUE = 99;

    public void execute() {
        generateData();
        print("Matrix before swap");
        process();
        print("Matrix after swapping row 0 and row 1");
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
    }

    private void process() {
        int[] temp = matrix[0];
        matrix[0] = matrix[1];
        matrix[1] = temp;
    }

    private void print(String label) {
        System.out.println("--- Exercise 15: " + label + " ---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
