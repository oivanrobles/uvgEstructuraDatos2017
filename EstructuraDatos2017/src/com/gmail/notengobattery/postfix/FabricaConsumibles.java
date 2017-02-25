package com.gmail.notengobattery.postfix;

import org.jetbrains.annotations.Nullable;

/**
 * Esta es la fabrica que permite generar listas
 */
public enum FabricaConsumibles {
    ;
    public static final int LISTA_NORMAL = 0;
    public static final int LISTA_DOBLE = 1;
    public static final int LISTA_CIRCULAR = 2;
    public static final int VECTOR = 3;
    public static final int ARRAYLIST = 4;
    private static int s_vectorInicial = 10;
    private static int s_vectorIncremento = 1;
    private static int s_valorInicial = 10;

    /**
     * Genera una nueva instancia de las clases de {@link Consumible}s para la pila.
     *
     * @param tipo el tipo de consumible a utilizar
     *
     * @return el consumible solicitado
     */
    @Nullable
    static Consumible<?> getLista(final int tipo) {
        switch (tipo) {
            case LISTA_NORMAL:
                return new Lista<>();
            case LISTA_DOBLE:
                return new ListaDoble<>();
            case LISTA_CIRCULAR:
                return new ListaCircular<>();
            case VECTOR:
                return new Vector<>(s_vectorInicial, s_vectorIncremento);
            case ARRAYLIST:
                return new ArrayList2(s_valorInicial);
            default:
                return null;
        }
    }

    /**
     * @param vectorInicial el nuevo valor inicial del tamaño de los {@link Vector}
     */
    public static void setVectorInicial(final int vectorInicial) {
        if (vectorInicial > 0) {
            s_vectorInicial = vectorInicial;
        }
    }

    /**
     * @param valorInicial el nuevo valor inicial del tamaño de los {@link ArrayList2}
     */
    public static void setArrayInicial(final int valorInicial) {
        if (valorInicial > 0) {
            s_valorInicial = valorInicial;
        }
    }

    /**
     * @param vectorIncremento el nuevo valor de incremento de tamaño de los {@link Vector}
     */
    public static void setVectorIncremento(final int vectorIncremento) {
        if (vectorIncremento > 0) {
            s_vectorIncremento = vectorIncremento;
        }
    }
}
