package Tema4.MetodoCuadraturaGaussiana;

import java.util.function.Function;

public class Ejercicio4 {
    private static final double[] nodos = {-0.906179845938664, -0.538469310105683, 0, 0.538469310105683, 0.906179845938664};
    private static final double[] pesos = {0.236926885056189, 0.478628670499366, 0.568888888888889, 0.478628670499366, 0.236926885056189};

    public static double cuadraturaGaussiana(Function<Double, Double> f, double a, double b) {
        double suma = 0;
        double escala = (b - a) / 2.0;
        double desplazamiento = (a + b) / 2.0;
        for (int i = 0; i < nodos.length; i++) {
            double x = escala * nodos[i] + desplazamiento;
            suma += pesos[i] * f.apply(x);
        }
        return escala * suma;
    }

    public static void main(String[] args) {
        System.out.println("Método de Cuadratura Gaussiana - Ejercicio 4");
        Function<Double, Double> f = x -> 1 / (1 + x*x); // 1 / (1+x^2)
        double a = -1;
        double b = 1;
        double resultado = cuadraturaGaussiana(f, a, b);
        System.out.println("Integral de 1/(1+x²) entre -1 y 1: " + resultado);
    }
}
