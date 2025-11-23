
package tp_Parte2;


public class ValidacionEdad {
       
    public void validarEdad(int edad) throws EdadInvalidaException {
        
        if (edad > 0 && edad < 120) {
            System.out.println("Edad válida");
        } else {
            throw new EdadInvalidaException("No es una edad válida. Debe ser mayor a 0 y menor a 120.");
        }
    } 
 }
    
