package Tema6.Taylor;

public class Ejercicio2 {
    public static double f(double x, double y) {
        return x + y;
    }

    public static double dfdx(double x, double y) {
        return 1;
    }

    public static double dfdy(double x, double y) {
        return 1;
    }

    public static void metodoTaylor(double x0, double y0, double h, int n) {
        double x = x0;
        double y = y0;

        System.out.printf("x0: %.4f, y0: %.4f%n", x, y);

        for (int i = 0; i < n; i++) {
            double y1 = y + h * f(x, y) + (h * h / 2) * (dfdx(x, y) + f(x, y) * dfdy(x, y));
            y = y1;
            x += h;

            System.out.printf("x%d: %.4f, y%d: %.4f%n", i+1, x, i+1, y);
        }
    }

    public static void main(String[] args) {
        metodoTaylor(0.0, 1.0, 0.2, 8);
    }
}
