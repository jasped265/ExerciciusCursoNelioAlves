/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap8;
import cap8.Entidades.Produto;
import java.util.Scanner;

/**
 *
 * @author jaspe
 */
public class ProdutoEmEstoque {
    public static void testarProduto(){
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();
        
        System.out.print("Nome: ");
        p.setNome(sc.nextLine());
        System.out.print("Preco: ");
        p.setPreco(sc.nextDouble());
        System.out.print("Quantidade: ");
        p.setQuantidade(sc.nextInt());
         System.out.println("");
        System.out.println(""+p.toString());
        System.out.println("Digite o numero de produtos a ser adicionado ao stock");
        p.adicionarProdutos(sc.nextInt());
         System.out.println("");
        System.out.println(""+p.toString());
        System.out.println("Digite a quantiade Produtos "
                         + "que deseja remover do stoque: ");
        p.removerQuantidade(sc.nextInt());
        System.out.println("");
        System.out.println("Dados Atualizados: "+p.toString());
        
    }
}
