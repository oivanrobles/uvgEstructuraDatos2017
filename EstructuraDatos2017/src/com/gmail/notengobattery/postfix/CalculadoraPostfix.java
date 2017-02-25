package com.gmail.notengobattery.postfix;

/**
 * Una nueva clase que representa una calculadora POSTFIX.
 */
public final class CalculadoraPostfix {
    private static CalculadoraPostfix s_instancia;
    private IPila m_pila;

    // Constructor privado para evitar la instanciación
    private CalculadoraPostfix() {
    }

    /**
     * @return devuelve la instancia del singletón de esta clase
     */
    public static CalculadoraPostfix getInstancia() {
        s_instancia = (s_instancia == null) ? new CalculadoraPostfix() : s_instancia;
        return s_instancia;
    }

}
