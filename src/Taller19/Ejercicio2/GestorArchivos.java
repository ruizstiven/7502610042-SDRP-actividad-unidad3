package Taller19.Ejercicio2;

public class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void procesarGuardado(String nombre, String datos) {
        almacenamiento.guardarArchivo(nombre, datos);
    }

    public void procesarLectura(String nombre) {
        String datos = almacenamiento.recuperarArchivo(nombre);
        System.out.println("Archivo leído: [" + datos + "]\n");
    }
}
