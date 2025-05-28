import java.util.Scanner;

public class Ejercicio1_4 {

    public static void main(String[] args) {
        double a = 1.5;
        double b = 2.5;
        int maxIter = 50;
        double tol = 1e-6;

        System.out.println("\t\t\t\t -- Método de bisección (EJERCICIO 1.4) --");
        double root = bisectionMethod(a, b, maxIter, tol);
        System.out.printf("La raíz de la ecuación es: %.5f%n", root);
    }

    public static double bisectionMethod(double a, double b, int maxIter, double tol) {
        if ((func(a) * func(b)) > 0) {
            System.out.println("El método no puede encontrar una raíz en el intervalo.");
            return -1;
        }

        double c;
        for (int i = 0; i < maxIter; i++) {
            c = (a + b) / 2;
            if (Math.abs(func(c)) < tol) {
                return c;
            }
            if (func(a) * func(c) < 0) {
                b = c;
            } else {
                a = c;
            }
        }
        return (a + b) / 2;
    }

    public static double func(double x) {
        return Math.pow(x, 3) + 4 * Math.pow(x, 2) - 10;
    }
}
