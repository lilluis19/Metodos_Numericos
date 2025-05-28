package cancelacionnumerica;

public class CancelacionNumerica1 {

    public static void main(String[] args) {
        double a = 1.00000001;
        double b = 1.00000000;
        double resultado = a - b;

        System.out.println("Resultado de la Cancelación Numérica 1: " + resultado);
    }
}
