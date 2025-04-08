package t1.actividad1;

import java.io.*;
import java.util.ArrayList;

class Producto {

    String nombre;
    double precio;
    int stock;

    // Constructor
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Métodos a completar
    void actualizarPrecio(double nuevoPrecio) {
        // Todo
    }

    void vender(int cantidad) {
        // Todo
    }

    void agregarStock(int cantidad) {
        // Todo
    }

    void mostrarInformacion() {
        // Todo
    }
}

class Inventario {

    ArrayList<Producto> productos = new ArrayList<>();

    // Métodos a implementar

    void agregarProducto(Producto p) {
        // Todo
    }

    Producto buscarProducto(String nombre) {
        // Todo
        return null;
    }

    void mostrarInventario() {
        // Todo
    }

    void eliminarProducto(String nombre) {
        // Todo
    }

    void cargarDesdeArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 3) { // Asegura que haya 3 valores
                    try {
                        String nombre = datos[0];
                        double precio = Double.parseDouble(datos[1]);
                        int stock = Integer.parseInt(datos[2]);
                        productos.add(new Producto(nombre, precio, stock));
                    } catch (NumberFormatException e) {
                        System.out.println("Error en formato numérico: " + linea);
                    }
                } else {
                    System.out.println("Formato incorrecto en línea: " + linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    

    void guardarEnArchivo(String nombreArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Producto p : productos) {
                bw.write(p.nombre + "," + p.precio + "," + p.stock);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

}

public class Main {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();
        inventario.cargarDesdeArchivo("inventario.txt");
        System.out.println("Inventario cargado correctamente con " + inventario.productos.size() + " productos.");

        // Agregar productos de prueba
        inventario.agregarProducto(new Producto("Laptop", 1200.0, 10));
        inventario.agregarProducto(new Producto("Teléfono", 800.0, 5));

        // Llamar a métodos de inventario
        inventario.mostrarInventario();

        inventario.guardarEnArchivo("inventario.txt");
    }
}
