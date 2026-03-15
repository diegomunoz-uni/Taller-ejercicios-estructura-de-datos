import arreglos.*;
import arraylist.*;
import matrices.*;

/**
 * Main entry point for the Linear Structures Workshop.
 * Executes all 15 exercises grouped by category.
 */
public class Main {

    public static void main(String[] args) {

        printHeader("LINEAR STRUCTURES WORKSHOP - JAVA");

        printSection("ARRAYS");
        new Ejercicio1().execute();
        new Ejercicio2().execute();
        new Ejercicio3().execute();
        new Ejercicio4().execute();
        new Ejercicio5().execute();

        printSection("ARRAYLIST");
        new Ejercicio6().execute();
        new Ejercicio7().execute();
        new Ejercicio8().execute();
        new Ejercicio9().execute();
        new Ejercicio10().execute();

        printSection("MATRICES");
        new Ejercicio11().execute();
        new Ejercicio12().execute();
        new Ejercicio13().execute();
        new Ejercicio14().execute();
        new Ejercicio15().execute();

        System.out.println("\n==========================================");
        System.out.println("  END OF WORKSHOP");
        System.out.println("==========================================");
    }

    private static void printHeader(String title) {
        System.out.println("==========================================");
        System.out.println("  " + title);
        System.out.println("==========================================");
    }

    private static void printSection(String section) {
        System.out.println("\n==========================================");
        System.out.println("  SECTION: " + section);
        System.out.println("==========================================\n");
    }
}
