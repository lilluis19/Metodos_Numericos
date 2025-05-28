package errorrelativo;

public class ErrorRelativo3 {

    public static void main(String[] args) {
        double valorReal = 0.75;
        double valorAproximado = 0.70;
        double errorAbsoluto = Math.abs(valorReal - valorAproximado);
        double errorRelativo = errorAbsoluto / Math.abs(valorReal);
        System.out.println("Error Relativo 3: " + (errorRelativo * 100) + "%");
    }
}
