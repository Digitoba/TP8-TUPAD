
package tp_Parte2;

public class Division {
    
    private int a;
    private int b;
    private int resultado;
    
    public int division(int a, int b) {
        try {
            resultado = a/b;
        } catch (ArithmeticException ae) {
            if (b == 0) {
                ae.printStackTrace();  
                System.out.println("No se puede dividr por cero.");
                resultado = 0;
            }
        }
        return resultado;
    }
    
}
