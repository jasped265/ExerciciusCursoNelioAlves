/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap18;

import cap18.model.entidade.ProductPredicate;
import cap18.model.entidade.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author jaspe
 */
public class ProdutoMinimo {
    public static void minimo(){
        Produto p1 = new Produto("Tv", 900.00);
        Produto p2 = new Produto("Mouse", 50.00);
        Produto p3 = new Produto ("Tablet", 350.50);
        Produto p4 = new Produto("HD Case", 80.90);
        
        List<Produto> lista = new ArrayList();
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);        
        
        //lista.removeIf(p -> p.getPreco() > 100);
        //lista.removeIf(new ProductPredicate());
        //lista.removeIf(Produto::minimo);
        Predicate<Produto> pre = p -> p.getPreco() > 100;
        lista.removeIf(pre);
        for(Produto p: lista){
            System.out.println(p);
        }
    }
}   
