/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap18;

import cap18.model.entidade.Produto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author jaspe
 */
public class ToyingWithStreams {
    public static void Streams(){
        List<Integer> lista = Arrays.asList(3, 4, 5, 10, 7);
        
        Stream<Integer> str = lista.stream().map(x -> x * 10);
        //str.forEach(System.out::println);
        Stream<String> str2 = Stream.of("Maria", "Alex", "BOB");
        System.out.println(Arrays.toString(str.toArray()));
        System.out.println(Arrays.toString(str2.toArray()));
        
        Stream<Integer> str3 = Stream.iterate(0, x -> x + 2).limit(20);
        str3.forEach(System.out::println);
        
        int sum = lista.stream().reduce(0, (x, y)-> x+y);
        System.out.println(""+sum);
                
    }
}
