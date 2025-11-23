package tp_Parte2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaResources {
    
    String ruta = "archivo.txt";
    
    public void leerArchivo(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            
        } catch (IOException ioe) {
            System.out.println("Error al leer: " + ioe.getMessage());
            ioe.printStackTrace();
        }
    }
    
    
}
