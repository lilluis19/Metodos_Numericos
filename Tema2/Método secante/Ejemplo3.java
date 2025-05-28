package Truncamiento;

public class Ejercicio3 {
    public static void main(String[] args) {
        int n = 15;
        double x = Math.PI / 3;
        double suma = 0.0;

        for (int i = 0; i < n; i++) {
            suma += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
        }

        System.out.println("Aproximación de sin(π/3): " + suma);
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }
}
