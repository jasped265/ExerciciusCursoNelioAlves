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
public class ImprimirConsumer implements Consumer<Produto> {
    @Override
    public void accept(Produto t) {
        System.out.println(t.toString());
    }
}
