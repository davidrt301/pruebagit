package org.example.lambdas.runnable;

public class RunnableExample {
    public static void main(String[] args) {
        /*
         * Runnable
         * No recibe valores y no retorna nada, solo ejecuta una tarea.
         */

//        Runnable runnable = () -> System.out.println("Ejecutando tarea ...");
//         Thread thread = new Thread(runnable);
//         thread.start();
        //o tambien
        Runnable runnable = () -> System.out.println("Ejecutando tarea...");
       runnable.run();

    }
}
