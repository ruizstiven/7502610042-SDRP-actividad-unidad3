package Taller18.Ejercicio2;

public class PuntoPagoFacturas implements PagoFactura {
    @Override
    public void pagarFactura(String referencia, double monto) {
        System.out.println("Pagando factura #" + referencia + " por valor de $" + monto);
    }
}