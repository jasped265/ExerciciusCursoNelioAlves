/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap15;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author jaspe
 */
public class LerArquivos {
   
    public static void processarFolder(){
        Scanner  sc = new Scanner(System.in);
        
        System.out.println("Entra o Caminho: ");
        String strPath = sc.nextLine();
        
        File path = new File(strPath);
        
        File[] folders = path.listFiles(File::isDirectory);
        
        for(File f : folders){
            System.out.println(""+f.getName());
        }
        
        System.out.println("");
        
        File[] arquivos = path.listFiles(File::isFile);
        
        for(File f : arquivos){
            System.out.println(""+f.getName());
        }
        
        boolean sucesso = new File(strPath+"Eu_Criei_Aqui").mkdir();
        
        System.out.println("");
        if(!sucesso){
            System.out.println("Ocorreu um erro durante a criação");
        }else{
            System.out.println("Criação bem sucedidad");
        }
      
    }
}
