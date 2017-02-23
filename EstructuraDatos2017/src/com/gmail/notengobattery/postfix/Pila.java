package com.gmail.notengobattery.postfix;

/**
 * Clase resumen que funciona como pila
 */
public abstract class Pila<T> implements IPila<T> {

    private final boolean m_isFifo;
    private final Consumible<T> m_almacenamiento;

    /**
     * Crea una nueva pila FIFO o LIFO
     *
     * @param isFifo         si es {@code true}, entonces la pila es FIFO, caso contrario es LIFO
     * @param almacenamiento el almacenamiento a utilizar en la pila
     */
    Pila(final boolean isFifo, final Consumible<T> almacenamiento) {
        m_isFifo = isFifo;
        m_almacenamiento = almacenamiento;
    }

    @Override
    public T consumir() {
        // Consume un elemento de la pila (Nota: no es a prueba de multihilo)
        if (m_isFifo) {
            return m_almacenamiento.quitarValorFinal();
        } else {
            return m_almacenamiento.quitarValorInicio();
        }
    }

    @Override
    public void producir(final T producto) {
        m_almacenamiento.ponerValorFinal(producto);
    }

    @Override
    public boolean isFifo() {
        return m_isFifo;
    }
}
