package t2.actividad2;

class Asignatura {
    private String nombre;
    private int creditos;
    private String curso;
    private double nota;

    public Asignatura(String nombre, int creditos, String curso, double nota) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.curso = curso;
    }

    public void setNota(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota no válida. Debe estar entre 0 y 10.");
            return;
        }
        this.nota = nota;
    }
}
