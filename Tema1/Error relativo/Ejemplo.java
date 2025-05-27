package errorrelativo;

public class ErrorRelativo {

    public static void main(String[] args) {
        double valorReal = 8.5;
        double valorAproximado = 8.3;
        double errorAbsoluto = Math.abs(valorReal - valorAproximado);
        double errorRelativo = errorAbsoluto / Math.abs(valorReal);
        System.out.println("Error Relativo: " + (errorRelativo * 100) + "%");
    }
    
}
