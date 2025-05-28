package Tema5.Interpolación_de_lagrange;

public class Ejercicio3 {
    public static double interpolate(double[] x, double[] y, double target) {
        double result = 0;
        for (int i = 0; i < x.length; i++) {
            double term = y[i];
            for (int j = 0; j < x.length; j++) {
                if (j != i) {
                    term *= (target - x[j]) / (x[i] - x[j]);
                }
            }
            result += term;
        }
        return result;
    }

    public static void main(String[] args) {
        double[] x = {2, 3, 5, 6};
        double[] y = {4, 1, 3, 2};
        double target = 4.0;

        double interpolatedValue = interpolate(x, y, target);
        System.out.println("El valor interpolado en x=" + target + " es: " + interpolatedValue);
    }
}
