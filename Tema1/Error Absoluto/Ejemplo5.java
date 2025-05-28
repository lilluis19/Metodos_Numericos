package errorabsoluto;

public class ErrorAbsoluto4 {

    public static void main(String[] args) {
        double valorReal = 100.0;
        double valorAproximado = 99.95;
        double errorAbsoluto = Math.abs(valorReal - valorAproximado);
        System.out.println("Error Absoluto 4: " + errorAbsoluto);
    }   
}
