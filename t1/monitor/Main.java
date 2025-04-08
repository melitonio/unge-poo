package t1.monitor;

class Monitor {
    private double pulgadas;
    private String resolucion;

    public Monitor(double pulgadas, String resolucion)
    {
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
    }

    public void mostrarInformacion()
    {
        System.out.println("Pulgadas: " + pulgadas);
        System.out.println("Resolucion: " + resolucion);
    }
}

public class Main
{
    public static void main(String[] args) {
        Monitor m1 = new Monitor(15.4, "1280 x 900");
        m1.mostrarInformacion();
    }
}
