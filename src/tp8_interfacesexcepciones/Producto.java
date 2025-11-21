
package tp8_interfacesexcepciones;


public class Producto implements Pagable {
    
    String nombre;
    double precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double calcularTotal() {
        return precio;
    }
    
    
}
