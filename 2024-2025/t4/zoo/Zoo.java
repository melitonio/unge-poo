package t4.zoo;

abstract class Animal {
    protected String nombre;
    public Animal(String n) { nombre = n; }

    public abstract void hacerSonido();  // firma sin cuerpo

    public void dormir() {                // implementación común
        System.out.println(nombre + " duerme.");
    }
}

class Gato extends Animal {
    public Gato(String n) {
        super(n);
    }
    
    @Override
    public void hacerSonido() { System.out.println("Miau"); }
}

class Perro extends Animal {
    public Perro(String n) {
        super(n);
    }
    
    @Override
    public void hacerSonido() { System.out.println("Guau"); }
}

// Prueba de abstracción
public class Zoo {
    public static void main(String[] args) {
        Animal[] a = {
                new Gato("Luna"),
                new Gato("Juan"),
                new Perro("Rex")
            };
        for (Animal ani : a) {
            ani.hacerSonido();
            ani.dormir();
            System.out.println("");
        }
    }
}
