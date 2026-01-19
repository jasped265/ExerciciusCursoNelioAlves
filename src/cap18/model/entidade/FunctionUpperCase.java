/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap18.model.entidade;

import java.util.Locale;
import java.util.function.Function;

/**
 *
 * @author jaspe
 */
public class FunctionUpperCase implements Function<Produto, String> {

    @Override
    public String apply(Produto p) {
        return p.getNome().toUpperCase();
    }
}
