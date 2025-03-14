package clasesobjetos;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class PersonaTests {
    @Test
    public void testPersona() {
        Persona p = new Persona("Juan", "Perez", "01/01/2000", 'H', 70.0);
        assertEquals("Juan", p.getNombre());
        assertEquals("Perez", p.getApellidos());
        assertEquals("01/01/2000", p.getFechaNacimiento());
        assertEquals('H', p.getSexo());
        assertEquals(70.0, p.getPeso(), 0.0);
    }

    @Test
    public void testEdad() {
        Persona p = new Persona("Juan", "Perez", "01/01/2000", 'H', 70.0);
        assertEquals(21, p.edad(2021));
    }

    @Test
    public void testSetNombre() {
        Persona p = new Persona("Juan", "Perez", "01/01/2000", 'H', 70.0);
        p.setNombre("Pedro");
        assertEquals("Pedro", p.getNombre());
    }

    @Test
    public void testSetApellidos() {
        Persona p = new Persona("Juan", "Perez", "01/01/2000", 'H', 70.0);
        p.setApellidos("Gomez");
        assertEquals("Gomez", p.getApellidos());
    }

    @Test
    public void testSetFechaNacimiento() {
        Persona p = new Persona("Juan", "Perez", "01/01/2000", 'H', 70.0);
        p.setFechaNacimiento("02/02/2000");
        assertEquals("02/02/2000", p.getFechaNacimiento());
    }

    @Test
    public void testSetSexo() {
        Persona p = new Persona("Juan", "Perez", "01/01/2000", 'H', 70.0);
        p.setSexo('M');
        assertEquals('M', p.getSexo());
    }

    @Test
    public void testSetPeso() {
        Persona p = new Persona("Juan", "Perez", "01/01/2000", 'H', 70.0);
        p.setPeso(75.0);
        assertEquals(75.0, p.getPeso(), 0.0);
    }

    @Test
    public void testGetNombre() {
        Persona p = new Persona("Juan", "Perez", "01/01/2000", 'H', 70.0);
        assertEquals("Juan", p.getNombre());
    }

    @Test
    public void testGetApellidos() {
        Persona p = new Persona("Juan", "Perez", "01/01/2000", 'H', 70.0);
        assertEquals("Perez", p.getApellidos());
    }

    @Test
    public void testGetFechaNacimiento() {
        Persona p = new Persona("Juan", "Perez", "01/01/2000", 'H', 70.0);
        assertEquals("01/01/2000", p.getFechaNacimiento());
    }

    @Test
    public void testGetSexo() {
        Persona p = new Persona("Juan", "Perez", "01/01/2000", 'H', 70.0);
        assertEquals('H', p.getSexo());
    }

    @Test
    public void testGetPeso() {
        Persona p = new Persona("Juan", "Perez", "01/01/2000", 'H', 70.0);
        assertEquals(70.0, p.getPeso(), 0.0);
    }

    @Test
    public void testImprimir() {
        Persona p = new Persona("Antonia", "Oyana Mun", "27-04-1997", 'F', 62.7);
        p.imprimir();
    }

    @Test
    public void testSaludar() {
        Persona p = new Persona("Antonia", "Oyana Mun", "27-04-1997", 'F', 62.7);
        System.out.println(p.saludo());    
    }

    @Test
    public void testNombreCompleto()
    {  
        Persona p = new Persona("Juan", "Perez Gonzalez", "01/01/2000", 'H', 70.0);
        assertEquals("Juan Perez Gonzalez", p.nombreCompleto());
    }
}