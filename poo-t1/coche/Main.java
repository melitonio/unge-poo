package coche;

// Definimos la clase (molde)
class Coche {

    String marca;
    String color;
    int velocidad;
}

// Definimos la clase principal
public class Main {

    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.marca = "Toyota";
        coche1.color = "Rojo";
        coche1.velocidad = 120;

        Coche coche2 = new Coche();
        coche2.marca = "Ford";
        coche2.color = "Azul";
        coche2.velocidad = 140;

        System.out.println("El coche 1 es un " + coche1.marca + " de color " + coche1.color);
        System.out.println("El coche 2 es un " + coche2.marca + " de color " + coche2.color);
    }
}
