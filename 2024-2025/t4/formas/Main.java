package t4.formas;

abstract class Forma {
    public abstract double area();
}

class Circulo extends Forma {
    private final double radio;
    public Circulo(double r) { radio = r; }
    
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
    
    public double perimetro()
    {
        return 2 * Math.PI + radio;
    }
}

class Rectangulo extends Forma {
    private final double ancho, alto;

    public Rectangulo(double a, double h) {
        ancho = a;
        alto = h;
    }
    
    @Override
    public double area() { return ancho * alto; }
}

// Uso polimórfico
public class Main {
    public static void main(String[] args) {
        Forma[] figuras = {
            new Circulo(2.0),
            new Rectangulo(3.0, 4.0)
        };
        for (Forma f : figuras) {
            System.out.println("Área = " + f.area());
        }

        Forma f1 = new Circulo(7.0);
        Circulo c1 = new Circulo(3.0);

        f1.area();
        c1.area();
        c1.perimetro();
    }
}
