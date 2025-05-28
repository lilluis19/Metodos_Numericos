public class Ejercicio2 {
    public static void main(String[] args) {
        double[][] coeficientes = {
            {10, -1, 2},
            {-1, 11, -1},
            {2, -1, 10}
        };
        double[] terminosIndependientes = {6, 25, -11};
        double[] solucion = resolverSistema(coeficientes, terminosIndependientes);
        for (int i = 0; i < solucion.length; i++) {
            System.out.println("x[" + (i+1) + "] = " + solucion[i]);
        }
    }

    public static double[] resolverSistema(double[][] A, double[] b) {
        int n = A.length;
        double[] x = new double[n];
        double[] nuevoX = new double[n];
        int maxIter = 100;
        double tol = 1e-6;

        for (int iter = 0; iter < maxIter; iter++) {
            for (int i = 0; i < n; i++) {
                nuevoX[i] = b[i];
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        nuevoX[i] -= A[i][j] * x[j];
                    }
                }
                nuevoX[i] /= A[i][i];
            }

            boolean convergencia = true;
            for (int i = 0; i < n; i++) {
                if (Math.abs(nuevoX[i] - x[i]) > tol) {
                    convergencia = false;
                    break;
                }
            }
            if (convergencia) break;
            System.arraycopy(nuevoX, 0, x, 0, n);
        }
        return x;
    }
}
