class Mochila {
    private String color;
    private int capacidad;   // en litros
    private int bolsillos;

    public Mochila(String color, int capacidad, int bolsillos) {
        this.color = color;
        this.capacidad = capacidad;
        this.bolsillos = bolsillos;
    }

    public String getColor() {
        return color;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getBolsillos() {
        return bolsillos;
    }

    @Override
    public String toString() {
        return "Mochila {" +
                "color='" + color + '\'' +
                ", capacidad=" + capacidad + "L" +
                ", bolsillos=" + bolsillos +
                '}';
    }
}

class LamparaEscritorio {
    private String color;
    private int altura;   // en cm
    private int potencia; // en W

    public LamparaEscritorio(String color, int altura, int potencia) {
        this.color = color;
        this.altura = altura;
        this.potencia = potencia;
    }

    public String getColor() {
        return color;
    }

    public int getAltura() {
        return altura;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "LamparaEscritorio {" +
                "color='" + color + '\'' +
                ", altura=" + altura + "cm" +
                ", potencia=" + potencia + "W" +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Mochila objeto1 = new Mochila("rojo", 20, 3);
        Mochila objeto2 = new Mochila("azul", 18, 2);
        Mochila objeto3 = new Mochila("verde", 22, 4);
        Mochila objeto4 = new Mochila("amarillo", 16, 1);

        LamparaEscritorio objeto5 = new LamparaEscritorio("rosa", 45, 9);
        LamparaEscritorio objeto6 = new LamparaEscritorio("violeta", 50, 12);
        LamparaEscritorio objeto7 = new LamparaEscritorio("verde agua", 40, 8);

        System.out.println(objeto1);
        System.out.println(objeto2);
        System.out.println(objeto3);
        System.out.println(objeto4);
        System.out.println(objeto5);
        System.out.println(objeto6);
        System.out.println(objeto7);
    }
}