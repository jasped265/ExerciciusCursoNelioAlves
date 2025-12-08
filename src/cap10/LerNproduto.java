/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap10;
import java.util.Scanner;
import cap10.entidades.Produto;
/**
 *
 * @author jaspe
 */
public class LerNproduto {
    public static void precoMedioDeProduto(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o numero de produtos: ");
        int n = sc.nextInt();
        
        Produto[] produto = new Produto[n];
        double somaPreco = 0.0;
        
        for(int i = 0; i < n; i++ ){
            
            produto[i] = new Produto();
            
            System.out.print("Digite o nome do "+(i+1)+" Produto: ");
            produto[i].setNome(sc.nextLine());
            sc.nextLine();
            System.out.print("Digite o preço do "+(i+1)+" Produto: ");
            produto[i].setPreco(sc.nextDouble());
            
            somaPreco += produto[i].getPreco();
        }
        
        double media = somaPreco/n ;
        
        System.out.printf("A media de preco é = %.2f\n", media);
       
    }
}
