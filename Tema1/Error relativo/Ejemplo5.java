package errorrelativo;

public class ErrorRelativo4 {

    public static void main(String[] args) {
        double valorReal = 15.0;
        double valorAproximado = 14.85;
        double errorAbsoluto = Math.abs(valorReal - valorAproximado);
        double errorRelativo = errorAbsoluto / Math.abs(valorReal);
        System.out.println("Error Relativo 4: " + (errorRelativo * 100) + "%");
    }
}
