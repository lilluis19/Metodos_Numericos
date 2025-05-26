import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Luis Yañez
 */

public class GaussJordan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.####");

        System.out.print("Ingrese el número de ecuaciones (n): ");
        int n = sc.nextInt();

        double[][] matrix = new double[n][n + 1];

        System.out.println("Ingrese los coeficientes del sistema (matriz aumentada):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
                matrix[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\nProcedimiento paso a paso:");
        gaussJordan(matrix, n, df);

        sc.close();
    }

    public static void gaussJordan(double[][] matrix, int n, DecimalFormat df) {
        for (int i = 0; i < n; i++) {
            // 1. Hacer el pivote igual a 1
            double pivot = matrix[i][i];
            
            if (pivot == 0) {
                System.out.println("No se puede resolver: hay un pivote cero.");
                return;
            }

            System.out.println("\nDividiendo fila " + (i + 1) + " por " + df.format(pivot));
            for (int j = 0; j < n + 1; j++) {
                matrix[i][j] /= pivot;
            }
            printMatrix(matrix, n, df);

            // 2. Hacer ceros en las demás filas
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = matrix[k][i];
                    System.out.println("\nEliminando elemento en fila " + (k + 1) + ", columna " + (i + 1));

                    for (int j = 0; j < n + 1; j++) {
                        matrix[k][j] -= factor * matrix[i][j];
                    }
                    printMatrix(matrix, n, df);
                }
            }
        }

        // Mostrar la solución
        System.out.println("\nSolución del sistema:");
        for (int i = 0; i < n; i++) {
            System.out.println("x" + (i + 1) + " = " + df.format(matrix[i][n]));
        }
    }

    public static void printMatrix(double[][] matrix, int n, DecimalFormat df) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print(df.format(matrix[i][j]) + "\t");
            }
            System.out.println();
        }
    }
}