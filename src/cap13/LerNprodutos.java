/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cap13;
import java.util.Scanner;
import cap13.entidades.*;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jaspe
 */
public class LerNprodutos {
    public static void gerarEtiqueta(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o numero de Produtos: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        ArrayList<Produto> listaP = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            System.out.println("Produto #"+(1+i));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();
            sc.nextLine();
            
            System.out.println("Comum, Usado ou Importado (c,u,i)? ");
            char resposta = sc.nextLine().charAt(0);
            
            if((resposta == 'i') ||(resposta == 'I')){
                System.out.print("Taxa de Alfândega: ");
                Double taxa = sc.nextDouble();
                sc.nextLine();
                
                ProdutoImportado produto = new ProdutoImportado(nome, preco, taxa);
                
                listaP.add(produto);
                
                continue;
                
            }else if((resposta == 'u') ||(resposta == 'U')){
                System.out.print("Data de manufacturação: ");
                LocalDate data = LocalDate.parse(sc.nextLine(),DateTimeFormatter.ofPattern("dd/MM/yyyy") );
                
                ProdutoUsado produto = new ProdutoUsado(nome, preco, data);
                
                listaP.add(produto);
                
                continue;
            }
            
            Produto produto = new Produto(nome, preco);
            listaP.add(produto);
        }
        
        System.out.println("Etiquetas: ");
        
        for (Produto p : listaP){
            System.out.println(""+p.etiqueta());
        }
        
    }
}
