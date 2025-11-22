
package tp8_Parte1;

import java.util.ArrayList;


public class Pedido implements Pagable {

    private ArrayList<Producto> productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p) {
        productos.add(p);
    }
        
    public void eliminarProducto(Producto p) {
        productos.remove(p);
    }
      
    public void listarProductos() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
    
    @Override
    public double calcularTotal() {
        int total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }    
}
