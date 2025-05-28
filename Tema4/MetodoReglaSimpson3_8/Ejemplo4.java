package Tema4.MetodoReglaSimpson3_8;

import java.util.function.Function;

public class Ejercicio4 {
    public static double simpsonThreeEighthRule(Function<Double, Double> f, double a, double b, int n) {
        double h = (b - a) / n;
        double sum = f.apply(a) + f.apply(b);

        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            if (i % 3 == 0) {
                sum += 2 * f.apply(x);
            } else {
                sum += 3 * f.apply(x);
            }
        }

        return (3 * h / 8) * sum;
    }

    public static void main(String[] args) {
        System.out.println("Método de Simpson 3/8 - Ejercicio 4");

        Function<Double, Double> f = x -> Math.exp(-x * x);
        double a = 0;
        double b = 1;
        int n = 3;

        if (n % 3 != 0) {
            System.out.println("n debe ser múltiplo de 3.");
            return;
        }

        double result = simpsonThreeEighthRule(f, a, b, n);
        System.out.println("Resultado: " + result);
    }
}
