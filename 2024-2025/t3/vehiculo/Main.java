
package t3.vehiculo;

    // Prueba
    public class Main {
        public static void main(String[] args) {
            Vehiculo v1 = new Coche("Toyota", 180, 4);
            Vehiculo v2 = new Moto("Honda", 160, false);
    
            v1.mostrarInfo();
            v2.mostrarInfo();
        }
    }