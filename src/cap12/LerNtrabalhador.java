/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap12;
import cap12.entidade.*;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author jaspe
 */
public class LerNtrabalhador {
    public static void lerNtrablhadorContratos(){
        Scanner sc = new Scanner(System.in);
        Departamento departamento = new Departamento();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/yyyy");
        
        System.out.print("Insira o nome do departamento: ");
        String nome = sc.nextLine();
        departamento.setNome(nome);
        
        System.out.println("Insira os Dados do trabalhador: ");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        
        System.out.print("Nivel: ");
        String nivel = sc.nextLine();
        
        System.out.print("Salario Base: ");
        double salarioBase = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Quantos contratos desejas Ler: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Trabalhador trabalhador = new Trabalhador(nome, NivelDoTrabalhador.valueOf(nivel), salarioBase, departamento);
       
        for(int i = 0; i < n; i++){
            System.out.print("Insira o contrato #"+(i+1)+" Data: ");
            System.out.print("(DD/MM/YYYY): ");
            LocalDate data = LocalDate.parse(sc.nextLine(), dtf);
            
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            sc.nextLine();
            
            System.out.print("Duração: ");
            int duracao = sc.nextInt();
            sc.nextLine();
            
            ContratoPorHora contrato = new ContratoPorHora(data, valorPorHora, duracao);
            trabalhador.adicionarContrato(contrato);
          
        }
        
        System.out.println("Insira o mes e o ano para calcular a renda (MM/YYYY)");
        String dataContrato = sc.nextLine();
        String[] partes = dataContrato.split("/");
        
        System.out.println("");
        
        System.out.println("Nome: "+trabalhador.getNome());
        System.out.println("Departamento: "+trabalhador.getDepartamento());
        System.out.println("Renda: para "
                +partes[0]
                +"/"+partes[1]
                +": "+trabalhador.income(Integer.parseInt(partes[1]), Integer.parseInt(partes[0])));
    }
}
