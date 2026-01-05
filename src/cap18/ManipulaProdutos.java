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
import java.util.List;

/**
 *
 * @author jaspe
 */
public class ManipulaProdutos {
    public static void Processar(){
        Produto p1 = new Produto("Blue", 250.75);
        Produto p2 = new Produto("Tang", 150.80);
        Produto p3 = new Produto("Compal", 500.30);

        List<Produto> listaP = new ArrayList();

        listaP.add(p1);
        listaP.add(p2);
        listaP.add(p3);
        
        public int compare {
            
        }
        
        listaP.sort(new ProductComparator());
        
        for(Produto p : listaP){
            System.out.println(""+p.toString());
        }
    }
}
