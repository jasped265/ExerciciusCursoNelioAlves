/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jaspe
 */
public class FileBufferedWritter {
    public static void escreverArquivo(){
         String[] lines = new String[]{"Good Morning", "Good Afternoon", "Good Night", "Good Evening"};

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("TesteFileWriter"))){
                for(String line : lines){
                    bw.write(line);
                    bw.newLine();
                }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new FileReader("TesteFileWriter"))){
            String line = br.readLine();
            
            while(line != null){
                System.out.println(""+line);
                line = br.readLine();
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }  
}
