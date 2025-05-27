package errordetruncamiento;

public class ErrorDeTruncamiento {

    public static void main(String[] args) {
        double x = 1.0;
        double valorReal = Math.exp(x);
        double valorAproximado = 1 + x + (Math.pow(x, 2) / 2);
        double errorTruncamiento = Math.abs(valorReal - valorAproximado);

        System.out.println("Error de Truncamiento: " + errorTruncamiento);
    }
    
}
