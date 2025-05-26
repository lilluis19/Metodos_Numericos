
package cancelacionnumerica;

public class CancelacionNumerica {

    public static void main(String[] args) {
        double a = 1.0000001;
        double b = 1.0000000;
        double resultado = a - b;

        System.out.println("Resultado de la Cancelación Numérica: " + resultado);
    }
    
}
