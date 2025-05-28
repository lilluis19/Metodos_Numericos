package Tema5.Método_de_regresion;

public class Ejercicio3 {
    public static double[] regressionInterpolation(double[] x, double[] y, int degree) {
        int n = x.length;
        int m = degree + 1;
        double[][] A = new double[m][m];
        double[] B = new double[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                double sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += Math.pow(x[k], i + j);
                }
                A[i][j] = sum;
            }
            double sum = 0;
            for (int k = 0; k < n; k++) {
                sum += y[k] * Math.pow(x[k], i);
            }
            B[i] = sum;
        }

        return solveSystemOfEquations(A, B);
    }

    public static double[] solveSystemOfEquations(double[][] A, double[] B) {
        int n = B.length;
        double[] coefficients = new double[n];
        for (int i = 0; i < n; i++) {
            coefficients[i] = Math.random();
        }
        return coefficients;
    }

    public static double evaluatePolynomial(double[] coefficients, double x) {
        double result = 0;
        for (int i = 0; i < coefficients.length; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }

    public static void main(String[] args) {
        double[] x = {1, 3, 5, 7, 9};
        double[] y = {2, 6, 10, 14, 18};
        int degree = 1;

        double[] coefficients = regressionInterpolation(x, y, degree);
        double targetX = 4;
        double interpolatedValue = evaluatePolynomial(coefficients, targetX);

        System.out.println("Ejercicio 3:");
        System.out.println("El valor interpolado en x=" + targetX + " es: " + interpolatedValue);
    }
}
