package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Ejercicio9 {

    private ArrayList<Integer> original;
    private ArrayList<Integer> ascending;
    private ArrayList<Integer> descending;
    private ArrayList<Integer> evens;
    private ArrayList<Integer> odds;
    private static final int TOTAL = 20;
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;

    public void execute() {
        generateData();
        process();
        print();
    }

    private void generateData() {
        Random random = new Random();
        original = new ArrayList<>();
        for (int i = 0; i < TOTAL; i++) {
            original.add(random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE);
        }
    }

    private void process() {
        ascending = new ArrayList<>(original);
        Collections.sort(ascending);

        descending = new ArrayList<>(ascending);
        Collections.reverse(descending);

        evens = new ArrayList<>();
        odds = new ArrayList<>();
        for (int number : original) {
            if (number % 2 == 0) {
                evens.add(number);
            } else {
                odds.add(number);
            }
        }
    }

    private void print() {
        System.out.println("--- Exercise 9: Sorting and separation ---");
        System.out.println("Original:   " + original);
        System.out.println("Ascending:  " + ascending);
        System.out.println("Descending: " + descending);
        System.out.println("Evens:      " + evens);
        System.out.println("Odds:       " + odds);
    }
}
