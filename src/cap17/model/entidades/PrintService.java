/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap17.model.entidades;

import java.util.ArrayList;

/**
 *
 * @author jaspe
 * 
 */
public class PrintService <T> {
    
    ArrayList<T> numeros = new ArrayList<>();
    
    public void addValue(T value){
            numeros.add(value);
    }
    
    public T first(){
       if(!numeros.isEmpty())
        return numeros.get(0);
       
       throw new IllegalStateException("List Empty");
    }
    
    public void print(){
        if(!numeros.isEmpty()){
            System.out.print("["+numeros.get(0));
            for(int i = 1; i < numeros.size(); i++){
                System.out.print(", "+numeros.get(i));
            }
            System.out.println("]");
        }   
    }
}
