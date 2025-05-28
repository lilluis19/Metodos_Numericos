package Tema5.InterpolacionLineal;

public class Ejercicio2 {
    public static void main(String[] args) {
        double[] x = {0, 1, 2, 3, 4};
        double[] y = {1, 3, 7, 13, 21};
        double xInterpolar = 1.5;
        double yInterpolado = interpolar(x, y, xInterpolar);
        System.out.println("y(" + xInterpolar + ") = " + yInterpolado);
    }

    public static double interpolar(double[] x, double[] y, double xi) {
        int i = 0;
        while (i < x.length - 1 && x[i+1] < xi) {
            i++;
        }
        return y[i] + (y[i+1] - y[i]) * (xi - x[i]) / (x[i+1] - x[i]);
    }
}
