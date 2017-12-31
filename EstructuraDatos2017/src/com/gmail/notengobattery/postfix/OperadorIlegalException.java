package com.gmail.notengobattery.postfix;

/**
 * Excepción lanzada cuando hay un operador que no se reconoce
 */
public class OperadorIlegalException extends RuntimeException {
    public OperadorIlegalException(final String operador) {
        super("Error de sintaxis: no se reconoce el operador " + operador);
    }
}
