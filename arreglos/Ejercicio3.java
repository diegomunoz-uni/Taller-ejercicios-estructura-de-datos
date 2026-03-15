package arreglos;

import java.util.Random;


public class Ejercicio3 {

    private int[] numbers;
    private long[] factorials;
    private static final int N = 10;
    private static final int MAX_VALUE = 12;

    public void execute() {
        generateData();
        process();
        print();
    }

    private void generateData() {
        Random random = new Random();
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = random.nextInt(MAX_VALUE) + 1;
        }
    }

    private void process() {
        factorials = new long[N];
        for (int i = 0; i < N; i++) {
            factorials[i] = factorial(numbers[i]);
        }
    }

    private long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    private void print() {
        System.out.println("--- Exercise 3: Numbers and their factorials ---");
        System.out.print("Numbers:    ");
        for (int number : numbers) {
            System.out.printf("%8d", number);
        }
        System.out.println();
        System.out.print("Factorials: ");
        for (long fact : factorials) {
            System.out.printf("%8d", fact);
        }
        System.out.println();
    }
}
