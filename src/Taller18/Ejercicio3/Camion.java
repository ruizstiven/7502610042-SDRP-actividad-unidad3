package Taller18.Ejercicio3;

// Camión: se conduce y además transporta mercancía
public class Camion implements Conducible, TransporteMercancia {
    @Override
    public void conducir() {
        System.out.println("Conduciendo el camión en carretera.");
    }

    @Override
    public void cargarMercancia(double pesoKg) {
        System.out.println("Cargando " + pesoKg + " kg de mercancía en el camión.");
    }
}