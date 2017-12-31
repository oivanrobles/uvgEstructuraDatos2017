import org.junit.Test;

import Listas.Lista;
import Sorting.Ordenamiento;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Pruebas unitarias para los métodos de Sorting
 */
public class SortingTest {

    private static final String LISTAS_NO_IGUALES = "Las listas no son iguales";

    /**
     * Realiza una prueba unitaria del método de ordenamiento, llamando al método y comparándolo
     * con la lista ordenada que contiene los mismos valores.
     */
    @Test
    public void testListaBubbleSort() {
        final Lista<Integer> l_lista = new Lista<Integer>();
        l_lista.AgregarNodo(10);
        l_lista.AgregarNodo(5);
        l_lista.AgregarNodo(-10);
        l_lista.AgregarNodo(30);
        l_lista.AgregarNodo(-100);
        Ordenamiento.bubbleSort(l_lista);
        final Lista<Integer> l_listaOrdenada = new Lista<Integer>();
        l_listaOrdenada.AgregarNodo(-100);
        l_listaOrdenada.AgregarNodo(-10);
        l_listaOrdenada.AgregarNodo(5);
        l_listaOrdenada.AgregarNodo(10);
        l_listaOrdenada.AgregarNodo(30);
        assertThat(LISTAS_NO_IGUALES, l_lista.toString(),
                is(equalTo(l_listaOrdenada.toString())));
    }

    /**
     * Realiza una prueba unitaria del método de ordenamiento, llamando al método y comparándolo
     * con la lista ordenada que contiene los mismos valores.
     */
    @Test
    public void testListaSelectionSort() {
        final Lista<Integer> l_lista = new Lista<Integer>();
        l_lista.AgregarNodo(10);
        l_lista.AgregarNodo(5);
        l_lista.AgregarNodo(-10);
        l_lista.AgregarNodo(30);
        l_lista.AgregarNodo(-100);
        Ordenamiento.selectionSort(l_lista);
        final Lista<Integer> l_listaOrdenada = new Lista<Integer>();
        l_listaOrdenada.AgregarNodo(-100);
        l_listaOrdenada.AgregarNodo(-10);
        l_listaOrdenada.AgregarNodo(5);
        l_listaOrdenada.AgregarNodo(10);
        l_listaOrdenada.AgregarNodo(30);
        assertThat(LISTAS_NO_IGUALES, l_lista.toString(),
                is(equalTo(l_listaOrdenada.toString())));
    }

    /**
     * Realiza una prueba unitaria del método de ordenamiento, llamando al método y comparándolo
     * con la lista ordenada que contiene los mismos valores.
     */
    @Test
    public void testListaInsertionSort() {
        final Lista<Integer> l_lista = new Lista<Integer>();
        l_lista.AgregarNodo(10);
        l_lista.AgregarNodo(5);
        l_lista.AgregarNodo(-10);
        l_lista.AgregarNodo(30);
        l_lista.AgregarNodo(-100);
        Ordenamiento.insertionSort(l_lista);
        final Lista<Integer> l_listaOrdenada = new Lista<Integer>();
        l_listaOrdenada.AgregarNodo(-100);
        l_listaOrdenada.AgregarNodo(-10);
        l_listaOrdenada.AgregarNodo(5);
        l_listaOrdenada.AgregarNodo(10);
        l_listaOrdenada.AgregarNodo(30);
        assertThat(LISTAS_NO_IGUALES, l_lista.toString(),
                is(equalTo(l_listaOrdenada.toString())));
    }
}
