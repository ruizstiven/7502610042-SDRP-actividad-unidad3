package Taller18.Ejercicio1;

public class PruebaMantenimiento {
    public static void main(String[] args) {
        Reparable tecnico = new TecnicoReparacion();
        Limpiable aseo = new PersonalAseo();

        tecnico.reparar();
        aseo.limpiar();
    }
}