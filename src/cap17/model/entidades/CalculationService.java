/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap17.model.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jaspe
 */
public class CalculationService {
    
    public static <T extends Comparable<T> > T max(List<T> lista){
        if(lista.isEmpty()){
            throw new IllegalStateException("List Empty");
        }
        
        T maior = lista.get(0);
  
        for(T item : lista){
            if(item.compareTo(maior) > 0){
                maior = item;
            }
        }
        return maior;
    }
}
