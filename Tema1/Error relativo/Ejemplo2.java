package errorrelativo;

public class ErrorRelativo1 {

    public static void main(String[] args) {
        double valorReal = 10.0;
        double valorAproximado = 9.7;
        double errorAbsoluto = Math.abs(valorReal - valorAproximado);
        double errorRelativo = errorAbsoluto / Math.abs(valorReal);
        System.out.println("Error Relativo 1: " + (errorRelativo * 100) + "%");
    }
}
