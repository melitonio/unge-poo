package t3.vehiculo;

    // Subclase Moto
    class Moto extends Vehiculo {
        private final boolean sidecar;
    
        public Moto(String marca, int vmax, boolean sidecar) {
            super(marca, vmax);
            this.sidecar = sidecar;
        }
    
        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("  Tipo: Moto, Sidecar: " + (sidecar ? "sí" : "no"));
        }
    }