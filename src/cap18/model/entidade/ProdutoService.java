/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap18.model.entidade;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author jaspe
 */
public class ProdutoService {
    public Double somaT(List<Produto> lista, Predicate<Produto> criterio){
      double soma = 0.0;
      int i=0;
        for(Produto p: lista){
            if(criterio.test(p)){
                soma =+ p.getPreco();
            }
         }
      return soma;
    }
}
