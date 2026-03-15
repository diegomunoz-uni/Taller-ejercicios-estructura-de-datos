package arraylist;

import java.util.ArrayList;
import java.util.Random;


public class Ejercicio6 {

    private ArrayList<Integer> numbers;
    private int sum;
    private double average;
    private static final int LOWER_BOUND = -10;
    private static final int UPPER_BOUND = 10;
    private static final int STOP_VALUE = 10;

    public void execute() {
        generateData();
        process();
        print();
    }

    private void generateData() {
        Random random = new Random();
        numbers = new ArrayList<>();
        int value;
        do {
            value = random.nextInt(UPPER_BOUND - LOWER_BOUND + 1) + LOWER_BOUND;
            numbers.add(value);
        } while (value != STOP_VALUE);
    }

    private void process() {
        sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        average = numbers.isEmpty() ? 0 : (double) sum / numbers.size();
    }

    private void print() {
        System.out.println("--- Exercise 6: ArrayList until 10 is read ---");
        System.out.println("Numbers: " + numbers);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
    }
}
