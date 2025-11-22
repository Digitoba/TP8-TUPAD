
package tp8_Parte1;

public class PayPal implements Pago, PagoConDescuento {

    @Override
    public double procesarPago(double monto) {
        return monto;
    }

    @Override
    public double aplicarDescuento(double monto) {
        double descuento = 0.95;
        return monto * descuento;
    }
    
}
