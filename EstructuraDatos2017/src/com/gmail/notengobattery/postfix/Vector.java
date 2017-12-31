package com.gmail.notengobattery.postfix;

import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

/**
 * Clase de implementación mínima del {@link Consumible} de tipo Vector.
 */
public class Vector<T> implements Consumible<T> {
    private final int m_incremento;
    private int m_ultimo;
    private int m_tamano;
    private Object m_array[];

    /**
     * Crea un nuevo Vector, con capacidad inicial e incremento
     *
     * @param init capacidad inicial
     * @param incr incremento al rebasar la capaicad total
     */
    public Vector(final int init, final int incr) {
        if ((init < 0) || (incr < 0)) {
            throw new IllegalArgumentException(
                    "No se permiten valores de incremento o capacidad inicial negativos");
        }
        m_array = new Object[init];
        m_ultimo = 0;
        m_tamano = init;
        m_incremento = incr;
    }

    @Override
    public T quitarValorInicio() throws IndexOutOfBoundsException {
        @Nullable T l_val = (T) m_array[0];
        // Hacer el "shift" del array hacia la izquierda
        System.arraycopy(m_array, 1, m_array, 0, m_ultimo);
        m_ultimo--;
        if (m_ultimo < 0) {
            l_val = null;
            m_ultimo = 0;
        }
        return l_val;
    }

    @Nullable
    @Override
    public T quitarValorFinal() {
        if (m_ultimo <= 0) {
            return null;
        }
        final T l_val = (T) m_array[m_ultimo - 1];
        // Destruir la referencia (no es estrictamente necesario)
        // m_array[m_ultimo - 1] = null;
        m_ultimo--;
        return l_val;
    }

    @Override
    public void ponerValorInicio(final T valor) {
        if (m_ultimo >= m_tamano) {
            // Crear un array más grande
            m_tamano += m_incremento;
            final Object[] l_array = new Object[m_tamano];
            System.arraycopy(m_array, 0, l_array, 0, m_ultimo);
            m_array = l_array;
        }
        System.arraycopy(m_array, 0, m_array, 1, m_ultimo);
        m_array[0] = valor;
        m_ultimo += 1;
    }

    @Override
    public void ponerValorFinal(final T valor) {
        if (m_ultimo >= m_tamano) {
            // Crear un array más grande
            m_tamano += m_incremento;
            final Object[] l_array = new Object[m_tamano];
            System.arraycopy(m_array, 0, l_array, 0, m_ultimo);
            m_array = l_array;
        }
        m_array[m_ultimo] = valor;
        m_ultimo += 1;
    }

    @Override
    public String toString() {
        return "Vector{" + "ocupados=" + m_ultimo + ", tamaño=" + m_tamano + ", valores=" +
                Arrays.toString(m_array) + ", incremeto=" + m_incremento + '}';
    }
}
