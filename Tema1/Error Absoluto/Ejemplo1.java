
package errorabsoluto;

public class ErrorAbsoluto {

    public static void main(String[] args) {
        double valorReal = 5.678;
        double valorAproximado = 5.65;
        double errorAbsoluto = Math.abs(valorReal - valorAproximado);
        System.out.println("Error Absoluto: " + errorAbsoluto);
    }   
}

