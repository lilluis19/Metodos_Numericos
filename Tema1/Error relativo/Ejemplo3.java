package errorrelativo;

public class ErrorRelativo2 {

    public static void main(String[] args) {
        double valorReal = 4.25;
        double valorAproximado = 4.20;
        double errorAbsoluto = Math.abs(valorReal - valorAproximado);
        double errorRelativo = errorAbsoluto / Math.abs(valorReal);
        System.out.println("Error Relativo 2: " + (errorRelativo * 100) + "%");
    }
}
