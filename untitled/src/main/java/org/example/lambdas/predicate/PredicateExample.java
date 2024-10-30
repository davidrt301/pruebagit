package org.example.lambdas.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        /*
         * Predicate
         * Recibe un valor y devuenve un booleano (true o false).
         */
//        Predicate<String> predicate = (str) -> {
//            return str.length() > 5;
//        };
//        boolean result = predicate.test("Hola mundo");
//        System.out.println(result);
        //o tambien
        Predicate<String> predicate = (str) -> str.length() > 5;
        System.out.println(predicate.test("Hola mundo"));
    }
}
