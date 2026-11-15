package Taller18.Ejercicio1;

public class TecnicoReparacion implements Reparable {
    @Override
    public void reparar() {
        System.out.println("El técnico está reparando el equipo.");
    }
}