package estudiante2;

public class Estudiante {
    private String nombre;
    private final String matricula;
    private int creditos;

    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.creditos = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public int getCreditos() {
        return this.creditos;
    }

    public String getNombreUsuario() {
        return nombre.substring(0, 4) + matricula.substring(0, 3);
    }

    public void imprimir() {
        System.out.println(nombre + " (" + matricula + ")" + " creditos: " + creditos);
    }

    public void sumarCreditos(int creditos) {
        this.creditos += creditos;
    }

}
