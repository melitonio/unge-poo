package t3.vehiculo;
// Subclase
class Coche extends Vehiculo {
    private final int numPuertas;

    public Coche(String marca, int vmax, int puertas) {
        super(marca, vmax);           // Llama al constructor de Vehiculo
        this.numPuertas = puertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();          // Reutiliza método de la superclase
        System.out.println("  Tipo: Coche, Puertas: " + numPuertas);
    }
}
