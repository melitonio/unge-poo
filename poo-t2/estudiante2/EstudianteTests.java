package estudiante2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import estudiante.Estudiante;

public class EstudianteTests {

    // crear método main
    public static void main(String[] args) {
        EstudianteTests tests = new EstudianteTests();
        tests.testNombre();
        tests.testNombre();
        tests.testId();
        tests.testCreditos();
        tests.testNombreUsuario();
        tests.testSumarCreditos();
    }


    @Test
    public void testNombre() {
        Estudiante estudiante = new Estudiante("Juan", "123");
        assertEquals(estudiante.getNombre(), "Juan");
    }

    @Test
    public void testId() {
        Estudiante estudiante = new Estudiante("Juan", "123");
        assertEquals(estudiante.getId(), "123");
    }

    @Test
    public void testCreditos() {
        Estudiante estudiante = new Estudiante("Juan", "123");
        assertEquals(estudiante.getCreditos(), 0);
    }

    @Test
    public void testNombreUsuario() {
        Estudiante estudiante = new Estudiante("Juan", "123");
        System.out.println(estudiante.getNombreUsuario());
        assertEquals(estudiante.getNombreUsuario(), "Juan123");
    }

    @Test
    public void testSumarCreditos() {
        Estudiante estudiante = new Estudiante("Juan", "123");
        estudiante.sumarCreditos(50);
        assertEquals(estudiante.getCreditos(), 50);
    }
}
