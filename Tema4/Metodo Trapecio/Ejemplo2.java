package Tema4.MetodoTrapecio;

import java.util.function.Function;

public class Ejercicio2 {
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
        System.out.println("Método del Trapecio - Ejercicio 2");
        Function<Double, Double> f = x -> Math.sin(x * x);
        double a = 0, b = 2;
        int n = 4;
        double result = trapezoidalRule(f, a, b, n);
        System.out.println("Resultado: " + result);
    }
}
