package errorabsoluto;

public class ErrorAbsoluto3 {

    public static void main(String[] args) {
        double valorReal = 0.00123;
        double valorAproximado = 0.00120;
        double errorAbsoluto = Math.abs(valorReal - valorAproximado);
        System.out.println("Error Absoluto 3: " + errorAbsoluto);
    }   
}
