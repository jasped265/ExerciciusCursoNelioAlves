/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap18;

import cap18.model.entidade.ProductComparator;
import cap18.model.entidade.Produto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author jaspe
 */


public class ManipulaProdutos {
    
    public static int ComparProutos(Produto p1, Produto p2){
        return 1;
    }
    
    public static void Processar(){
        Produto p1 = new Produto("Blue", 250.75);
        Produto p2 = new Produto("Tang", 150.80);
        Produto p3 = new Produto("Compal", 500.30);

        List<Produto> listaP = new ArrayList();

        listaP.add(p1);
        listaP.add(p2);
        listaP.add(p3);
        
        ProductComparator p = new ProductComparator();
        
        //ArrowFucntion A
        Comparator <Produto> comp = (pro1, pro2) ->{
            return pro1.getNome().toUpperCase().compareTo(pro2.getNome());
        };
        
        //ArrowFunction B
        Comparator<Produto> comp1 = (pr1, pr2) -> pr1.getNome().toUpperCase().compareTo(pr2.getNome());
        
        //Classe anonima:
        //**********************************************************
        /*Comparator<Produto> comp2 = new Comparator <Produto> (){
            @Override
            public int compare(Produto p1, Produto P2) {
               return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
            }
        };*/
        //************************************************************
        
        listaP.sort(p);
        listaP.sort(ManipulaProdutos::ComparProutos);
        for(Produto pr: listaP){
            System.out.println(" "+p.toString());
        }
       
        //Collections.sort(listaP);
    }
}   
