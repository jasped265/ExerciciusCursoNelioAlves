/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap12;
import cap12.entidade.Cliente;
import cap12.entidade.*;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jaspe
 */
public class nPedidos {
    public static void processarPedidos(){
        Scanner sc = new Scanner(System.in);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                
        LocalDate date = LocalDate.now();
        System.out.println("Insira os Dados do Cliente: ");
        System.out.print("Name: ");
        String nome = sc.nextLine();
        
        System.out.print("Email: ");
        String email = sc.nextLine();
        
        System.out.println("Data de nascimento (dd/MM/yyyy):");
        String dataNascimento =  sc.nextLine();
        
        LocalDate datN = LocalDate.parse(dataNascimento, dtf);
        
        Cliente cliente = new Cliente(nome, email, datN);
        System.out.println("");
        
        System.out.println("Inisra os Dados Do pedido: ");
            
        System.out.print("status: ");
        String status = sc.nextLine();
        
        Pedido1 pedido = new Pedido1(LocalDate.now(), StatusDoPedido.valueOf(status), cliente);  
        
        System.out.print("Qunatos itens pretende adicionar ao pedido: ");
        int numItem = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < numItem; i++ ){
            System.out.println("Digite os dados do Item: ");
            System.out.print("Nome do Produto: ");
            String nomeProduto = sc.nextLine();
            
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            sc.nextLine();
            
            System.out.println("Quantidade: ");
            int quantidade = sc.nextInt();
            sc.nextLine();
            
            Produto produto = new Produto(nome, preco);
            PedidoDeItem pedidoI = new PedidoDeItem(quantidade, preco, produto);
           
           pedido.adicionarItem(pedidoI);
        }
        
        System.out.println("Order Summary: ");
        System.out.println(" "+pedido.toString());
    }
}
