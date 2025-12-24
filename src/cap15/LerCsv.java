/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap15;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
/**
 *
 * @author jaspe
 */
public class LerCsv {
    public static void processarCsv(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o caminho De Origem: ");
        String caminhoOrigem = sc.nextLine();
        
        System.out.println("Insira o caminho de Destino: ");
        String caminhoDestino = sc.nextLine();
        
        System.out.println("insira o nome da Ficheiro: ");
        String ficheiro = sc.nextLine();
        System.out.println("");
        
        File pasta = new File(caminhoDestino+"\\Out");
        if(!pasta.exists())     
            pasta.mkdir();
        
        File arquivo = new File(pasta, ficheiro);     
             
        try(BufferedReader br = new BufferedReader(new FileReader(caminhoOrigem)); 
            BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))){

           String line = br.readLine();
            while(line != null){
              
               String [] dados = line.split(",");
                
               if("quantity".equals(dados[2])){
                   line = br.readLine();
                   continue;
               }
               
               int quantidade = Integer.parseInt(dados[2]);
               double preco = Double.parseDouble(dados[1]);
               
               bw.write(dados[0]+", "+dados[1]+", "+String.format("%.2f",quantidade*preco));
               bw.newLine();
               line = br.readLine();
            }
       }catch(IOException e){
           System.out.println(""+e.getMessage());
       }catch(NullPointerException e){
           System.out.println(""+e.getMessage());
       }catch(NumberFormatException e){
            System.out.println(""+e.getMessage());
       }
    }
}