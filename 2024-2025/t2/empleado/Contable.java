package t2.empleado;

public class Contable extends Empleado {

    // Constructor
    public Contable(String nombre, String puesto, int edad, double salario) {
        super(nombre, puesto, edad, salario);
    }

    // Método para mostrar información del contable
    public void mostrarInformacionContable() {
        System.out.println("Nombre: " + nombre + ", Puesto: " + puesto + ", Edad: " + edad);
        // System.out.println("Salario: " + salario); // Error: salario es private en la clase padre
    }

    // Método para calcular bonificación (puede acceder al método privado de la clase padre)
    public double calcularBonificacionContable() {
        return getSalario() * 0.10; // Usando el getter para acceder al salario
    }

    public void mosstarPuestoContable() {
        mostrarPuesto(); // Llama al método protegido de la clase padre
    }

}
