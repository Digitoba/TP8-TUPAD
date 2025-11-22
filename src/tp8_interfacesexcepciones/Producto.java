
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

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }   

    @Override
    public String toString() {
        return "Producto: " + nombre + "; Precio: $ " + precio;
    }
       
    
}
