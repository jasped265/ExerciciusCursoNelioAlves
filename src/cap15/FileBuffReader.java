/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jaspe
 */
public class FileBuffReader {
    public static void processarFicheiro(){
        
        File f;
        
        /*FileReader fl = null;
        BufferedReader bf = null; 
        
        try{
            
            f = new File("EstudoFicheiro");
            
            fl = new FileReader(f);
            bf = new BufferedReader(fl);
            //Ler uma linha
            System.out.println(""+bf.readLine());
            System.out.println("");
            
            //Ler n linhas
            
            String line = bf.readLine();
            
            while(line != null){
                System.out.println(""+line);
                line = bf.readLine();
            }
        }
        
        catch(FileNotFoundException e){
            System.out.println(""+e.getMessage());
        }catch(IOException e){
            System.out.println(""+e.getMessage());
        }
        finally{
           try{
                if(bf != null){
                   bf.close();
                }
                if(fl != null){
                    fl.close();
                }
           }catch(IOException e){
               e.printStackTrace();
           }
        }*/
        
        try(BufferedReader bf = new BufferedReader(new FileReader("EstudoFicheiro"))){
            
            //Ler uma linha
            System.out.println(""+bf.readLine());
            System.out.println("");
            
            //Ler n linhas
            
            String line = bf.readLine();
            
            while(line != null){
                System.out.println(""+line);
                line = bf.readLine();
            }
        }
        
        catch(FileNotFoundException e){
            System.out.println(""+e.getMessage());
        }catch(IOException e){
            System.out.println(""+e.getMessage());
        }
    }
}
