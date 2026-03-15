package matrices;

import java.util.Random;


public class Ejercicio12 {

    private int[][] matrix;
    private int size;
    private int diagonalSum;
    private static final int DEFAULT_SIZE = 5;
    private static final int LOWER_BOUND = -50;
    private static final int UPPER_BOUND = 50;

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
                matrix[i][j] = random.nextInt(UPPER_BOUND - LOWER_BOUND + 1) + LOWER_BOUND;
            }
        }
    }

    private void process() {
        diagonalSum = 0;
        for (int i = 0; i < size; i++) {
            diagonalSum += matrix[i][size - 1 - i];
        }
    }

    private void print() {
        System.out.println("--- Exercise 12: Matrix " + size + "x" + size + " ---");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Sum of anti-diagonal: " + diagonalSum);
    }
}
