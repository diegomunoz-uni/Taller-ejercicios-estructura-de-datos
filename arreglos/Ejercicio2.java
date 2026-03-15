package arreglos;


public class Ejercicio2 {

    private int[] evens;
    private static final int TOTAL = 100;
    private static final int PER_LINE = 10;

    public void execute() {
        generateData();
        printSingleLine();
        printByLines();
    }

    private void generateData() {
        evens = new int[TOTAL];
        for (int i = 0; i < TOTAL; i++) {
            evens[i] = (i + 1) * 2;
        }
    }

    private void printSingleLine() {
        System.out.println("--- Exercise 2: First 100 even numbers (single line) ---");
        for (int i = 0; i < TOTAL; i++) {
            System.out.print(evens[i]);
            if (i < TOTAL - 1) System.out.print(", ");
        }
        System.out.println();
    }

    private void printByLines() {
        System.out.println("--- Exercise 2: First 100 even numbers (10 lines) ---");
        for (int line = 0; line < PER_LINE; line++) {
            System.out.print("Line " + (line + 1) + ": ");
            for (int col = 0; col < PER_LINE; col++) {
                int index = line * PER_LINE + col;
                System.out.print(evens[index]);
                if (col < PER_LINE - 1) System.out.print(", ");
            }
            System.out.println();
        }
    }
}
