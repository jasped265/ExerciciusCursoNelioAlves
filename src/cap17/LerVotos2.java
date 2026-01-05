/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap17;

import cap17.model.entidades.Voto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import static java.util.Map.entry;
import java.util.Set;

/**
 *
 * @author jaspe
 */
public class LerVotos2 {
    public static void processarVoto(){
        String path = "C:\\Users\\jaspe\\Downloads\\Teste\\in.txt";
        
        Map<String, Integer> votos = new HashMap();
              
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String[] campo = line.split(",");
                int numVoto = Integer.parseInt(campo[1]);
                String candidato = campo[0];
                votos.put(candidato, votos.getOrDefault(candidato, 0) + numVoto);
                line = br.readLine();
            }
         
            for(Map.Entry<String, Integer> entry: votos.entrySet()){
                System.out.println(entry.getKey()+": "+entry.getValue());
            }
           
        }catch(Exception e){
            System.out.println(""+e.getMessage());
        }  
    }
}
