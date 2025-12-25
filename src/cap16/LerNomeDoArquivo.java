/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap16;

import cap16.model.entidades.Funcionario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author jaspe
 */
public class LerNomeDoArquivo {
    public static void ler(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        
        System.out.println("Insira o caminho do aquivo: ");
        String nomeArquivo = sc.nextLine();
        
        try(BufferedReader bf = new BufferedReader(new FileReader(nomeArquivo))){
            String dado = bf.readLine();
            while(dado != null){
                String[] parte = dado.split(",");
                
                Funcionario f = new Funcionario(parte[0], Double.parseDouble(parte[1]));
                listaFuncionario.add(f);
                dado = bf.readLine();
            }
            
            Collections.sort(listaFuncionario);
            
            for(Funcionario n : listaFuncionario){
                System.out.println(" "+n.toString());
            }
        }catch(Exception e){
            System.out.println(""+e.getMessage());
        }
    }
}
