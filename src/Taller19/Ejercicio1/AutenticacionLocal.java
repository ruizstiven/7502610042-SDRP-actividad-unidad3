package Taller19.Ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        System.out.println("Autenticando usuario '" + usuario + "' en la base de datos local...");
        // Simulación de validación
        return "admin".equals(usuario) && "1234".equals(credencial);
    }
}
