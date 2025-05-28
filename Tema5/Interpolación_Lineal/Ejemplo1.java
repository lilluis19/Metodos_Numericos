package Tema5.InterpolacionLineal;

public class Ejercicio1 {
    public static void main(String[] args) {
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2.0, 4.0, 6.0, 8.0, 10.0};
        double xInterpolar = 2.5;
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
