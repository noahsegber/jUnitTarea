import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class posicionTest {


	@Test
    public void testEncontrarPosicionesDigitoPresente() {
        List<Integer> posicionesEsperadas = Arrays.asList(0, 2);
        List<Integer> posicionesObtenidas = posicion.encontrarPosiciones(123123, 1);
        assertEquals(posicionesEsperadas, posicionesObtenidas);
    }

    @Test
    public void testEncontrarPosicionesDigitoNoPresente() {
        List<Integer> posicionesEsperadas = Arrays.asList();
        List<Integer> posicionesObtenidas = posicion.encontrarPosiciones(123456, 7);
        assertEquals(posicionesEsperadas, posicionesObtenidas);
    }

    @Test
    public void testEncontrarPosicionesNumeroNegativo() {
        List<Integer> posicionesEsperadas = Arrays.asList(1, 4);
        List<Integer> posicionesObtenidas = posicion.encontrarPosiciones(-123451, 1);
        assertEquals(posicionesEsperadas, posicionesObtenidas);
    }

    
}
