/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap15;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jaspe
 */
public class Arquivo {
    public static void lerArquivo(){
      File file  = new File("EstudoFicheiro.txt");
      Scanner sc = null;
     
      try{
          sc = new Scanner(file);
          
          while(sc.hasNextLine()){
              System.out.println(sc.nextLine());
          }
      }
      catch(IOException e){
          System.out.println(""+e.getMessage());
      }
      finally{
          
          if(sc != null)
            sc.close();
      }
      
    }
}
