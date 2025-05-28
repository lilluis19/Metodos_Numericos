package errorabsoluto;

public class ErrorAbsoluto1 {

    public static void main(String[] args) {
        double valorReal = 10.0;
        double valorAproximado = 9.8;
        double errorAbsoluto = Math.abs(valorReal - valorAproximado);
        System.out.println("Error Absoluto 1: " + errorAbsoluto);
    }   
}
