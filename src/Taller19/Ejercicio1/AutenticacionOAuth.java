package Taller19.Ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        System.out.println("Autenticando usuario '" + usuario + "' mediante proveedor OAuth (token)...");
        // Simulación de validación con token
        return credencial != null && credencial.startsWith("TOKEN_");
    }
}
