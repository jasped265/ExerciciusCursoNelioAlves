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
public class LerNpessoas {
    public static void calcurlarImpostoDeN(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> listaP = new ArrayList<>();
        
        System.out.println("Digite o numero de pagadores de taxa: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++ ){
            System.out.println("Pagador de Imposto #"+i+"Dados");
            System.out.print("Individual Ou Empresa: (i/c) ");
            char res = sc.nextLine().charAt(0);
            
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Renda Anual: ");
            double renda = sc.nextDouble();
            sc.nextLine();
            
            if(res == 'i'){
                System.out.print("Gastos Com Saude: ");
                double gastoSaude = sc.nextDouble();
                sc.nextLine();
                
                PessoaFisica pessoaF = new PessoaFisica(nome, renda, gastoSaude);
                
                listaP.add(pessoaF);
            }else{
                System.out.print("Numero de Empregados: ");
                int numEmpregados = sc.nextInt();
                sc.nextLine();
                
                PessoaJuridica pessoaJ = new PessoaJuridica(nome, renda, numEmpregados);
                listaP.add(pessoaJ);
            }
            
        }
        
         System.out.println("Impostos Pagos: ");
         double ImpostoComulativo = 0.0;
         
            for(Pessoa p : listaP){
                System.out.println(""+p.toString());
                ImpostoComulativo += p.calcularImposto();
            }
            
            System.out.printf("Total De Impostos: $ %.2f", ImpostoComulativo);     
    }
}
