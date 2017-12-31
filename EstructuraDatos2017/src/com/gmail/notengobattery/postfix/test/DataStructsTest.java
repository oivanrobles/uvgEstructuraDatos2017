import com.gmail.notengobattery.postfix.ArrayList2;
import com.gmail.notengobattery.postfix.Consumible;
import com.gmail.notengobattery.postfix.FabricaConsumibles;
import com.gmail.notengobattery.postfix.IPila;
import com.gmail.notengobattery.postfix.Lista;
import com.gmail.notengobattery.postfix.ListaCircular;
import com.gmail.notengobattery.postfix.ListaDoble;
import com.gmail.notengobattery.postfix.PilaFabricada;
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
        final Consumible<Integer> l_vector = new Vector<Integer>(25, 1);
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

    /**
     * Prueba que el funcionamiento de la arraylist, sea correcto.
     */
    @Test
    public void testArrayList() {
        final Consumible<Integer> l_arrayList = new ArrayList2<>(10);
        l_arrayList.ponerValorInicio(3);
        l_arrayList.ponerValorFinal(4);
        l_arrayList.ponerValorInicio(2);
        l_arrayList.ponerValorFinal(5);
        l_arrayList.ponerValorInicio(1);
        l_arrayList.ponerValorFinal(6);
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList.quitarValorFinal(), is(equalTo(6)));
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList.quitarValorInicio(), is(equalTo(1)));
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList.quitarValorFinal(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList.quitarValorInicio(), is(equalTo(2)));
        l_arrayList.ponerValorInicio(6);
        l_arrayList.ponerValorFinal(5);
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList.quitarValorFinal(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList.quitarValorInicio(), is(equalTo(6)));
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList.quitarValorFinal(), is(equalTo(4)));
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList.quitarValorInicio(), is(equalTo(3)));
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList.quitarValorInicio(), is(equalTo(null)));
        l_arrayList.ponerValorInicio(5);
        l_arrayList.ponerValorFinal(6);
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList.quitarValorFinal(), is(equalTo(6)));
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList.quitarValorInicio(), is(equalTo(5)));
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList.quitarValorFinal(), is(equalTo(null)));
        l_arrayList.ponerValorFinal(10);
        l_arrayList.ponerValorInicio(9);
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList.quitarValorInicio(), is(equalTo(9)));
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList.quitarValorFinal(), is(equalTo(10)));
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList.quitarValorInicio(), is(equalTo(null)));
    }

    /**
     * Realiza las pruebas unitarias para comprobar que la pila funciona de manera correcta.
     * Prueba tanto la fábrica {@link PilaFabricada}, como cada uno de las estructuras de datos
     * de la interfaz {@link Consumible}.
     */
    @Test
    public void testPila() {
        // Probar la pila FIFO basada en vectores
        final IPila<Integer> l_vectorFIFO = new PilaFabricada<>(true, FabricaConsumibles.VECTOR);
        l_vectorFIFO.producir(0);
        l_vectorFIFO.producir(1);
        assertThat(VALOR_NO_CORRESPONDE, l_vectorFIFO.consumir(), is(equalTo(1)));
        assertThat(VALOR_NO_CORRESPONDE, l_vectorFIFO.consumir(), is(equalTo(0)));
        assertThat(VALOR_NO_CORRESPONDE, l_vectorFIFO.consumir(), is(equalTo(null)));
        // Probar la pila LIFO basada en vectores
        final IPila<Integer> l_vectorLIFO = new PilaFabricada<>(false, FabricaConsumibles.VECTOR);
        l_vectorLIFO.producir(0);
        l_vectorLIFO.producir(1);
        assertThat(VALOR_NO_CORRESPONDE, l_vectorLIFO.consumir(), is(equalTo(0)));
        assertThat(VALOR_NO_CORRESPONDE, l_vectorLIFO.consumir(), is(equalTo(1)));
        assertThat(VALOR_NO_CORRESPONDE, l_vectorLIFO.consumir(), is(equalTo(null)));
        // Probar la pila FIFO basada en ArrayList2
        final IPila<Integer> l_arrayList2FIFO =
                new PilaFabricada<>(true, FabricaConsumibles.ARRAYLIST);
        l_arrayList2FIFO.producir(0);
        l_arrayList2FIFO.producir(1);
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList2FIFO.consumir(), is(equalTo(1)));
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList2FIFO.consumir(), is(equalTo(0)));
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList2FIFO.consumir(), is(equalTo(null)));
        // Probar la pila LIFO basada en ArrayList2
        final IPila<Integer> l_arrayList2LIFO =
                new PilaFabricada<>(false, FabricaConsumibles.VECTOR);
        l_arrayList2LIFO.producir(0);
        l_arrayList2LIFO.producir(1);
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList2LIFO.consumir(), is(equalTo(0)));
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList2LIFO.consumir(), is(equalTo(1)));
        assertThat(VALOR_NO_CORRESPONDE, l_arrayList2LIFO.consumir(), is(equalTo(null)));
        // Probar la pila FIFO basada en Lista Circular
        final IPila<Integer> l_listaCircularFIFO =
                new PilaFabricada<>(true, FabricaConsumibles.LISTA_CIRCULAR);
        l_listaCircularFIFO.producir(0);
        l_listaCircularFIFO.producir(1);
        assertThat(VALOR_NO_CORRESPONDE, l_listaCircularFIFO.consumir(), is(equalTo(1)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaCircularFIFO.consumir(), is(equalTo(0)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaCircularFIFO.consumir(), is(equalTo(null)));
        // Probar la pila LIFO basada en Lista Circular
        final IPila<Integer> l_listaCircularLIFO =
                new PilaFabricada<>(false, FabricaConsumibles.LISTA_CIRCULAR);
        l_listaCircularLIFO.producir(0);
        l_listaCircularLIFO.producir(1);
        assertThat(VALOR_NO_CORRESPONDE, l_listaCircularLIFO.consumir(), is(equalTo(0)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaCircularLIFO.consumir(), is(equalTo(1)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaCircularLIFO.consumir(), is(equalTo(null)));
        // Probar la pila FIFO basada en Lista Simple
        final IPila<Integer> l_listaFIFO =
                new PilaFabricada<>(true, FabricaConsumibles.LISTA_SIMPLE);
        l_listaFIFO.producir(0);
        l_listaFIFO.producir(1);
        assertThat(VALOR_NO_CORRESPONDE, l_listaFIFO.consumir(), is(equalTo(1)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaFIFO.consumir(), is(equalTo(0)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaFIFO.consumir(), is(equalTo(null)));
        // Probar la pila LIFO basada en Lista Simple
        final IPila<Integer> l_listaLIFO =
                new PilaFabricada<>(false, FabricaConsumibles.LISTA_CIRCULAR);
        l_listaLIFO.producir(0);
        l_listaLIFO.producir(1);
        assertThat(VALOR_NO_CORRESPONDE, l_listaLIFO.consumir(), is(equalTo(0)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaLIFO.consumir(), is(equalTo(1)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaLIFO.consumir(), is(equalTo(null)));
        // Probar la pila FIFO basada en Lista Doble
        final IPila<Integer> l_listaDobleFIFO =
                new PilaFabricada<>(true, FabricaConsumibles.LISTA_DOBLE);
        l_listaDobleFIFO.producir(0);
        l_listaDobleFIFO.producir(1);
        assertThat(VALOR_NO_CORRESPONDE, l_listaDobleFIFO.consumir(), is(equalTo(1)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaDobleFIFO.consumir(), is(equalTo(0)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaDobleFIFO.consumir(), is(equalTo(null)));
        // Probar la pila LIFO basada en Lista Doble
        final IPila<Integer> l_listaDobleLIFO =
                new PilaFabricada<>(false, FabricaConsumibles.LISTA_DOBLE);
        l_listaDobleLIFO.producir(0);
        l_listaDobleLIFO.producir(1);
        assertThat(VALOR_NO_CORRESPONDE, l_listaDobleLIFO.consumir(), is(equalTo(0)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaDobleLIFO.consumir(), is(equalTo(1)));
        assertThat(VALOR_NO_CORRESPONDE, l_listaDobleLIFO.consumir(), is(equalTo(null)));
    }
}
