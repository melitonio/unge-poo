package t1.persona;

import java.util.Calendar;

class Persona {

    private String nombre;
    private String apellidos;
    private String fechaNacimiento; // formato dd/mm/aaaa
    private char sexo;
    private double peso;

    public Persona(String nombre, String apellidos, String fechaNacimiento, char sexo, double peso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        if (peso < 0) {
            System.out.println("El peso no puede ser negativo.");
            return;
        }
        this.peso = peso;
    }

    public int edad(int a) {
        return a - Integer.parseInt(fechaNacimiento.substring(6, 10));
    }

    public String nombreCompleto() {
        return nombre + " " + apellidos;
    }

    public void mostrarInformacion() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("### DATOS PERSONALES ###");
        System.out.println("\tNombre: " + nombre + " " + apellidos);
        System.out.println("\tEdad:   " + edad(year));
        System.out.println("\tSexo:   " + sexo);
        System.out.println("\tPeso:   " + peso);
        System.out.println("### ### ### ### ### ###");
        System.out.println();
    }

    public String saludar() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int h = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        // Formatear el mensaje de saludo
        String mensaje = String.format("""
                Hola, soy %s, de sexo %s, peso %.1fKg y edad %d años.
                Son las %dH y vamos a comenzar con el trabajo en grupo.
                
                """,
                this.nombreCompleto(), this.sexo, this.peso, this.edad(year), h);
        return mensaje;
    }

    public boolean esMayorDeEdad() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return edad(year) >= 18;
    }

    public boolean esMayorQue(Persona p) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return edad(year) > p.edad(year);
    }

}

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", "Belope", "01/01/2000", 'M', 70);
        Persona p2 = new Persona("Maria", "Nchama", "01/01/1990", 'F', 60);

        p1.mostrarInformacion();
        p2.mostrarInformacion();

        System.out.println(p1.saludar());
        System.out.println(p2.saludar());

        System.out.println(p1.nombreCompleto() + " es mayor de edad: " + p1.esMayorDeEdad());
        System.out.println(p2.nombreCompleto() + " es mayor de edad: " + p2.esMayorDeEdad());

        System.out.println(p1.nombreCompleto() + " es mayor que " + p2.nombreCompleto() + ": " + p1.esMayorQue(p2));
        System.out.println(p2.nombreCompleto() + " es mayor que " + p1.nombreCompleto() + ": " + p2.esMayorQue(p1));
    }
}
