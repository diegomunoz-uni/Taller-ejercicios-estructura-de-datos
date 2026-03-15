package arraylist;

import java.util.ArrayList;
import java.util.Random;


public class Ejercicio7 {

    private ArrayList<Integer> list;
    private static final int TOTAL = 20;
    private static final int INSERT_BOUND = 50;

    public void execute() {
        generateData();
        print("Initial ArrayList");
        insertInOrder();
        deleteRandom();
    }

    private void generateData() {
        list = new ArrayList<>();
        for (int i = 1; i <= TOTAL; i++) {
            list.add(i * 2);
        }
    }

    private void insertInOrder() {
        Random random = new Random();
        int value = random.nextInt(INSERT_BOUND) + 1;
        int position = findInsertPosition(value);
        list.add(position, value);
        System.out.println("Inserted value: " + value + " at position: " + position);
        print("ArrayList after insertion");
    }

    private int findInsertPosition(int value) {
        for (int i = 0; i < list.size(); i++) {
            if (value <= list.get(i)) return i;
        }
        return list.size();
    }

    private void deleteRandom() {
        Random random = new Random();
        int index = random.nextInt(list.size());
        int removed = list.remove(index);
        System.out.println("Removed value: " + removed + " from position: " + index);
        print("ArrayList after deletion");
    }

    private void print(String label) {
        System.out.println("--- Exercise 7: " + label + " ---");
        System.out.println(list);
    }
}
