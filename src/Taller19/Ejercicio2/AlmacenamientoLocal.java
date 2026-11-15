package Taller19.Ejercicio2;

public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        System.out.println("Guardando '" + nombreArchivo + "' en el disco duro local. Contenido: " + contenido);
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        System.out.println("Buscando '" + nombreArchivo + "' en el disco duro local...");
        return "Contenido local de " + nombreArchivo;
    }
}
