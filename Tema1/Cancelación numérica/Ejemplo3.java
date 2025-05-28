package cancelacionnumerica;

public class CancelacionNumerica2 {

    public static void main(String[] args) {
        double a = 1000000.000001;
        double b = 1000000.000000;
        double resultado = a - b;

        System.out.println("Resultado de la Cancelación Numérica 2: " + resultado);
    }
}
