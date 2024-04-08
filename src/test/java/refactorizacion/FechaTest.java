package refactorizacion;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class FechaTest {

    @Test
    public void testFechaValida() {
        Fecha fecha1 = new Fecha(5, 4, 2024);
        assertTrue(fecha1.valida());

        Fecha fecha2 = new Fecha(29, 2, 2020);
        assertTrue(fecha2.valida());
    }

    @Test
    public void testFechaDiaInvalido() {
        Fecha fecha = new Fecha(32, 4, 2024);
        assertFalse(fecha.valida());
    }

    @Test
    public void testFechaMesInvalido() {
        Fecha fecha = new Fecha(15, 14, 2024);
        assertFalse(fecha.valida());
    }

    @Test
    public void testFechaAnioInvalido() {
        Fecha fecha = new Fecha(15, 4, -2024);
        assertFalse(fecha.valida());
    }

    @Test
    public void testFechaDiaInvalidoFebrero() {
        Fecha fecha = new Fecha(29, 2, 2023);
        assertFalse(fecha.valida());
    }

    @Test
    public void testFechaBisiesto() {
        Fecha fecha = new Fecha(29, 2, 2020);
        assertTrue(fecha.valida());
    }

    @Test
    public void testFechaNoBisiesto() {
        Fecha fecha = new Fecha(29, 2, 2021);
        assertFalse(fecha.valida());
    }
}
