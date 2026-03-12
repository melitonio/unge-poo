
class Perro {

    String nombre;
    String raza;
    float peso;
    int edad;

    void ladrar() {
        System.out.println(nombre + ", perro de " + edad + " años"
                + " está ladrando: gau, gau, ... !");
    }

    void correr() {
        System.out.println("Un perro de " + peso + "kg, de la raza " + raza
                + " está corriendo!");
    }
}

public class Main {

    public static void main(String[] args) {
        Perro miPerro = new Perro();           // Creación del objeto miPerro
        miPerro.nombre = "Max";                // Establecer el nombre
        miPerro.raza = "Pastor Alemán";        // Estableer la raza
        miPerro.edad = 5;                      // Estableer la edad
        miPerro.peso = 12.80f;                  // Estableer el peso

        miPerro.ladrar();
        miPerro.correr();
    }
}

// Salida: 
// Max, perro de 5 años está ladrando: gau, gau, ... !
// Un perro de 12.8kg, de la raza Pastor Alemán está corriendo!
