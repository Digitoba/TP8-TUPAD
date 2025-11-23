
package tp_Parte2;


public class StrAInt {
    
    private int resultado;
    
    public int palabraANumero (String palabra) {
        try {
            resultado = Integer.parseInt(palabra);
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            System.out.println("No se puede convertir una palabra a entero.");
            resultado = 0;
        }
        return resultado;
    }
    
}
