package t2.empleado;

class Empleado {

    public String nombre; // Cualquiera puede acceder al nombre
    protected String puesto; // Accesible desde subclases y dentro del paquete
    int edad; // (default) Solo accesible desde el mismo paquete
    private double salario; // Solo accesible dentro de esta clase

    // Constructor
    public Empleado(String nombre, String puesto, int edad, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.edad = edad;
        this.salario = salario;
    }

    // Método público para mostrar información básica
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Puesto: " + puesto + ", Edad: " + edad);
    }

    // Método privado para calcular bonificación (solo la clase lo usa)
    private double calcularBonificacion() {
        return salario * 0.10;
    }

    // Método protegido: útil para subclases (por ejemplo, en RRHH)
    protected void mostrarPuesto() {
        System.out.println("Puesto: " + puesto);
    }

    // Getter y Setter para salario (controlado)
    public double getSalario() {
        return salario;
    }

    public void setSalario(double nuevoSalario) {
        if (nuevoSalario > 0) {
            this.salario = nuevoSalario;
        } else {
            System.out.println("Salario no válido");
        }
    }
}
