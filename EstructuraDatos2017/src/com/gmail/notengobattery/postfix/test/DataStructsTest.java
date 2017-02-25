import com.gmail.notengobattery.postfix.Consumible;
import com.gmail.notengobattery.postfix.Lista;
import com.gmail.notengobattery.postfix.ListaCircular;
import com.gmail.notengobattery.postfix.ListaDoble;
import com.gmail.notengobattery.postfix.Vector;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Pruebas unitarias para las estructuras de datos del ejercicio.
 */
public class DataStructsTest {
    private static final String VALOR_NO_CORRESPONDE =
            "Aserción fallida: el valor extraído no corresponde con el esperado.";

    /**
     * Prueba que el funcionamiento del vector, sea correcto.
     */
    @Test
    public void testVector() {
        final Consumible<Integer> l_vector = new Vector<Integer>(3, 1);
        l_vector.ponerValorInicio(3);
        l_vector.ponerValorFinal(4);
        l_vector.ponerValorInicio(2);
        l_vector.ponerValorFinal(5);
        l_vector.ponerValorInicio(1);
        l_vector.ponerValorFinal(6);
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorFinal(), is(equalTo(6)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorInicio(), is(equalTo(1)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorFinal(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorInicio(), is(equalTo(2)));
        l_vector.ponerValorInicio(6);
        l_vector.ponerValorFinal(5);
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorFinal(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorInicio(), is(equalTo(6)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorFinal(), is(equalTo(4)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorInicio(), is(equalTo(3)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorInicio(), is(equalTo(null)));
        l_vector.ponerValorInicio(5);
        l_vector.ponerValorFinal(6);
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorFinal(), is(equalTo(6)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorInicio(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorFinal(), is(equalTo(null)));
        l_vector.ponerValorFinal(10);
        l_vector.ponerValorInicio(9);
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorInicio(), is(equalTo(9)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorFinal(), is(equalTo(10)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorInicio(), is(equalTo(null)));
    }

    /**
     * Prueba que el funcionamiento de la lista simple, sea correcto.
     */
    @Test
    public void testListaNormal() {
        final Consumible<Integer> l_lSimple = new Lista<>();
        l_lSimple.ponerValorInicio(3);
        l_lSimple.ponerValorFinal(4);
        l_lSimple.ponerValorInicio(2);
        l_lSimple.ponerValorFinal(5);
        l_lSimple.ponerValorInicio(1);
        l_lSimple.ponerValorFinal(6);
        assertThat(VALOR_NO_CORRESPONDE, l_lSimple.quitarValorFinal(), is(equalTo(6)));
        assertThat(VALOR_NO_CORRESPONDE, l_lSimple.quitarValorInicio(), is(equalTo(1)));
        assertThat(VALOR_NO_CORRESPONDE, l_lSimple.quitarValorFinal(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_lSimple.quitarValorInicio(), is(equalTo(2)));
        l_lSimple.ponerValorInicio(6);
        l_lSimple.ponerValorFinal(5);
        assertThat(VALOR_NO_CORRESPONDE, l_lSimple.quitarValorFinal(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_lSimple.quitarValorInicio(), is(equalTo(6)));
        assertThat(VALOR_NO_CORRESPONDE, l_lSimple.quitarValorFinal(), is(equalTo(4)));
        assertThat(VALOR_NO_CORRESPONDE, l_lSimple.quitarValorInicio(), is(equalTo(3)));
        assertThat(VALOR_NO_CORRESPONDE, l_lSimple.quitarValorInicio(), is(equalTo(null)));
        l_lSimple.ponerValorInicio(5);
        l_lSimple.ponerValorFinal(6);
        assertThat(VALOR_NO_CORRESPONDE, l_lSimple.quitarValorFinal(), is(equalTo(6)));
        assertThat(VALOR_NO_CORRESPONDE, l_lSimple.quitarValorInicio(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_lSimple.quitarValorFinal(), is(equalTo(null)));
        l_lSimple.ponerValorFinal(10);
        l_lSimple.ponerValorInicio(9);
        assertThat(VALOR_NO_CORRESPONDE, l_lSimple.quitarValorInicio(), is(equalTo(9)));
        assertThat(VALOR_NO_CORRESPONDE, l_lSimple.quitarValorFinal(), is(equalTo(10)));
        assertThat(VALOR_NO_CORRESPONDE, l_lSimple.quitarValorInicio(), is(equalTo(null)));
    }

    /**
     * Prueba que el funcionamiento de la lista doble, sea correcto.
     */
    @Test
    public void testListaDoble() {
        final Consumible<Integer> l_doble = new ListaDoble<>();
        l_doble.ponerValorInicio(3);
        l_doble.ponerValorFinal(4);
        l_doble.ponerValorInicio(2);
        l_doble.ponerValorFinal(5);
        l_doble.ponerValorInicio(1);
        l_doble.ponerValorFinal(6);
        assertThat(VALOR_NO_CORRESPONDE, l_doble.quitarValorFinal(), is(equalTo(6)));
        assertThat(VALOR_NO_CORRESPONDE, l_doble.quitarValorInicio(), is(equalTo(1)));
        assertThat(VALOR_NO_CORRESPONDE, l_doble.quitarValorFinal(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_doble.quitarValorInicio(), is(equalTo(2)));
        l_doble.ponerValorInicio(6);
        l_doble.ponerValorFinal(5);
        assertThat(VALOR_NO_CORRESPONDE, l_doble.quitarValorFinal(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_doble.quitarValorInicio(), is(equalTo(6)));
        assertThat(VALOR_NO_CORRESPONDE, l_doble.quitarValorFinal(), is(equalTo(4)));
        assertThat(VALOR_NO_CORRESPONDE, l_doble.quitarValorInicio(), is(equalTo(3)));
        assertThat(VALOR_NO_CORRESPONDE, l_doble.quitarValorInicio(), is(equalTo(null)));
        l_doble.ponerValorInicio(5);
        l_doble.ponerValorFinal(6);
        assertThat(VALOR_NO_CORRESPONDE, l_doble.quitarValorFinal(), is(equalTo(6)));
        assertThat(VALOR_NO_CORRESPONDE, l_doble.quitarValorInicio(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_doble.quitarValorFinal(), is(equalTo(null)));
        l_doble.ponerValorFinal(10);
        l_doble.ponerValorInicio(9);
        assertThat(VALOR_NO_CORRESPONDE, l_doble.quitarValorInicio(), is(equalTo(9)));
        assertThat(VALOR_NO_CORRESPONDE, l_doble.quitarValorFinal(), is(equalTo(10)));
        assertThat(VALOR_NO_CORRESPONDE, l_doble.quitarValorInicio(), is(equalTo(null)));
    }

    /**
     * Prueba que el funcionamiento de la lista circular, sea correcto.
     */
    @Test
    public void testListaCircular() {
        final Consumible<Integer> l_circular = new ListaCircular<>();
        l_circular.ponerValorInicio(3);
        l_circular.ponerValorFinal(4);
        l_circular.ponerValorInicio(2);
        l_circular.ponerValorFinal(5);
        l_circular.ponerValorInicio(1);
        l_circular.ponerValorFinal(6);
        assertThat(VALOR_NO_CORRESPONDE, l_circular.quitarValorFinal(), is(equalTo(6)));
        assertThat(VALOR_NO_CORRESPONDE, l_circular.quitarValorInicio(), is(equalTo(1)));
        assertThat(VALOR_NO_CORRESPONDE, l_circular.quitarValorFinal(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_circular.quitarValorInicio(), is(equalTo(2)));
        l_circular.ponerValorInicio(6);
        l_circular.ponerValorFinal(5);
        assertThat(VALOR_NO_CORRESPONDE, l_circular.quitarValorFinal(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_circular.quitarValorInicio(), is(equalTo(6)));
        assertThat(VALOR_NO_CORRESPONDE, l_circular.quitarValorFinal(), is(equalTo(4)));
        assertThat(VALOR_NO_CORRESPONDE, l_circular.quitarValorInicio(), is(equalTo(3)));
        assertThat(VALOR_NO_CORRESPONDE, l_circular.quitarValorInicio(), is(equalTo(null)));
        l_circular.ponerValorInicio(5);
        l_circular.ponerValorFinal(6);
        assertThat(VALOR_NO_CORRESPONDE, l_circular.quitarValorFinal(), is(equalTo(6)));
        assertThat(VALOR_NO_CORRESPONDE, l_circular.quitarValorInicio(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_circular.quitarValorFinal(), is(equalTo(null)));
        l_circular.ponerValorFinal(10);
        l_circular.ponerValorInicio(9);
        assertThat(VALOR_NO_CORRESPONDE, l_circular.quitarValorInicio(), is(equalTo(9)));
        assertThat(VALOR_NO_CORRESPONDE, l_circular.quitarValorFinal(), is(equalTo(10)));
        assertThat(VALOR_NO_CORRESPONDE, l_circular.quitarValorInicio(), is(equalTo(null)));
    }
}
