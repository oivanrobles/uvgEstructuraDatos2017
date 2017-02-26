package com.gmail.notengobattery.postfix;

/**
 * Implementación de una pila a partir de la fábrica {@link FabricaConsumibles}
 */
public class PilaFabricada<T> extends Pila<T> {
    /**
     * Genera una pila de tipo FIFO o LIFO, utilizando un tipo de {@link Consumible} provisto
     * como un ID entero.
     *
     * @param isFifo si es {@code true}, la pila es FIFO, caso contrario es LIFO
     * @param tipo   un tipo de {@link Consumible}, representado en las constantes de la clase
     */
    public PilaFabricada(final boolean isFifo, final int tipo) {
        // Generar un consumible desde la fábrica
        super(isFifo, FabricaConsumibles.getConsumible(tipo));
    }
}
