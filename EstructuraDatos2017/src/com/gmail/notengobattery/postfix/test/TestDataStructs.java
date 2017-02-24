import com.gmail.notengobattery.postfix.Consumible;
import com.gmail.notengobattery.postfix.Vector;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Pruebas unitarias para las estructuras de datos del ejercicio.
 */
public class TestDataStructs {
    private static final String VALOR_NO_CORRESPONDE =
            "Aserción fallida: el valor extraído no corresponde con el esperado.";

    /**
     * Prueba que el funcionamiento del vector sea correcto.
     */
    @Test
    public void testVector() {
        final Consumible<Integer> l_vector = new Vector<Integer>(3, 1);
        l_vector.ponerValorFinal(1);
        l_vector.ponerValorFinal(2);
        l_vector.ponerValorFinal(3);
        l_vector.ponerValorFinal(4);
        l_vector.ponerValorFinal(5);
        l_vector.ponerValorFinal(6);
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorFinal(), is(equalTo(6)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorFinal(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorInicio(), is(equalTo(1)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorInicio(), is(equalTo(2)));
        l_vector.ponerValorInicio(10);
        l_vector.ponerValorInicio(9);
        l_vector.ponerValorInicio(8);
        l_vector.ponerValorInicio(7);
        l_vector.ponerValorInicio(6);
        l_vector.ponerValorInicio(5);
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorFinal(), is(equalTo(4)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorFinal(), is(equalTo(3)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorInicio(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorInicio(), is(equalTo(6)));
    }
}
