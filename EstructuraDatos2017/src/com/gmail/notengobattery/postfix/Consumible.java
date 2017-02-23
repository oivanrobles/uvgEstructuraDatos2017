package com.gmail.notengobattery.postfix;

/**
 * Una interfaz que implementan todos los tipos de almacenamiento que sirven para las pilas que
 * heredan de {@link Pila}
 */
public interface Consumible<T> {
    /**
     * Remueve el valor de inicio del consumible
     *
     * @return el valor removido
     */
    T quitarValorInicio();

    /**
     * Remueve el valor final del consumible
     *
     * @return el valor removido
     */
    T quitarValorFinal();

    /**
     * Inserta un valor al inicio del consumible
     *
     * @param valor el valor a insertar
     */
    void ponerValorInicio(final T valor);

    /**
     * Inserta un valor al final del consumible
     *
     * @param valor el valor a insertar
     */
    void ponerValorFinal(final T valor);
}
