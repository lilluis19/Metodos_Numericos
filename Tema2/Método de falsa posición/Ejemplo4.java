import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double a = 3.2;
        double b = 4;
        int maxIter = 20;
        double tol = 0.0001;

        System.out.println("\t\t\t\t -- Método de la falsa posición (EJERCICIO 1.4) --");
        double root = falsePositionMethod(a, b, maxIter, tol);
        System.out.printf("La raíz de la ecuación es: %.5f%n", root);
    }

    public static double falsePositionMethod(double a, double b, int maxIter, double tol) {
        if (func(a) * func(b) > 0) {
            System.out.println("El método no puede encontrar una raíz en el intervalo.");
            return -1;
        }

        double xa = a, xb = b, xr = 0;

        for (int i = 0; i < maxIter; i++) {
            xr = xb - (func(xb) * (xb - xa) / (func(xb) - func(xa)));
            if (Math.abs(func(xr)) < tol) return xr;

            if (func(xa) * func(xr) < 0) xb = xr;
            else xa = xr;
        }

        return xr;
    }

    public static double func(double x) {
        return Math.pow(x, 4) - 9 * Math.pow(x, 3) + 6;
    }
}
