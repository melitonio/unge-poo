package t1.complejo;

class Complejo {

    private double parteReal;
    private double parteImaginaria;

    public Complejo() {
        parteReal = 0;
        parteImaginaria = 0;
    }

    public Complejo(double r, double i) {
        parteReal = r;
        parteImaginaria = i;
    }

    public double getParteReal() {
        return this.parteReal;
    }

    public void setParteReal(double real) {
        this.parteReal = real;
    }

    public double getParteImaginaria() {
        return this.parteImaginaria;
    }

    public void setParteImaginaria(double img) {
        this.parteImaginaria = img;
    }

    public double modulo() {
        return Math.sqrt(parteReal * parteReal + parteImaginaria * parteImaginaria);
    }

    public void sumar(Complejo c) {
        parteReal = parteReal + c.getParteReal();
        parteImaginaria = parteImaginaria + c.getParteImaginaria();
    }

    public void restar(Complejo c) {
        parteReal = parteReal - c.getParteReal();
        parteImaginaria = parteImaginaria - c.getParteImaginaria();
    }

    public void imprimir() {
        System.out.println("### NUMERO COMPLEJO ####");
        System.out.println("Parte real:       " + parteReal);
        System.out.println("Parte imaginaria: " + parteImaginaria);
        System.out.println("Modulo:           " + String.format("%.2f", modulo()));
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {
        Complejo c1 = new Complejo(3, 4);
        Complejo c2 = new Complejo(1, 2);

        c1.imprimir();
        c2.imprimir();

        c1.sumar(c2);
        c1.imprimir();

        c1.restar(c2);
        c1.imprimir();
    }
}
