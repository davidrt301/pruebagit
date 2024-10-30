package org.example.streams;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//filter():Filtra los elementos que cumplen la condicion.
//map():Transforma los elementos aplicando una funcion.
//sorted():Ordena todos los elementos del stream
//forEach():Aplica una accion a cada elemento.
//reduce():Combina todos los elementos en un solo valor.
//collect():Recoge los elemetnos en una coleccion.
//distinct():Eliminar los elementos duplicados.
//limit():Limita el numero de elementos procesados.
//skip(): Omite un numero especifico de elementos.
//anyMatch():Verifica si algun elemeto cumple una condicion.
//allMatch():Verifica si todos los elemetos cumplen una condicion.
//noneMatch():Verifica si ningun elemento cumple una condicion
public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Luis", "Luis", "Pedro", "Juan", "Carla");

//        names.stream()
//                .forEach((name) -> System.out.println(name));
//================================================================================================
//        names.stream()
//                .filter((name) ->{return name.length() > 4;})
//                .forEach(System.out::println);//forEach((name) -> System.out.println(name)
// ================================================================================================
//        names.stream().
//                map((name)-> name.toUpperCase())
//                .filter((name) -> name.startsWith("A"))//map(String::toUpperCase)
//                .forEach(System.out::println);
//      names.stream()
//            .sorted()
//             .forEach(System.out::println);
// ================================================================
//        names.stream()
//                .forEach((name)->{
//                    //consultas a bases de datos
//                });
// ===============================================================
//        String result = names.stream()
//                .reduce("Resultado: ",(a,b)-> a + " " + b);
////     forma larga      return a + " " + b;
////                });
//        System.out.println(result);
//================================================================
//       List<String> result = names.stream()
//                .map((name) -> name.toUpperCase())
//                .collect(Collectors.toList());
//       result.stream().forEach(System.out::println);
//================================================================
//        names.stream()
//                .distinct()
//                .forEach(System.out::println)
// ================================================================
//        names.stream()
//                .limit(3)
//                .forEach(System.out::println);
// ========================================================================
//        names.stream()
//                .skip(3)
//                .forEach(System.out::println);
// ========================================================================
//       boolean result= names.stream()
//               .anyMatch((name)->name.startsWith("J"));
////   forma larga         return name.startsWith("J");
////               });
//        System.out.println(result);
        //============================================================
//       boolean result = names.stream()
//               .allMatch((name)->name.startsWith("J");
////     forma larga   return name.startsWith("J");
////               });
//        System.out.println(result);
        //============================================================
        boolean reuslt=names.stream()
                .noneMatch((name)->name.length()==10);
//     forma larga   return name.length()==10;
//                });
        System.out.println(reuslt);
    }
}
