package com.gmail.notengobattery.fabrica;

/**
 * Esta es una fábrica de figuras
 */
public enum FigurasFabrica {
    ;

    /**
     * Devuelve una figura dado el número de lados, o {@code null} si no se puede crear
     *
     * @param lados   número de lados
     * @param medidas una lista con todas las medidas
     *
     * @return la figura generada
     */
    static Figura getFigura(final int lados, final double... medidas) {
        switch (lados) {
            case 0:
                return new Circulo(medidas[0]);
            case 4:
                return new Cuadrado(medidas[0]);
            case -4:
                return new Rectangulo(medidas[0], medidas[1]);
            default:
                return null;
        }
    }
}
