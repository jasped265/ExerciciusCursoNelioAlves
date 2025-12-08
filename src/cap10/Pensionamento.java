/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap10;
import java.util.Scanner;
import cap10.entidades.*;
/**
 *
 * @author jaspe
 */
public class Pensionamento {
    public static void alugarQuarto(){
        Scanner sc = new Scanner(System.in);
        
        Quarto[] quarto = new Quarto[10];
        
        for(int i = 0; i < 10; i++){
            quarto[i] = new Quarto();
        }
        
        System.out.println("Quantos quartos deseja Alugar? ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++){
            System.out.print("Rent #"+i);
            System.out.println("");
            
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Email: ");
            String email = sc.nextLine();
            
            System.out.print("Quarto: ");
            int room = sc.nextInt();
            sc.nextLine();
            
            Estudante estudante = new Estudante(nome, email);
            
            quarto[i].setOcupante(nome);
            quarto[i].setId(room);
            quarto[i].setOcupado(true);
            quarto[i].setEmail(email);
        }
       
        System.out.println("Quartos Ocupados:");
       for(int j = 0; j < quarto.length ; j++){
           if(quarto[j].isOcupado()){
               System.out.println(""+quarto[j].getId()+": "
                       +quarto[j].getOcupante()
                       +", "+quarto[j].getEmail());
           }
       }
    }       
}
