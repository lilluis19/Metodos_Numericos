package errorderedondeo;

public class ErrorDeRedondeo2 {

    public static void main(String[] args) {
        double valorReal = 1.4142135;
        double valorAproximado = Math.round(valorReal * 1000.0) / 1000.0;
        double errorRedondeo = Math.abs(valorReal - valorAproximado);

        System.out.println("Error de Redondeo 2: " + errorRedondeo);
    }
}
