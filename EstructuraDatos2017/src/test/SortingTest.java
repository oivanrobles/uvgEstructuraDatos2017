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

    @Test
    public void testListaBubbleSort() {
        Lista<Integer> lista = new Lista<>();
        lista.AgregarNodo(10);
        lista.AgregarNodo(5);
        lista.AgregarNodo(-10);
        lista.AgregarNodo(30);
        lista.AgregarNodo(-100);
        Ordenamiento.bubbleSort(lista);
        Lista<Integer> listaOrdenada = new Lista<>();
        listaOrdenada.AgregarNodo(-100);
        listaOrdenada.AgregarNodo(-10);
        listaOrdenada.AgregarNodo(5);
        listaOrdenada.AgregarNodo(10);
        listaOrdenada.AgregarNodo(30);
        assertThat("Las listas no son iguales", lista.toString(),
                is(equalTo(listaOrdenada.toString())));
    }

    @Test
    public void testListaSelectionSort() {
        Lista<Integer> lista = new Lista<>();
        lista.AgregarNodo(10);
        lista.AgregarNodo(5);
        lista.AgregarNodo(-10);
        lista.AgregarNodo(30);
        lista.AgregarNodo(-100);
        Ordenamiento.selectionSort(lista);
        Lista<Integer> listaOrdenada = new Lista<>();
        listaOrdenada.AgregarNodo(-100);
        listaOrdenada.AgregarNodo(-10);
        listaOrdenada.AgregarNodo(5);
        listaOrdenada.AgregarNodo(10);
        listaOrdenada.AgregarNodo(30);
        assertThat("Las listas no son iguales", lista.toString(),
                is(equalTo(listaOrdenada.toString())));
    }
}
