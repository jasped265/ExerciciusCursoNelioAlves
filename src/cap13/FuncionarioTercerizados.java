/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap13;
import java.util.Scanner;
import cap13.entidades.*;
import java.util.ArrayList;
/**
 *
 * @author jaspe
 */
public class FuncionarioTercerizados {
    public static void LerNfuncionrios(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos funcionários deseja registrar: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        ArrayList<Funcionario> listaF = new ArrayList<>();
        
        for(int i = 0; i < n; i++ ){
            System.out.println("Funcionario #"+(i+1));
            System.out.println("É tercerizado?(y/n)");
            
            char resposta = sc.nextLine().charAt(0);
            
            if((resposta == 'y') || (resposta == 'Y')){
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Horas: ");
                Integer hora = sc.nextInt();
                sc.nextLine();
                
                System.out.print("ValorPorHora: ");
                Double valorPorHora = sc.nextDouble();
                sc.nextLine();
                
                System.out.print("Despesa_Adicional: ");
                Double despesaAdicional = sc.nextDouble();
                sc.nextLine();
                
                FuncionarioTercerizado novoFun = new FuncionarioTercerizado(despesaAdicional, nome, hora, valorPorHora);
                listaF.add(novoFun);
                
                continue;
            }
            
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Horas: ");
            Integer hora = sc.nextInt();
            sc.nextLine();
            
            System.out.print("ValorPorHora: ");
            Double valorPorHora = sc.nextDouble();
            sc.nextLine();
            
            Funcionario novofun= new Funcionario(nome, hora, valorPorHora);
            
            listaF.add(novofun);
        }
        
        System.out.println("");
        System.out.println("Pagamentos:");
        for(int j=0; j < listaF.size(); j++ ){
            System.out.println(""+listaF.get(j).toString());
        }
    }
}
