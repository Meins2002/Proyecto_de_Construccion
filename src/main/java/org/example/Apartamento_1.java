package org.example;

public class Apartamento_1 extends PlanoADA {
    // Constructor
    public Apartamento_1(String nombre, int habitaciones, double area) {
        super(nombre, habitaciones, area);
    }

    // Implementación del método abstracto publicidad
    @Override
    public String publicidad() {
        return "¡Apartamentos VIS y VIP, resibimos caja de compesanción!";
    }
}