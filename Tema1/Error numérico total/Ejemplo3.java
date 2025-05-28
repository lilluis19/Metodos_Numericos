package errornumericototal;

public class ErrorNumericoTotal2 {

    public static void main(String[] args) {
        double x = Math.PI / 3;
        double valorReal = Math.sin(x);
        double valorAproximado = x - Math.pow(x, 3) / 6;

        valorAproximado = Math.round(valorAproximado * 10000.0) / 10000.0;

        double errorTruncamiento = Math.abs(valorReal - valorAproximado);
        double errorRedondeo = Math.abs(valorReal - (Math.sin(x) - errorTruncamiento));
        double errorNumericoTotal = errorTruncamiento + errorRedondeo;

        System.out.println("Error Numérico Total 2: " + errorNumericoTotal);
    }
}
