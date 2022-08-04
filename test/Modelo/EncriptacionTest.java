package Modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danie
 */
public class EncriptacionTest {
    
    @Test
    public void testEncode() {
        System.out.println("encode");
        String cadena = "admin";
        String resultadoEsperado = "bIO9Vp5r7pY=";
        String resultado = Encriptacion.encode(cadena);
        assertEquals(resultadoEsperado, resultado);
        if(!resultadoEsperado.equals(resultado)) {
            fail("Fallo");
        }
    }

    @Test
    public void testDecode() {
        System.out.println("decode");
        String cadena = "bIO9Vp5r7pY=";
        String resultadoEsperado = "admin";
        String resultado = Encriptacion.decode(cadena);
        assertEquals(resultadoEsperado, resultado);        
        if(!resultadoEsperado.equals(resultado)) {
            fail("Fallo");
        }
    }
    
}
