package com.gmail.notengobattery.postfix;

/**
 * La interfaz que determina el comportamiento de la pila
 */
public interface IPila<T> {
    /**
     * Consume un valor de la pila
     *
     * @return el valor consumido
     */
    T consumir();

    /**
     * Agrega un producto a la pila para ser consumido
     *
     * @param producto el valor a producir
     */
    void producir(final T producto);

    /**
     * Determina el tipo de pila que es
     *
     * @return {@code true} si la pila es FIFO, o {@code false} si la pila es LIFO
     */
    boolean isFifo();
}
