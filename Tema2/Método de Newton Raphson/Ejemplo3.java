public class Ejercicio3 {
    public static void main(String[] args) {
        double x0 = -2;
        int maxIter = 25;
        double tol = 0.001;

        System.out.println("\t\t\t\t -- Método de Newton (EJERCICIO 1.3) --"); 
        double root = newtonMethod(x0, maxIter, tol); 
        System.out.printf("La raíz de la ecuación es: %.5f%n", root); 
    }

    public static double newtonMethod(double x0, int maxIter, double tol) {
        double fx = func(x0);
        double df = funcDerivada(x0);

        if (df == 0) {
            System.out.println("El método no puede encontrar una raíz en la aproximación.");
            return -1;
        }

        double x1 = 0;
        for (int i = 0; i < maxIter; i++) {
            x1 = x0 - (fx / df);
            double error = Math.abs(x1 - x0);
            if (error < tol) return x1;
            x0 = x1;
            fx = func(x0);
            df = funcDerivada(x0);
        }
        return x1;
    }

    public static double func(double x) {
        return Math.pow(x, 2) - 2 * x - 5;
    }

    public static double funcDerivada(double x) {
        return 2 * x - 2;
    }
}
