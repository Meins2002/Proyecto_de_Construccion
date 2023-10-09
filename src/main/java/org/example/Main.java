package org.example;

public class Main {
    public static void main(String[] args) {
        // Creación de instancias de apartamentos
        PlanoADA apartamento1 = new Apartamento_1("Modelo 1", 2, 75.5);
        PlanoADA apartamento2 = new Apartamento_2("Modelo 2", 3, 100.0);

        // Uso de polimorfismo (llamada a toString())
        System.out.println(apartamento1);
        System.out.println(apartamento2);

        // Uso del método publicidad()
        System.out.println(apartamento1.publicidad());
        System.out.println(apartamento2.publicidad());
    }
}
