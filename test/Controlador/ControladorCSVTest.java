package Controlador;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danie
 */
public class ControladorCSVTest {
    
    @Test
    public void testCalcularTotal() {
        System.out.println("calcularTotal");
        ControladorCSV csv = new ControladorCSV();
        double resultadoEsperado = 15;
        double resultado = csv.calcularTotal(3, 5);
        assertEquals(resultadoEsperado, resultado, 0.0);
        if(resultado != resultadoEsperado) {
            fail("Fallo");
        }
    }
    
}
