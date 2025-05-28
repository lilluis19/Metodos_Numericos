package Tema6.Euler;

public class Ejercicio4 {
    // Ecuación diferencial: dy/dx = sin(x) + y
    public static double f(double x, double y) {
        return Math.sin(x) + y;
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
        double x0 = 0.0, y0 = 1.0, h = 0.1;
        int n = 15;
        metodoEuler(x0, y0, h, n);
    }
}
