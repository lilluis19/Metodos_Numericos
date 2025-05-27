
package errorderedondeo;

public class ErrorDeRedondeo {

    public static void main(String[] args) {
        double valorReal = 3.14159265;
        double valorAproximado = Math.round(valorReal * 1000.0) / 1000.0;
        double errorRedondeo = Math.abs(valorReal - valorAproximado);

        System.out.println("Error de Redondeo: " + errorRedondeo);
    }
    
}
