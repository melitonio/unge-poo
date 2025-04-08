package t2.maquinaboletos;

class MaquinaBoletos {
    private final double precio;
    private double saldo;
    private double total;

    public MaquinaBoletos(double precioBoleto) {
        precio = precioBoleto;
        saldo = 0;
        total = 0;
    }

    public double getPrecio() {
        return precio;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTotal() {
        return total;
    }

    public void ingresarDinero(double cantidad) {
        saldo = saldo + cantidad;
    }

    public void imprimirBoleto() {
        if (saldo >= precio) {
            System.out.println("####################");
            System.out.println("# Boleto de futbol");
            System.out.println("# Precio: " + precio + " XAF");
            System.out.println("####################");
            System.out.println();
            total = total + precio;
            saldo = saldo - precio;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MaquinaBoletos mb = new MaquinaBoletos(1000);
        mb.ingresarDinero(5000);
        mb.imprimirBoleto();
        mb.imprimirBoleto();
        System.out.println("Saldo restante: " + mb.getSaldo() + " XAF");
        System.out.println("Total recaudado: " + mb.getTotal() + " XAF");
    }
}
