package Taller18.Ejercicio2;

public class CajeroAutomatico implements Retiro, Transferencia {
    @Override
    public void retirar(double monto) {
        System.out.println("Retirando $" + monto + " en efectivo del cajero.");
    }

    @Override
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("Transfiriendo $" + monto + " a la cuenta " + cuentaDestino);
    }
}
