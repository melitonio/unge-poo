package t2.coche;

class Coche {
    private String marca;
    private int velocidad;

    // Constructor
    public Coche(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    // Getter para obtener la marca
    public String getMarca() {
        return marca;
    }

    // Setter para cambiar la velocidad con validación
    public void setVelocidad(int nuevaVelocidad) {
        if (nuevaVelocidad >= 0) {
            this.velocidad = nuevaVelocidad;
        } else {
            System.out.println("Error: La velocidad no puede ser negativa.");
        }
    }

    void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Velocidad: " + velocidad + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", 120);
        miCoche.mostrarInformacion();
        
        // Modificando la velocidad con setter
        miCoche.setVelocidad(150);
        miCoche.mostrarInformacion();
    }
}
