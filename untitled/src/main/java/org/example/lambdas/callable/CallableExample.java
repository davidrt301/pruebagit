package org.example.lambdas.callable;

import java.util.concurrent.Callable;

public class CallableExample {
    public static void main(String[] args) {
        /*
         * Callable
         * No recibe valores, pero retorna un resultado y puede lanzar una excepción.
         */
        Callable<String> callable = () -> {
            return "Hola, soy un callable";
        };
        try {
            String result = callable.call();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
