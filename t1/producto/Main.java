package producto;

class Producto {

    // Atributos
    String nombre;
    double precio;
    int stock;

    // Método para actualizar el precio
    void actualizarPrecio(double nuevoPrecio) {
        precio = nuevoPrecio;
        System.out.println("El nuevo precio de " + nombre + " es: $" + precio);
    }

    // Método para vender productos
    void vender(int cantidad) {
        if (cantidad > stock) {
            System.out.println("No hay suficiente stock de " + nombre);
        } else {
            stock -= cantidad;
            System.out.println("Se han vendido " + cantidad + " unidades de " + nombre);
        }
    }

    // Método para mostrar información del producto
    void mostrarInformacion() {
        System.out.println("Producto: " + nombre + "\nPrecio: $" + precio + "\nStock: " + stock);
    }
}

public class Main {

    public static void main(String[] args) {
        // Creando el primer producto
        Producto producto1 = new Producto();
        producto1.nombre = "Laptop";
        producto1.precio = 1200.50;
        producto1.stock = 10;

        // Creando el segundo producto
        Producto producto2 = new Producto();
        producto2.nombre = "Smartphone";
        producto2.precio = 750.99;
        producto2.stock = 5;

        // Mostrando información
        producto1.mostrarInformacion();
        producto2.mostrarInformacion();

        // Probando la actualización de precio
        producto1.actualizarPrecio(1100.75);

        // Probando la venta de productos
        producto2.vender(3);
        producto2.mostrarInformacion();
    }

}
