package arreglos;

import java.util.Random;


public class Ejercicio5 {

    private int[] original;
    private int[] reversed;
    private static final int TOTAL = 20;
    private static final int MAX_VALUE = 9999;
    private static final int MIN_VALUE = 1000;

    public void execute() {
        generateData();
        process();
        print();
    }

    private void generateData() {
        Random random = new Random();
        original = new int[TOTAL];
        for (int i = 0; i < TOTAL; i++) {
            original[i] = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
        }
    }

    private void process() {
        reversed = new int[TOTAL];
        for (int i = 0; i < TOTAL; i++) {
            reversed[i] = reverseNumber(original[i]);
        }
    }

    private int reverseNumber(int number) {
        int result = 0;
        int n = Math.abs(number);
        while (n != 0) {
            result = result * 10 + n % 10;
            n /= 10;
        }
        return number < 0 ? -result : result;
    }

    private void print() {
        System.out.println("--- Exercise 5: Original and reversed numbers ---");
        System.out.print("Original: ");
        for (int number : original) {
            System.out.printf("%6d", number);
        }
        System.out.println();
        System.out.print("Reversed: ");
        for (int number : reversed) {
            System.out.printf("%6d", number);
        }
        System.out.println();
    }
}
