/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap10;
import cap10.entidades.Empregado;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author jaspe
 */
public class RegistroDeEmpregados {
    public static void registrarEmpregados(){
         Scanner sc = new Scanner(System.in);
         ArrayList<Empregado>  listaEmpregado = new ArrayList<>();
         
         System.out.println("Quantos empregados deseja registrar?");
         int n = sc.nextInt();
         sc.nextLine();
         
         for(int i = 0; i < n; i++ ){
             System.out.println("Empregado #"+i);
             
             System.out.print("Id: ");
             int id = sc.nextInt();
             sc.nextLine();
             
             System.out.print("Nome: ");
             String nome = sc.nextLine();
             
             System.out.print("Salario: ");
             double salario = sc.nextDouble();
             
             Empregado empregado = new Empregado(id, nome, salario);
             
             listaEmpregado.add(empregado);
         }
         
         System.out.println("");
         System.out.println("Lista de Empregados: ");
         
         for(Empregado e : listaEmpregado ){
             System.out.println(""+e.toString());
         }
         
         System.out.println("");
    }  
}
