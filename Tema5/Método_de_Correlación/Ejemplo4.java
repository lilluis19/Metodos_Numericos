package Tema5.Método_de_Correlación;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        double[] x = {10, 20, 30, 40, 50};
        double[] y = {15, 25, 35, 45, 55};

        double[] coefficients = linearRegression(x, y);

        System.out.println("Ejercicio 4");
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
