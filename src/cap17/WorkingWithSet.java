/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap17;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jaspe
 */
public class WorkingWithSet {
    public static void processSet(){
        Set<String> hash = new HashSet(); //Implementação de uma Tabela Hash
        Set<Integer> tree = new TreeSet();//Implementação de uma Árvore Vermelho e Preto
        Set<String> list = new LinkedHashSet();//Implentação de uma LinkedList
        
        hash.add("Maria");
        hash.add("Joãozinho");
        hash.add("Miguelito");
        
        tree.add(4);
        tree.add(5);
        tree.add(10);
        tree.add(7);
        tree.add(3);
        tree.add(1);
        
        list.add("Moises");
        list.add("JorgeBush");
        list.add("LamineYamal");
        list.add("Carreras");
        
        hash.removeIf(x -> x.charAt(0) == 'M');
        
        System.out.println(hash.contains("Maria"));
        
         for(String l : hash){
             System.out.println(l);
         }
         System.out.println("");
         
         for(Integer i : tree){
             System.out.println(i);
         }
         System.out.println("");
         
          for(String s : list){
             System.out.println(s);
         }
         System.out.println("");
                 
    }
}
