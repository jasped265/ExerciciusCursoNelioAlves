/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap12;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import cap12.entidade.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jaspe
 */

public class PostComment {
    public static void post(){
       Scanner sc = new Scanner(System.in);
       DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
       LocalDateTime data;
       List<Post> postes = new ArrayList<>(); 
       
        System.out.print("Insisra o numero de Posts:  ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n;  i++){
            System.out.println("Insira os Dados #"+(i+1)+"Post: ");
            System.out.println("Insira a Data: ");
            data = LocalDateTime.parse(sc.nextLine(), dtf1);
            
            System.out.print("Titulo: ");
            String titulo = sc.nextLine();
            
            System.out.println("Conteudo: ");
            String conteudo = sc.nextLine();
            
            System.out.println("Likes: ");
            int likes = sc.nextInt();
            sc.nextLine();
            
            Post post = new Post(data, titulo, conteudo, likes);
            post.setId(i+1);
            postes.add(post);
            
        }
        
        System.out.print("Insisra o numero de comentario  ");
        int m = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < m;  i++){
            System.out.println("Insira os Dados #"+(i+1)+"Comentario: ");
       
            System.out.println("Conteudo: ");
            String conteudo = sc.nextLine();
            
            System.out.println("Insira o ID do post: ");
            int id = sc.nextInt();
            sc.nextLine();
            
            Comment comentario = new Comment(conteudo);
            
            for(Post p : postes){
                if(p.getId() == id){
                    p.getComents().add(comentario);
                }
            }
            
        }
        
        System.out.println("Comentarios de post: ");
        System.out.println("");
        int i = 0;
        
        for(Post p : postes){
            System.out.println(""+p.toString());
            System.out.println("");
       }
        
       /*for(Post p : postes){
            for(Comment c : p.getComents()){
                System.out.println("Post "+p.getId()+": "+c.getText());
            }
       }*/
    }
}
