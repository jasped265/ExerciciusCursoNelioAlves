/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap17;

import cap17.model.entidades.User;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Instant;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jaspe
 */
public class RegistroLog {
    public static void processarLog(){
        Scanner sc = new Scanner(System.in);
        Set<User> log = new HashSet();
        
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();
       
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
                String dado = br.readLine();
                while(dado != null){
                    String[] campo = dado.split(" ");
                    User user = new User(campo[0],Instant.parse(campo[1]));
                    
                    log.add(user);
                    dado = br.readLine();
                }
               
               for(User u : log){
                   System.out.println(""+u.toString());
               }
               System.out.println("");
               
               System.out.println("Total users: "+log.size());
        }catch(Exception e){
            System.out.println(""+e.getMessage());
        }
    }
}
