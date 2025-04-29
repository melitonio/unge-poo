package t3.vehiculo;

    // Superclase
    class Vehiculo {
        protected String marca;
        protected int velocidadMaxima;
    
        public Vehiculo(String marca, int vmax) {
            this.marca = marca;
            this.velocidadMaxima = vmax;
        }
    
        public void mostrarInfo() {
            System.out.println("Vehículo → Marca: " + marca + ", VMax: " + velocidadMaxima);
        }
    }