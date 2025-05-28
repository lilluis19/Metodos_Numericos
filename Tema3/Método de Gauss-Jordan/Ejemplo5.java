public class Ejercicio5 {
    public static void main(String[] args) {
        double[][] matrix = {
            {1, 1, 1, 9},
            {2, 3, 7, 44},
            {1, 3, 4, 27}
        };

        GaussJordanSolver.resolver(matrix);
    }
}
class GaussJordanSolver {
    public static void resolver(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int k = 0; k < rows; k++) {
            int maxRow = k;
            for (int i = k + 1; i < rows; i++) {
                if (Math.abs(matrix[i][k]) > Math.abs(matrix[maxRow][k])) {
                    maxRow = i;
                }
            }

            double[] temp = matrix[k];
            matrix[k] = matrix[maxRow];
            matrix[maxRow] = temp;

            for (int i = 0; i < rows; i++) {
                if (i != k) {
                    double factor = matrix[i][k] / matrix[k][k];
                    for (int j = k; j < cols; j++) {
                        matrix[i][j] -= factor * matrix[k][j];
                    }
                }
            }

            double divisor = matrix[k][k];
            for (int j = k; j < cols; j++) {
                matrix[k][j] /= divisor;
            }
        }

        System.out.println("Solución del sistema:");
        for (int i = 0; i < rows; i++) {
            System.out.printf("x%d = %.4f\n", i + 1, matrix[i][cols - 1]);
        }
    }
}
