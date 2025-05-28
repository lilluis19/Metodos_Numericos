public class Ejercicio1 {
    public static void main(String[] args) {
        double[][] A = {
            {1, 2, 1},
            {1, 0, 1},
            {0, 1, 2}
        };
        double[] b = {0, 2, 1};

        double[] xyz = gaussElimination(A, b);
        System.out.println("Solución del sistema de ecuaciones:");
        System.out.println("x = " + xyz[0]);
        System.out.println("y = " + xyz[1]);
        System.out.println("z = " + xyz[2]);
    }

    public static double[] gaussElimination(double[][] A, double[] b) {
        int n = A.length;

        // Eliminación hacia adelante
        for (int k = 0; k < n - 1; k++) {
            for (int i = k + 1; i < n; i++) {
                double factor = A[i][k] / A[k][k];
                for (int j = k; j < n; j++) {
                    A[i][j] -= factor * A[k][j];
                }
                b[i] -= factor * b[k];
            }
        }

        // Sustitución hacia atrás
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
