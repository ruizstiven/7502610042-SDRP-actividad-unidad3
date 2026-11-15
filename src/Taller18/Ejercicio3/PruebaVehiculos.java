package Taller18.Ejercicio3;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Conducible auto = new Automovil();
        auto.conducir();

        Camion camion = new Camion();
        camion.cargarMercancia(3500.5);
        camion.conducir();
    }
}
