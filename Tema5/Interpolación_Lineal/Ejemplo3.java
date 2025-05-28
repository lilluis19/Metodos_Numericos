package Tema5.InterpolacionLineal;

public class Ejercicio3 {
    public static void main(String[] args) {
        double[] x = {10, 15, 20, 25, 30};
        double[] y = {100, 150, 200, 250, 300};
        double xInterpolar = 22.5;
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
