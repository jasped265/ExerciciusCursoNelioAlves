/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap18;

import cap18.model.entidade.ImprimirConsumer;
import cap18.model.entidade.PriceUpdate;
import cap18.model.entidade.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author jaspe
 */
public class ProdutoMaximo {
    public static void maximo(){
        Produto p1 = new Produto("Tv", 900.00);
        Produto p2 = new Produto("Mouse", 50.00);
        Produto p3 = new Produto ("Tablet", 350.50);
        Produto p4 = new Produto("HD Case", 80.90);
        
        List<Produto> lista = new ArrayList();
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        
        /*Consumer<Produto> consumer = new Consumer<Produto> (){
            @Override
            public void accept(Produto t) {
                t.setPreco(t.getPreco() *1.1);
            }
         };*/
        
        //lista.forEach(new PriceUpdate());
        //lista.forEach(Produto::staticUpdatePrice);
        //lista.forEach(Produto::nonStaticUpdatePrice);
        //lista.forEach(consumer);
        lista.forEach(p -> p.setPreco(p.getPreco()*1.1));
        
        lista.forEach(System.out::println);
        System.out.println(" ");
        
        for(Produto p: lista){
            System.out.println(p.toString());
        }
    }
}
