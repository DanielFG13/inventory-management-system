package Modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danie
 */
public class EntradaDAOTest {

    @Test
    public void testSumarCantidad() {
        System.out.println("sumarCantidad");
        EntradaDAO entradaMaterial = new EntradaDAO();
        long resultado = entradaMaterial.sumarCantidad(2, 3);
        long resultadoEsperado = 5;
        assertEquals(resultado, resultadoEsperado, 0.0);
        if(resultado != resultadoEsperado) {
            fail("Fallo");
        }
    }

}
