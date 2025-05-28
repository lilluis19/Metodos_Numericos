import java.util.Scanner;

public class Ejercicio1_3 {
    public static void main(String[] args) {
        double x0 = -2.0;
        double x1 = 1.0;
        int maxIter = 30;
        double tol = 0.001;

        System.out.println("\t\t\t\t -- Método de la secante (EJERCICIO 1.3) --"); 
        double root = secantMethod(x0, x1, maxIter, tol);
        System.out.printf("La raíz de la ecuación es: %.5f%n", root);
    }

    public static double secantMethod(double x0, double x1, int maxIter, double tol) {
        if (func(x0) * func(x1) == 0) {
            System.out.println("El método no puede encontrar una raíz en el intervalo.");
            return -1;
        }

        double x2 = 0;
        for (int i = 0; i < maxIter; i++) {
            x2 = x1 - (func(x1) * (x1 - x0) / (func(x1) - func(x0)));
            if (Math.abs(x1 - x2) < tol) {
                return x2;
            }
            x0 = x1;
            x1 = x2;
        }
        return x2;
    }

    public static double func(double x) {
        return Math.pow(x, 2) - 3 * x - 4;
    }
}
