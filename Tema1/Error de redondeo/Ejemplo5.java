package errorderedondeo;

public class ErrorDeRedondeo4 {

    public static void main(String[] args) {
        double valorReal = 123.456789;
        double valorAproximado = Math.round(valorReal * 1000.0) / 1000.0;
        double errorRedondeo = Math.abs(valorReal - valorAproximado);

        System.out.println("Error de Redondeo 4: " + errorRedondeo);
    }
}
