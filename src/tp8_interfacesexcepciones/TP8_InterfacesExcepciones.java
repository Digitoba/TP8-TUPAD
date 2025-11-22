
package tp8_interfacesexcepciones;


public class TP8_InterfacesExcepciones {


    public static void main(String[] args) {
        
        Pedido p1 = new Pedido();
        Producto prod1 = new Producto("Mouse", 500);
        Producto prod2 = new Producto("Teclado", 1000);
        TarjetaCredito tarj = new TarjetaCredito();
        
        Pedido p2 = new Pedido();
        PayPal pay = new PayPal();
        Producto prod3 = new Producto("Anteojos", 1500);
        Producto prod4 = new Producto("Velador", 1200);
        
        p1.agregarProducto(prod1);
        p1.agregarProducto(prod2);
        
        p1.listarProductos();
        
        p1.eliminarProducto(prod2);
        
        p1.listarProductos();
                        
        System.out.println(tarj.procesarPago(p1.calcularTotal()));
        
        p2.agregarProducto(prod3);
        p2.agregarProducto(prod4);
        
        System.out.println(pay.aplicarDescuento(p2.calcularTotal()));
        
                
    }
    
}
