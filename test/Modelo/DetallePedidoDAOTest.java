package Modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danie
 */
public class DetallePedidoDAOTest {
    
    @Test
    public void testCantidadNueva() {
        System.out.println("cantidadNueva");
        DetallePedidoDAO instance = new DetallePedidoDAO();
        int resultadoEsperado = 8;
        int resultado = instance.cantidadNueva(10, 2);
        assertEquals(resultadoEsperado, resultado, 0.0);
        if(resultado != resultadoEsperado) {
            fail("Fallo");
        }
    }
    
}
