package org.example.lambdas.bipredicate;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        /*
         * BiPredicate
         * Recibe dos valores y devuenve un booleano (true o false).
         */
        /*BiPredicate<Integer,Integer> biPredicate = (a, b)->{
            return a>b;
        };
        boolean result = biPredicate.test(10 , 5);
        System.out.println(result);

        o tambien
        */
        BiPredicate<Integer,Integer> biPredicate = (a, b)-> a>b;
        System.out.println(biPredicate.test(10 , 5));


    }
}
