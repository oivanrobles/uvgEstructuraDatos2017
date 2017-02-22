package com.gmail.notengobattery.fabrica;

/**
 * Esta interfaz se utiliza para generar figuras genéricas
 */
public interface Figura {
    /**
     * Dibuja la figura.
     */
    String dibujar();

    /**
     * @return el área de la figura
     */
    double getArea();

    /**
     * @return el perímetro de la figura
     */
    double getPerimetro();

    /**
     * @return el número de lados de la figura
     */
    double getLados();
}
