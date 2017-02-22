package com.gmail.notengobattery.fabrica;

/**
 * Esta es una fábrica de figuras
 */
public class FigurasFabrica {
    Figura getFigura(final int lados, final double... medidas) {
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
