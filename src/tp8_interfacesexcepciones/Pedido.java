
package tp8_interfacesexcepciones;

import java.util.ArrayList;


public class Pedido implements Pagable {

    private ArrayList<Producto> productos = new ArrayList<>();
    
    @Override
    public double calcularTotal() {
        return 0;
    }   
    
}
