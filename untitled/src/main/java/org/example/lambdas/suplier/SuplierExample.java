package org.example.lambdas.suplier;

import java.util.function.Supplier;

public class SuplierExample {
    public static void main(String[] args) {
        /*
         * Supplier
         * No recibe ningún valor, pero retorna un resultado
         * get() metodo de optener
         */
//        Supplier<String> supplier = () -> {
//            return "Hola, soy un supplier";
//        };
//        String result = supplier.get();
//        System.out.println(result);
        //o tambien
        Supplier<String> supplier = () -> "Hola, soy un supplier";
        System.out.println(supplier.get());
    }
}
