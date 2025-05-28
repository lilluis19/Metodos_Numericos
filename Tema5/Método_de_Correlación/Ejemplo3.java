package Tema5.Método_de_Correlación;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        double[] x = {5, 6, 7, 8, 9};
        double[] y = {10, 12, 14, 16, 18};

        double[] coefficients = linearRegression(x, y);

        System.out.println("Ejercicio 3");
        System.out.println("Coeficiente 'a': " + coefficients[0]);
        System.out.println("Coeficiente 'b': " + coefficients[1]);
    }

    public static double[] linearRegression(double[] x, double[] y) {
        double meanX = Arrays.stream(x).average().orElse(Double.NaN);
        double meanY = Arrays.stream(y).average().orElse(Double.NaN);

        double sumXY = 0;
        double sumXX = 0;
        for (int i = 0; i < x.length; i++) {
            sumXY += x[i] * y[i];
            sumXX += x[i] * x[i];
        }

        double b = (sumXY - x.length * meanX * meanY) / (sumXX - x.length * meanX * meanX);
        double a = meanY - b * meanX;

        return new double[]{a, b};
    }
}
