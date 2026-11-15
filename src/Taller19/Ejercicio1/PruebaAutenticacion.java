package Taller19.Ejercicio1;

public class PruebaAutenticacion {
    public static void main(String[] args) {
        // Prueba con Autenticación Local
        ServicioAutenticacion authLocal = new AutenticacionLocal();
        GestorAutenticacion gestor = new GestorAutenticacion(authLocal);
        gestor.iniciarSesion("admin", "1234");

        // Prueba cambiando dinámicamente a Autenticación OAuth
        ServicioAutenticacion authOAuth = new AutenticacionOAuth();
        gestor = new GestorAutenticacion(authOAuth);
        gestor.iniciarSesion("carlos@correo.com", "TOKEN_98765");
    }
}