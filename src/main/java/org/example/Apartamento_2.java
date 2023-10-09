package org.example;

public class Apartamento_2 extends PlanoADA {
    // Constructor
    public Apartamento_2(String nombre, int habitaciones, double area) {
        super(nombre, habitaciones, area);
    }

    // Implementación del método abstracto publicidad
    @Override
    public String publicidad() {
        return "¡Cumple tu sueño de tener Apartamento! ";
    }
}