package Taller18.Ejercicio3;

// Automóvil: solo se conduce
public class Automovil implements Conducible {
    @Override
    public void conducir() {
        System.out.println("Conduciendo el automóvil por la ciudad.");
    }
}

