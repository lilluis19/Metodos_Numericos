package Tema6.Euler;

public class Ejercicio2 {
    // Ecuación diferencial: dy/dx = y - x^2 + 1
    public static double f(double x, double y) {
        return y - x * x + 1;
    }

    public static void metodoEuler(double x0, double y0, double h, int n) {
        double x = x0;
        double y = y0;

        System.out.printf("x0: %.4f, y0: %.4f%n", x, y);

        for (int i = 0; i < n; i++) {
            y = y + h * f(x, y);
            x = x + h;
            System.out.printf("x%d: %.4f, y%d: %.4f%n", i + 1, x, i + 1, y);
        }
    }

    public static void main(String[] args) {
        double x0 = 0.0, y0 = 0.5, h = 0.2;
        int n = 8;
        metodoEuler(x0, y0, h, n);
    }
}
