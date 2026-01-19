/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap18;

import cap18.model.entidade.FunctionUpperCase;
import cap18.model.entidade.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author jaspe
 */

public class ProdutoUpperCase {
    public static void upperCase(){
        Produto p1 = new Produto("Tv", 900.00);
        Produto p2 = new Produto("Mouse", 50.00);
        Produto p3 = new Produto ("Tablet", 350.50);
        Produto p4 = new Produto("HD Case", 80.90);
        
        List<Produto> lista = new ArrayList();
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        
        Function<Produto, String> paraNome = new Function <Produto, String> (){
            @Override
            public String apply(Produto t) {
                return t.getNome().toUpperCase();
            }        
        };
                
       //List<String> nome = lista.stream().map(new FunctionUpperCase()).collect(Collectors.toList());
       //List<String> nome = (List<String>) lista.stream().map(paraNome).collect(Collectors.toList());
       //List<String> nome = lista.stream().map(Produto::staticoProdutoPorNome).collect(Collectors.toList());
       //List<String> nome = lista.stream().map(Produto::nonStaticProdutoPorNome).collect(Collectors.toList());
         List<String> nome = lista.stream().map(x -> x.getNome()).collect(Collectors.toList());
       nome.forEach(System.out::println);
    } 
}
