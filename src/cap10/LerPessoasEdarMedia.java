/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap10;
import cap10.entidades.Pessoa;
import java.util.Scanner;

/**
 *
 * @author jaspe
 */
public class LerPessoasEdarMedia {
    public static void mediaDePessoa(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas pessoas deseja ler: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Pessoa[] pessoa = new Pessoa[n];
        int totalDeMenor = 0;
        double somaDeAltura = 0;
        for(int i = 0; i < n; i++){
            System.out.println("Dados da "+(i+1)+" Pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            
            pessoa[i] = new Pessoa(nome, idade, altura);
            
            somaDeAltura += pessoa[i].getAltura();
            
            if(pessoa[i].getIdade() < 16){
                totalDeMenor += 1;   
            }
        }
        
        double mediaDeAltura = (somaDeAltura/pessoa.length);
        double percentagemDeMenor = (((double)totalDeMenor/n)*100);
        
        System.out.printf("Media de Altura: %.2f\n",mediaDeAltura);
        System.out.printf("Percentagem de pessoas menor que 16: %.2f%%\n", percentagemDeMenor);
      
        for(int i = 0; i < pessoa.length; i++){
            if(pessoa[i].getIdade() < 16){
                System.out.println(""+pessoa[i].getNome());
            }  
        }
    }
}
