package matrices;


public class Ejercicio14 {

    private int[][] original;
    private int[][] transposed;
    private int rows;
    private int cols;

    public void execute() {
        generateData();
        process();
        print();
    }

    private void generateData() {
        rows = 3;
        cols = 4;
        original = new int[][] {
            { 1,  2,  3,  4 },
            { 5,  6,  7,  8 },
            { 9, 10, 11, 12 }
        };
    }

    private void process() {
        transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = original[i][j];
            }
        }
    }

    private void print() {
        System.out.println("--- Exercise 14: Matrix transpose ---");
        System.out.println("Original matrix (" + rows + "x" + cols + "):");
        printMatrix(original, rows, cols);
        System.out.println("Transposed matrix (" + cols + "x" + rows + "):");
        printMatrix(transposed, cols, rows);
    }

    private void printMatrix(int[][] matrix, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
