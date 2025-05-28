package errorderedondeo;

public class ErrorDeRedondeo1 {

    public static void main(String[] args) {
        double valorReal = 2.7182818;
        double valorAproximado = Math.round(valorReal * 1000.0) / 1000.0;
        double errorRedondeo = Math.abs(valorReal - valorAproximado);

        System.out.println("Error de Redondeo 1: " + errorRedondeo);
    }
}
