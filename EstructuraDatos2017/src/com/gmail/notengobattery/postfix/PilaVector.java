package com.gmail.notengobattery.postfix;

/**
 *
 */
public class PilaVector<T> extends Pila<T> {

    /**
     * Crea una nueva pila FIFO o LIFO
     *
     * @param isFifo         si es {@code true}, entonces la pila es FIFO, caso contrario es LIFO
     */
    PilaVector(final boolean isFifo) {
        super(isFifo, new Vector());
    }
}
