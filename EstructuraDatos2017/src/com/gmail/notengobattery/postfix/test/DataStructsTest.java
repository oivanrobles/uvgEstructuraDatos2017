import com.gmail.notengobattery.postfix.Consumible;
import com.gmail.notengobattery.postfix.Lista;
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
        l_vector.ponerValorInicio(6);
        l_vector.ponerValorInicio(5);
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorFinal(), is(equalTo(4)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorFinal(), is(equalTo(3)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorInicio(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_vector.quitarValorInicio(), is(equalTo(6)));
    }

    /**
     * Prueba que el funcionamiento de la lista simple, sea correcto.
     */
    @Test
    public void testListaNormal() {
        final Consumible<Integer> l_listaSimple = new Lista<>();
        l_listaSimple.ponerValorFinal(1);
        l_listaSimple.ponerValorFinal(2);
        l_listaSimple.ponerValorFinal(3);
        l_listaSimple.ponerValorFinal(4);
        l_listaSimple.ponerValorFinal(5);
        l_listaSimple.ponerValorFinal(6);
        assertThat(VALOR_NO_CORRESPONDE, l_listaSimple.quitarValorFinal(), is(equalTo(6)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaSimple.quitarValorFinal(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaSimple.quitarValorInicio(), is(equalTo(1)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaSimple.quitarValorInicio(), is(equalTo(2)));
        l_listaSimple.ponerValorInicio(6);
        l_listaSimple.ponerValorInicio(5);
        assertThat(VALOR_NO_CORRESPONDE, l_listaSimple.quitarValorFinal(), is(equalTo(4)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaSimple.quitarValorFinal(), is(equalTo(3)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaSimple.quitarValorInicio(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaSimple.quitarValorInicio(), is(equalTo(6)));
    }

    /**
     * Prueba que el funcionamiento de la lista doble, sea correcto.
     */
    @Test
    public void testListaDoble() {
        final Consumible<Integer> l_listaDoble = new ListaDoble<>();
        l_listaDoble.ponerValorFinal(1);
        l_listaDoble.ponerValorFinal(2);
        l_listaDoble.ponerValorFinal(3);
        l_listaDoble.ponerValorFinal(4);
        l_listaDoble.ponerValorFinal(5);
        l_listaDoble.ponerValorFinal(6);
        assertThat(VALOR_NO_CORRESPONDE, l_listaDoble.quitarValorFinal(), is(equalTo(6)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaDoble.quitarValorFinal(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaDoble.quitarValorInicio(), is(equalTo(1)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaDoble.quitarValorInicio(), is(equalTo(2)));
        l_listaDoble.ponerValorInicio(6);
        l_listaDoble.ponerValorInicio(5);
        assertThat(VALOR_NO_CORRESPONDE, l_listaDoble.quitarValorFinal(), is(equalTo(4)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaDoble.quitarValorFinal(), is(equalTo(3)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaDoble.quitarValorInicio(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaDoble.quitarValorInicio(), is(equalTo(6)));
    }
}
