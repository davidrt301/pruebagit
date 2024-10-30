package org.example.lambdas.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        /*
         * Consumer
         * Recibe dos valor y no retorna nada
         */

       // BiConsumer<String, String> biConsumer = (a, b) -> {System.out.println(a + " " + b);};
       //o tambine
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + " " + b);
        biConsumer.accept("Hello", "World");
    }
}
