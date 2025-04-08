package calculadora;

class Calculadora {

    int sumar(int a, int b) {
        return a + b;
    }

    int restar(int a, int b) {
        return a - b;
    }

    int multiplicar(int a, int b) {
        return a * b;
    }

    int dividir(int a, int b) {
        return a / b;
    }
}

public class Main {
    
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Suma: " + calculadora.sumar(5, 3));
        System.out.println("Resta: " + calculadora.restar(5, 3));
        System.out.println("Multiplicación: " + calculadora.multiplicar(5, 3));
        System.out.println("División: " + calculadora.dividir(5, 3));
    }
}
