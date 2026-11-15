package Taller19.Ejercicio2;

public class PruebaAlmacenamiento {
    public static void main(String[] args) {
        // Prueba con Almacenamiento Local
        Almacenamiento local = new AlmacenamientoLocal();
        GestorArchivos gestor = new GestorArchivos(local);
        gestor.procesarGuardado("tarea.txt", "Principios SOLID en Java");
        gestor.procesarLectura("tarea.txt");

        // Prueba con Almacenamiento en la Nube
        Almacenamiento nube = new AlmacenamientoNube();
        gestor = new GestorArchivos(nube);
        gestor.procesarGuardado("respaldo.pdf", "Datos importantes");
        gestor.procesarLectura("respaldo.pdf");
    }
}