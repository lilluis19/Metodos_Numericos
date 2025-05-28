package errorabsoluto;

public class ErrorAbsoluto2 {

    public static void main(String[] args) {
        double valorReal = 3.1416;
        double valorAproximado = 3.14;
        double errorAbsoluto = Math.abs(valorReal - valorAproximado);
        System.out.println("Error Absoluto 2: " + errorAbsoluto);
    }   
}
