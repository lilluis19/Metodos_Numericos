package Tema6.Runge_Kutta;

public class Ejercicio2 {
    // Ecuación diferencial: dy/dx = x + y
    public static double f(double x, double y) {
        return x + y;
    }

    public static void metodoRungeKutta(double x0, double y0, double h, int n) {
        double x = x0;
        double y = y0;

        System.out.printf("x0: %.4f, y0: %.4f%n", x, y);

        for (int i = 0; i < n; i++) {
            double k1 = h * f(x, y);
            double k2 = h * f(x + h / 2.0, y + k1 / 2.0);
            double k3 = h * f(x + h / 2.0, y + k2 / 2.0);
            double k4 = h * f(x + h, y + k3);

            y = y + (k1 + 2*k2 + 2*k3 + k4) / 6.0;
            x = x + h;

            System.out.printf("x%d: %.4f, y%d: %.4f%n", i+1, x, i+1, y);
        }
    }

    public static void main(String[] args) {
        double x0 = 0.0, y0 = 1.0, h = 0.15;
        int n = 8;
        metodoRungeKutta(x0, y0, h, n);
    }
}
