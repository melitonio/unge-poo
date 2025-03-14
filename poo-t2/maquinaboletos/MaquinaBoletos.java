package maquinaboletos;

public class MaquinaBoletos {
    private double precio;
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
            System.out.println("# Precio: " + precio + " XAF" );
            System.out.println("####################");
            System.out.println();
            total = total + precio;
            saldo = saldo - precio;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
