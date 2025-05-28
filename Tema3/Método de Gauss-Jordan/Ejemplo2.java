public class Ejercicio2 {
    public static void main(String[] args) {
        double[][] matrix = {
            {2, 3, -1, 5},
            {4, 4, -3, 3},
            {2, -3, 1, -1}
        };

        gaussJordan(matrix);
        imprimirResultado(matrix);
    }

    public static void gaussJordan(double[][] matrix) {
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
    }

    public static void imprimirResultado(double[][] matrix) {
        System.out.println("La matriz en su forma escalonada reducida por filas es:");
        for (double[] row : matrix) {
            for (double value : row) {
                if (Math.abs(value - (int)value)
