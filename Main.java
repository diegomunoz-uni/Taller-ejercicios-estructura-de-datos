import arreglos.*;
import arraylist.*;
import matrices.*;
import java.util.Scanner;

/**
 * Main entry point for the Linear Structures Workshop.
 * Displays a menu to select and run each exercise individually.
 */
public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option = -1;
        while (option != 0) {
            printMenu();
            option = readOption();
            runExercise(option);
        }
        System.out.println("Goodbye.");
        scanner.close();
    }

    private static void printMenu() {
        System.out.println();

        System.out.println("   LINEAR STRUCTURES WORKSHOP - MENU");

        System.out.println("  -- ARRAYS --");
        System.out.println("  1.  First 10 prime numbers");
        System.out.println("  2.  First 100 even numbers");
        System.out.println("  3.  Factorials of random numbers");
        System.out.println("  4.  Min and max (-50 to 50)");
        System.out.println("  5.  Reverse each number");
        System.out.println("  -- ARRAYLIST --");
        System.out.println("  6.  ArrayList until 10 is read");
        System.out.println("  7.  Even numbers, insert and delete");
        System.out.println("  8.  Frequency table");
        System.out.println("  9.  Sort and separate evens/odds");
        System.out.println("  10. Football matches");
        System.out.println("  -- MATRICES --");
        System.out.println("  11. Search in matrix");
        System.out.println("  12. Anti-diagonal sum");
        System.out.println("  13. Symmetric matrix check");
        System.out.println("  14. Matrix transpose");
        System.out.println("  15. Swap first and second row");
        System.out.println("------------------------------------------");
        System.out.println("  0.  Exit");
        System.out.println("==========================================");
        System.out.print("Select an option: ");
    }

    private static int readOption() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void runExercise(int option) {
        switch (option) {
            case 1:
                new Ejercicio1().execute();
                break;
            case 2:
                new Ejercicio2().execute();
                break;
            case 3:
                new Ejercicio3().execute();
                break;
            case 4:
                new Ejercicio4().execute();
                break;
            case 5:
                new Ejercicio5().execute();
                break;
            case 6:
                new Ejercicio6().execute();
                break;
            case 7:
                new Ejercicio7().execute();
                break;
            case 8:
                new Ejercicio8().execute();
                break;
            case 9:
                new Ejercicio9().execute();
                break;
            case 10:
                new Ejercicio10().execute();
                break;
            case 11:
                new Ejercicio11().execute();
                break;
            case 12:
                new Ejercicio12().execute();
                break;
            case 13:
                new Ejercicio13().execute();
                break;
            case 14:
                new Ejercicio14().execute();
                break;
            case 15:
                new Ejercicio15().execute();
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
    }
}