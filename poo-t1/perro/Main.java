package perro;

class Perro {
    String nombre;
    int edad;

    void ladrar() {
        System.out.println(nombre + " está ladrando!");
    }
}

public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro(); // Creación del objeto
        miPerro.nombre = "Bobby";
        miPerro.edad = 3;

        miPerro.ladrar(); // Salida: Bobby está ladrando!
    }
}

