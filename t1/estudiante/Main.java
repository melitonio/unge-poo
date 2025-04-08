package estudiante;

class Estudiante {

    String nombre;
    int edad;
    String carrera;

    void estudiar() {
        System.out.println(nombre + " está estudiando!");
    }

    void presentarse() {
        System.out.println("Hola, soy " + nombre + ", tengo " + edad + " años y estudio " + carrera);
    }
}

public class Main {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Juan Belope";
        estudiante1.edad = 20;
        estudiante1.carrera = "Grado I en Informática de Gestión Empresarial";
        
        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "María Nchama";
        estudiante2.edad = 21;
        estudiante2.carrera = "Grado en Ciencias Económicas";
        
        estudiante1.presentarse();
        estudiante1.estudiar();
        estudiante2.presentarse();
        estudiante2.estudiar();
    }
}
