package arreglos;


public class Ejercicio1 {

    private int[] primes;
    private static final int TOTAL = 10;

    public void execute() {
        generateData();
        print();
    }

    private void generateData() {
        primes = new int[TOTAL];
        int count = 0;
        int candidate = 2;
        while (count < TOTAL) {
            if (isPrime(candidate)) {
                primes[count] = candidate;
                count++;
            }
            candidate++;
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    private void print() {
        System.out.println("--- Exercise 1: First 10 prime numbers ---");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println();
    }
}
