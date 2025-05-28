package Tema5.Interpolación_de_newton;

public class Ejercicio1 {
    public static double[][] dividedDifferenceTable(double[] x, double[] y) {
        int n = x.length;
        double[][] table = new double[n][n];
        for (int i = 0; i < n; i++) table[i][0] = y[i];
        for (int j = 1; j < n; j++)
            for (int i = 0; i < n - j; i++)
                table[i][j] = (table[i + 1][j - 1] - table[i][j - 1]) / (x[i + j] - x[i]);
        return table;
    }

    public static double evaluateNewtonPolynomial(double[] x, double[][] table, double target) {
        double result = table[0][0], term = 1;
        for (int i = 1; i < x.length; i++) {
            term *= (target - x[i - 1]);
            result += table[0][i] * term;
        }
        return result;
    }

    public static void main(String[] args) {
        double[] x = {1, 2, 3, 4};
        double[] y = {2, 4, 8, 16};
        double[][] table = dividedDifferenceTable(x, y);
        double target = 2.5;
        double result = evaluateNewtonPolynomial(x, table, target);
        System.out.println("Interpolado en x=" + target + " es: " + result);
    }
}
