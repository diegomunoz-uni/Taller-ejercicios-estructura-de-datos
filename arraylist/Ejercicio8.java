package arraylist;

import java.util.ArrayList;
import java.util.Random;


public class Ejercicio8 {

    private ArrayList<Integer> numbers;
    private int[] frequency;
    private int mostFrequent;
    private static final int TOTAL = 100;
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 20;

    public void execute() {
        generateData();
        process();
        print();
    }

    private void generateData() {
        Random random = new Random();
        numbers = new ArrayList<>();
        for (int i = 0; i < TOTAL; i++) {
            numbers.add(random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE);
        }
    }

    private void process() {
        frequency = new int[MAX_VALUE + 1];
        for (int number : numbers) {
            frequency[number]++;
        }
        mostFrequent = findMostFrequent();
    }

    private int findMostFrequent() {
        int maxFreq = 0;
        int result = MIN_VALUE;
        for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {
            if (frequency[i] > maxFreq) {
                maxFreq = frequency[i];
                result = i;
            }
        }
        return result;
    }

    private void print() {
        System.out.println("--- Exercise 8: Frequency table (1 to 20) ---");
        System.out.printf("%-10s %-10s%n", "Number", "Frequency");
        System.out.println("--------------------");
        for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {
            System.out.printf("%-10d %-10d%n", i, frequency[i]);
        }
        System.out.println("--------------------");
        System.out.println("Most frequent number: " + mostFrequent
                + " (appears " + frequency[mostFrequent] + " times)");
    }
}
