
package tp8_interfacesexcepciones;

public class Cliente implements Notificable {
    
    private String nombre;

    @Override
    public String productoAgregado() {
        return "Un producto ha sido agregado.";
    }

    @Override
    public String productoEliminado() {
        return "Un producto ha sido eliminado.";
    }

    @Override
    public String precioTotal() {
        return "El precio total es: ";
    }
    
}
