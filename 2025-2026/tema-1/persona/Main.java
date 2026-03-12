// Definimos la clase Persona (el molde para los objetos)
class Persona {
    // Atributos o campos (propiedades de una persona)
    String nombre;
    float edad;

    // Constructor: Se usa para crear objetos con valores iniciales
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar la información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear dos objetos de la clase Persona
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Ana", 30);

        // Llamar al método para mostrar la información
        persona1.mostrarInformacion(); // Salida: Nombre: Juan, Edad: 25
        persona2.mostrarInformacion(); // Salida: Nombre: Ana, Edad: 30
    }
}