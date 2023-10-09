package org.example;

public abstract class PlanoADA {
        // Atributos
        private String nombre;
        private int habitaciones;
        private double area;

        // Constructor
        public PlanoADA(String nombre, int habitaciones, double area) {
            this.nombre = nombre;
            this.habitaciones = habitaciones;
            this.area = area;
        }

        // Método abstracto publicidad
        public abstract String publicidad();

        // Getters y setters (encapsulación)
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getHabitaciones() {
            return habitaciones;
        }

        public void setHabitaciones(int habitaciones) {
            this.habitaciones = habitaciones;
        }

        public double getArea() {
            return area;
        }

        public void setArea(double area) {
            this.area = area;
        }

        // Método toString para imprimir información del plano
        @Override
        public String toString() {
            return "Plano " + nombre + " - " + habitaciones + " habitaciones - " + area + " metros cuadrados";
        }
}