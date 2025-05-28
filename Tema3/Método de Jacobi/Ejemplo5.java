public class Ejercicio5 {
    public static void main(String[] args) {
        double[][] coeficientes = {
            {7, -3, 1, 14},
            {-2, 8, -1, 6},
            {1, -1, 6, 20}
        };
        double[] valoresIniciales = {2, 1, 0};
        double tolerancia = 0.000001;
        int iterMax = 1200;

        double[] solucion = jacobi(coeficientes, valoresIniciales, tolerancia, iterMax);
        if (solucion != null) {
            System.out.println("Solución:");
            System.out.println("x = " + solucion[0]);
            System.out.println("y = " + solucion[1]);
            System.out.println("z = " + solucion[2]);
        } else {
            System.out.println("El método no converge.");
        }
    }

    public static double[] jacobi(double[][] coef, double[] init, double tol, int maxIter) {
        int n = init.length;
        double[] sol = new double[n];
        double[] solAnt = new double[n];
        System.arraycopy(init, 0, sol, 0, n);
        double error = tol + 1;
        int iter = 0;

        while (error > tol && iter < maxIter) {
            System.arraycopy(sol, 0, solAnt, 0, n);
            for (int i = 0; i < n; i++) {
                double suma = 0;
                for (int j = 0; j < n; j++) {
                    if (j != i) suma += coef[i][j] * solAnt[j];
                }
                sol[i] = (coef[i][n] - suma) / coef[i][i];
            }
            error = 0;
            for (int i = 0; i < n; i++) error += Math.abs(sol[i] - solAnt[i]);
            iter++;
        }
        return error <= tol ? sol : null;
    }
}
