package Tema4.MetodoTrapecio;

import java.util.function.Function;

public class Ejercicio3 {
    public static double trapezoidalRule(Function<Double, Double> f, double a, double b, int n) {
        double h = (b - a) / n;
        double sum = 0.5 * (f.apply(a) + f.apply(b));
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            sum += f.apply(x);
        }
        return h * sum;
    }

    public static void main(String[] args) {
        System.out.println("Método del Trapecio - Ejercicio 3");
        Function<Double, Double> f = x -> 1 / (1 + x * x);
        double a = -5, b = 5;
        int n = 10;
        double result = trapezoidalRule(f, a, b, n);
        System.out.println("Resultado: " + result);
    }
}
