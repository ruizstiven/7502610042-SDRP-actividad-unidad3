package Taller19.Ejercicio1;

public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public void iniciarSesion(String usuario, String credencial) {
        if (servicioAutenticacion.autenticar(usuario, credencial)) {
            System.out.println("Acceso concedido a: " + usuario + "\n");
        } else {
            System.out.println("Acceso denegado para: " + usuario + "\n");
        }
    }
}
