package Tema4.MetodoReglaSimpson1_3;

import java.util.function.Function;

public class Ejercicio5 {
    public static double simpsonOneThirdRule(Function<Double, Double> f, double a, double b, int n) {
        double h = (b - a) / n;
        double sum = f.apply(a) + f.apply(b);

        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            if (i % 2 == 0) {
                sum += 2 * f.apply(x);
            } else {
                sum += 4 * f.apply(x);
            }
        }

        return (h / 3) * sum;
    }

    public static void main(String[] args) {
        System.out.println("Método de la Regla de Simpson 1/3 - Ejercicio 5");

        Function<Double, Double> f = x -> 1 / (1 + x*x);
        double a = -1;
        double b = 1;
        int n = 10;
        if (n % 2 != 0) {
            System.out.println("El número de subintervalos debe ser par.");
            return;
        }

        double result = simpsonOneThirdRule(f, a, b, n);
        System.out.println("Integral de 1/(1+x²) entre -1 y 1: " + result);
    }
}
