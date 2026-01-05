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
import java.util.Set;

/**
 *
 * @author jaspe
 */
public class LerVotos {
    public static void processarVoto(){
        String path = "C:\\Users\\jaspe\\Downloads\\Teste\\in.txt";
        
        Map<String, Integer> votos = new HashMap();
        ArrayList<Voto> listVoto = new ArrayList();
                
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String[] campo = line.split(",");
                
                listVoto.add(new Voto(campo[0], Integer.parseInt(campo[1])));
                
                line = br.readLine();
            }
            
          
           for(Voto v : listVoto){
               String candidato = v.getName();
               int soma = 0;
                for(Voto  aux : listVoto){
                    if(candidato.equals(aux.getName())){
                        soma += aux.getNumVotos();
                    }
                }
                votos.put(candidato, soma);
            }
           
           for(String s : votos.keySet()){
               System.out.println(s+": "+votos.get(s));
           }     
           
        }catch(Exception e){
            System.out.println(""+e.getMessage());
        }  
    }
}
