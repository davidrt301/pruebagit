package org.example.lambdas.unary;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        /*
         *UnaryOperator
         *Recibe un valor , lo procesa y devuelve un resultado del mismo tipo;
         */
       /* UnaryOperator<Integer> unaryOperator = (num) -> {
            return num * 2;
        };
        int result = unaryOperator.apply(5);
        System.out.println(result);
        //o tambien
        */
        UnaryOperator<Integer> unaryOperator = num -> num * 2;
        System.out.println(unaryOperator.apply(5)); // Imprime: 10
    }
}
