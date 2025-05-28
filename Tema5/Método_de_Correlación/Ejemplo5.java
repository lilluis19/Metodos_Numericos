package Tema5.Método_de_Correlación;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        double[] x = {3, 5, 7, 9, 11};
        double[] y = {7, 14, 21, 28, 35};

        double[] coefficients = linearRegression(x, y);

        System.out.println("Ejercicio 5");
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
