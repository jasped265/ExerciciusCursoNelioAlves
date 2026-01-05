/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap17;

import cap17.model.entidades.PrintService;
import java.util.Scanner;

/**
 *
 * @author jaspe
 */
public class LerQunatidadeDeNnum {
   
    public static void LerNum(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many values: ");
        String quantidade = sc.nextLine();
        //sc.nextLine();
        
        PrintService<String> ps = new PrintService();
        
        for(int i = 0; i < 3; i++ ){
           String valores = sc.nextLine();
           ps.addValue(valores);
        }
       
        System.out.println("");
        ps.print();
        
        System.out.println("First: "+ps.first());
    }
}
