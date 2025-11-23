
package tp_Parte2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Lector {
    
    
    public void leer(File archivo) {
        
        try {
            Scanner lector = new Scanner(archivo);
            
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }
            
            lector.close();
            
        } catch (FileNotFoundException fe) {
            System.out.println("El archivo no existe o no pudo ser leído.");
            fe.printStackTrace();
        }
    }
    
}
