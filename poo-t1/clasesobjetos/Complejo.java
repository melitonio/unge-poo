package clasesobjetos;

public class Complejo {
    private double real;
    private double img;

    public Complejo() {
        real = 0;
        img = 0;
    }

    public Complejo(double r, double i) {
        real = r;
        img = i;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImg() {
        return this.img;
    }

    public void setImg(double img) {
        this.img = img;
    }

    public double modulo() {
        return Math.sqrt(real * real + img * img);
    }

    public void sumar(Complejo c) {
        real = real + c.getReal();
        img = img + c.getImg();
    }

    public void restar(Complejo c) {
        real = real - c.getReal();
        img = img - c.getImg();
    }

    public void imprimir() {
        System.out.println("### NUMERO COMPLEJO ####");
        System.out.println("Parte real:       " + real);
        System.out.println("Parte imaginaria: " + img);
        System.out.println("Modulo:           " + modulo());
        System.out.println();
    }
}