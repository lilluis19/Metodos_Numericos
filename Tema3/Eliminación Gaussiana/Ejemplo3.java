public class Ejercicio3 {
    public static void main(String[] args) {
        double[][] A = {
            {3, 2, -4},
            {2, 3, 3},
            {5, -3, 1}
        };
        double[] b = {3, 15, 14};

        double[] x = gaussElimination(A, b);
        System.out.println("Solución del sistema de ecuaciones:");
        System.out.println("x = " + x[0]);
        System.out.println("y = " + x[1]);
        System.out.println("z = " + x[2]);
    }

    public static double[] gaussElimination(double[][] A, double[] b) {
        int n = A.length;

        for (int k = 0; k < n - 1; k++) {
            for (int i = k + 1; i < n; i++) {
                double factor = A[i][k] / A[k][k];
                for (int j = k; j < n; j++) {
                    A[i][j] -= factor * A[k][j];
                }
                b[i] -= factor * b[k];
            }
        }

        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum += A[i][j] * x[j];
            }
            x[i] = (b[i] - sum) / A[i][i];
        }

        return x;
    }
}
