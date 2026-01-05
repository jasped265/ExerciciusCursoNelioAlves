/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap17.model.entidades;

import java.util.List;

/**
 *
 * @author jaspe
 */
public class Assistant {
    public static void copy (List< ? extends Number> source , List< ? super Number> destiny){
        for(int i = 0; i < source.size(); i++){
            destiny.add(source.get(i));
        }
    }
    
    public static void print (List<?> list){
        for(Object o: list){
            System.out.print(" "+o);
        }
       System.out.println("");
    }
}
