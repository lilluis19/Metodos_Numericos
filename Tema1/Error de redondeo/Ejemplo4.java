package errorderedondeo;

public class ErrorDeRedondeo3 {

    public static void main(String[] args) {
        double valorReal = 0.3333333;
        double valorAproximado = Math.round(valorReal * 1000.0) / 1000.0;
        double errorRedondeo = Math.abs(valorReal - valorAproximado);

        System.out.println("Error de Redondeo 3: " + errorRedondeo);
    }
}
