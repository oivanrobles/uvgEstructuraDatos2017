package com.gmail.notengobattery.postfix;

import org.jetbrains.annotations.Nullable;

/**
 * Se lanza cuando sobra o falta un argumento para el operador
 */
public class ArgumentosInvalidosException extends IllegalStateException {
    public ArgumentosInvalidosException(@Nullable final Double arg1, @Nullable final Double arg2,
            final String operador) {
        super("Error de sintaxis: la cantidad de argumentos provista no corresponde con los " +
                "operadores (" + arg1 + ' ' + operador + ' ' + arg2 + ").");
    }

}
