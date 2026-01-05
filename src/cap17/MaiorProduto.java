/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap17;

import cap17.model.entidades.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author jaspe
 */
public class MaiorProduto {
    public static void ProcessarProduto(){
        String path = "C:\\Users\\jaspe\\Downloads\\Teste\\nome.txt";
        
        ArrayList<Produto> listaP = new ArrayList<Produto>();
        
        try(BufferedReader bf = new BufferedReader(new FileReader(path))){
            String dado = bf.readLine();
            String parte[];
            
            while(dado != null){
                System.out.println(""+dado);
                parte = dado.split(",");
                
                Produto produto = new Produto(parte[0], Double.valueOf(parte[1]));
                listaP.add(produto);
                
                dado = bf.readLine();
            }
            
            Produto max = CalculationService.max(listaP);
            System.out.println("MostExpensive: ");
            System.out.println(max.toString());
            
        }catch(Exception e){
            System.out.println(""+e.getMessage());
        }
    }
}
