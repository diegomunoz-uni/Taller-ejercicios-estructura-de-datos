package arreglos;

import java.util.Random;


public class Ejercicio4 {

    private int[] numbers;
    private int min;
    private int max;
    private static final int TOTAL = 25;
    private static final int LOWER_BOUND = -50;
    private static final int UPPER_BOUND = 50;

    public void execute() {
        generateData();
        process();
        print();
    }

    private void generateData() {
        Random random = new Random();
        numbers = new int[TOTAL];
        for (int i = 0; i < TOTAL; i++) {
            numbers[i] = random.nextInt(UPPER_BOUND - LOWER_BOUND + 1) + LOWER_BOUND;
        }
    }

    private void process() {
        min = numbers[0];
        max = numbers[0];
        for (int number : numbers) {
            if (number < min) min = number;
            if (number > max) max = number;
        }
    }

    private void print() {
        System.out.println("--- Exercise 4: Min and Max from -50 to 50 ---");
        System.out.print("Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
