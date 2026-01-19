/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap18.model.entidade;

import java.util.function.Predicate;

/**
 *
 * @author jaspe
 */
public class ProductPredicate implements Predicate<Produto> {

    public ProductPredicate() {
    
    }
    
    @Override
    public  boolean test(Produto t) {
        return t.getPreco() > 100;
    }
    
}
