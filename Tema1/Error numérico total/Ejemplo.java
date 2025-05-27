package errornumericototal;

public class ErrorNumericoTotal {
 
    public static void main(String[] args) {
        double valorReal = Math.sin(Math.PI / 4);
        double x = Math.PI / 4;

        double valorAproximado = x - Math.pow(x, 3) / 6;

        valorAproximado = Math.round(valorAproximado * 10000.0) / 10000.0;

        double errorTruncamiento = Math.abs(valorReal - valorAproximado);
        double errorRedondeo = Math.abs(valorReal - (Math.sin(Math.PI / 4) - errorTruncamiento));
        double errorNumericoTotal = errorTruncamiento + errorRedondeo;

        System.out.println("Error Numérico Total: " + errorNumericoTotal);
    }
    
}
