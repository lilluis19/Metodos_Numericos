package Tema5.InterpolacionLineal;

public class Ejercicio5 {
    public static void main(String[] args) {
        double[] x = {2, 4, 6, 8, 10};
        double[] y = {4, 16, 36, 64, 100};
        double xInterpolar = 5;
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
