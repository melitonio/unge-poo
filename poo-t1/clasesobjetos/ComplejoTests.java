package clasesobjetos;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ComplejoTests {
    @Test
    public void testComplejo() {
        Complejo c1 = new Complejo(3, 4);
        Complejo c2 = new Complejo(1, 2);

        assertEquals(3.0, c1.getReal(), 0.0);
        assertEquals(4.0, c1.getImg(), 0.0);
        assertEquals(1.0, c2.getReal(), 0.0);
        assertEquals(2.0, c2.getImg(), 0.0);
    }

    @Test
    public void testSumar() {
        Complejo c1 = new Complejo(3, 4);
        Complejo c2 = new Complejo(1, 2);

        c1.sumar(c2);

        assertEquals(4.0, c1.getReal(), 0.0);
        assertEquals(6.0, c1.getImg(), 0.0);
    }

    @Test
    public void testRestar() {
        Complejo c1 = new Complejo(3, 4);
        Complejo c2 = new Complejo(1, 2);

        c1.restar(c2);

        assertEquals(2.0, c1.getReal(), 0.0);
        assertEquals(2.0, c1.getImg(), 0.0);
    }

    @Test
    public void testModulo() {
        Complejo c1 = new Complejo(3, 4);
        Complejo c2 = new Complejo(1, 2);

        assertEquals(5.0, c1.modulo(), 0.0);
        assertEquals(2.23606797749979, c2.modulo(), 0.00000000000001);
    }

    @Test
    public void testImprimir() {
        Complejo c1 = new Complejo(3, 4);
        Complejo c2 = new Complejo(1, 2);

        c1.imprimir();
        c2.imprimir();
    }

    @Test
    public void testGetReal() {
        Complejo c1 = new Complejo(3, 4);

        assertEquals(3.0, c1.getReal(), 0.0);
    }
}
