package t2.estudiante;

class Estudiante {
    private String nombre;
    private int edad;

    // Constructor con nombre y edad
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor solo con nombre (edad por defecto: 18)
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.edad = 18;
    }

    void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre + ", Edad: " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Carlos", 22);
        Estudiante e2 = new Estudiante("Elena");

        e1.mostrarInformacion();
        e2.mostrarInformacion();
    }
}
