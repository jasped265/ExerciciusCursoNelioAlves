/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap18;

import cap18.model.entidade.Produto;
import cap18.model.entidade.ProdutoService;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author jaspe
 */
public class somaDeTprodutos {
    public static void somarT(){
        Produto p1 = new Produto("Tvd", 900.00);
        Produto p2 = new Produto("Mouse", 50.00);
        Produto p3 = new Produto ("Tablet", 350.50);
        Produto p4 = new Produto("HD Case", 80.90);
        
        List<Produto> lista = new ArrayList();
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        
        ProdutoService ps = new ProdutoService();
        
        //Double soma = ps.somaT(lista, x -> x.getPreco() < 100);
         Double soma = ps.somaT(lista,somaDeTprodutos::cond);
        System.out.println("Soma = "+soma);
    }
    
    public static boolean cond(Produto p){
        return p.getPreco() > 100;
    }
}
