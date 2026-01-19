/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap18.model.entidade;

import java.util.function.Consumer;

/**
 *
 * @author jaspe
 */
public class PriceUpdate implements Consumer<Produto> {

    @Override
    public void accept(Produto t) {
        Double aumento = t.getPreco();
        aumento += t.getPreco()*(0.1);
        t.setPreco(aumento);
    }
    
}
