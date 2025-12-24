/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap14;
import cap14.entidades.Conta;
import cap14.entidades.DomainException;
import java.util.Scanner;
/**
 *
 * @author jaspe
 */
public class Account {
    public static void processarConta(){
        
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();

            System.out.print("Withrdraw Limit: ");
            double withDraw = sc.nextDouble();
            sc.nextLine();

            Conta conta = new Conta(number, holder, balance, withDraw);

            System.out.println("");
            System.out.print("Entra a quantidade que pretende remover: ");
            double amount = sc.nextDouble();

            conta.withDraw(amount);
            System.out.println("New balance: "+conta.getBalance());
            
        }
        catch(DomainException e)
        {
            System.out.println(""+e.getMessage());
        }        
    }
}
