/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap9;
import java.util.Scanner;
/**
 *
 * @author jaspe
 */
public class CadastrarConta {
    public static void TestarConta(){
        Scanner sc = new Scanner(System.in);
        Conta conta = null;
        double valorDeposito;
        
        System.out.print("Digite o numero da conta: ");
        int numConta =sc.nextInt();
        
        System.out.print("Digite o nome do portador da conta: ");
        sc.nextLine();
        String nome = sc.nextLine();
        
        System.out.println("Tem um deposito inicial(y/n)?");
        char resposta = sc.nextLine().charAt(0);
        
        if(resposta == 'y' || resposta =='Y'){
            System.out.println("Digite o valor do deposito: ");
             valorDeposito = sc.nextDouble();
            conta = new Conta(numConta, nome, valorDeposito);
        }else if(resposta == 'n' || resposta =='N'){
            conta = new Conta(numConta, nome);
        }    
        
        System.out.println("Dados da caonta:");
        System.out.println(" "+conta.toString());
        
        System.out.println("Digite um valor de deposito: ");
        valorDeposito = sc.nextDouble();
        conta.aumentarSaldo(valorDeposito);
        System.out.println("Atulizar Dados da conta: ");
        System.out.println(""+conta.toString());
       
        System.out.println("Digite um valor de retirada: ");
        double decremento = sc.nextDouble();
        conta.diminuirSaldo(decremento);
        
        System.out.println("Atulizar Dados da conta: ");
        System.out.println(" "+conta.toString());
        
    }
}
