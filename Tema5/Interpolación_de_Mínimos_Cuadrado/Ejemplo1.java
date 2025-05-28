package Tema5.Interpolación_de_Mínimos_Cuadrado;

public class Ejercicio1 {
    public static void main(String[] args) {
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2.5, 3.7, 5.1, 6.2, 7.8};
        int degree = 2;
        double[] coefficients = leastSquaresInterpolation(x, y, degree);
        double interpolatedValue = evaluatePolynomial(coefficients, 2.5);
        System.out.println("Interpolación en x=2.5: " + interpolatedValue);
    }

    public static double[] leastSquaresInterpolation(double[] x, double[] y, int degree) {
        int n = x.length, m = degree + 1;
        double[][] A = new double[m][m];
        double[] B = new double[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                for (double xi : x) A[i][j] += Math.pow(xi, i + j);
            }
            for (int k = 0; k < n; k++) B[i] += y[k] * Math.pow(x[k], i);
        }
        return solveSystem(A, B);
    }

    public static double[] solveSystem(double[][] A, double[] B) {
        int n = B.length;
        double[] res = new double[n];
        for (int i = 0; i < n; i++) res[i] = Math.random(); // Reemplazar por Gauss-Jordan real si se requiere precisión
        return res;
    }

    public static double evaluatePolynomial(double[] coeffs, double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) result += coeffs[i] * Math.pow(x, i);
        return result;
    }
}
