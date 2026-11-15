package Taller18.Ejercicio2;

public class PruebaBanco {
    public static void main(String[] args) {
        CajeroAutomatico cajero = new CajeroAutomatico();
        cajero.retirar(200000);
        cajero.transferir(150000, "123-456789-0");

        PagoFactura corresponsal = new PuntoPagoFacturas();
        corresponsal.pagarFactura("FAC-9081", 85000);
    }
}