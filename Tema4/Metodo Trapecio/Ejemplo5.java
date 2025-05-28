package Tema4.MetodoTrapecio;

import java.util.function.Function;

public class Ejercicio5 {
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
        System.out.println("Método del Trapecio - Ejercicio 5");
        Function<Double, Double> f = x -> Math.pow(x, 2) * Math.exp(-x);
        double a = 0, b = 5;
        int n = 8;
        double result = trapezoidalRule(f, a, b, n);
        System.out.println("Resultado: " + result);
    }
}
