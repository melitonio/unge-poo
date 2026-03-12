package t2.empleado;

public class Main {

    public static void main(String[] args) {
        // Crear un objeto de la clase Empleado
        Empleado empleado = new Empleado("Juan", "Desarrollador", 30, 50000);
        System.out.println("Nombre: " + empleado.nombre); //Ok: Acceso público
        // System.out.println("Puesto: " + empleado.puesto); // Error: puesto es protected
        System.out.println("Edad: " + empleado.edad); // Ok: edad es package-private (default)
        // System.out.println("Salario: " + empleado.salario); // Error: salario es private

        Contable contable = new Contable("Ana", "Contable", 28, 60000);
        contable.mostrarInformacion(); // Ok: método público
        contable.mosstarPuestoContable();
    }
}
