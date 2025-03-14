package estudiante2;

public class Estudiante {
    private String nombre;
    private String id;
    private int creditos;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.creditos = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return this.id;
    }

    public int getCreditos() {
        return this.creditos;
    }

    public String getNombreUsuario() {
        return nombre.substring(0, 4) + id.substring(0, 3);
    }

    public void imprimir() {
        System.out.println(nombre + " (" + id + ")" + " creditos: " + creditos);
    }

    public void sumarCreditos(int creditos) {
        this.creditos += creditos;
    }

}
