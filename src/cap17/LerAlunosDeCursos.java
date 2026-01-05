/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author jaspe
 */
public class LerAlunosDeCursos {
    public static void SomarAlunos(){
       Scanner sc = new Scanner(System.in);
       ArrayList<Integer> A = new ArrayList();
       ArrayList<Integer> B = new ArrayList();
       ArrayList<Integer> C = new ArrayList();
       
       Set<Integer> all = new HashSet();
       
        System.out.print("How many student for Course A?:");
        int quantidade = sc.nextInt();
        read(A, quantidade);
        
        System.out.print("How many student for Course B?:");
        quantidade = sc.nextInt();
        read(B, quantidade);
        
        System.out.print("How many student for Course C?:");
        quantidade = sc.nextInt();
        read(C, quantidade);
        
        copy(A, all);
        copy(B, all);
        copy(C, all);
        
        System.out.println("Total Student: "+all.size());
    }
    
    private static void copy(ArrayList<Integer> source, Set<Integer> destiny){
        for(Integer i : source){
            destiny.add(i);
        }
    }
    
    private static void read(ArrayList<Integer> desteny, int quantity){
        Scanner sc = new Scanner(System.in);    
        for(int i = 0; i < quantity; i++ ){
                desteny.add(sc.nextInt());
            }
    }
    
}
