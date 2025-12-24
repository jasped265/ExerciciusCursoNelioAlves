/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cap16;
import Cap16.model.entidades.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author jaspe
 */
public class ProcessarContrato {
    public static void gerarParcelas(){
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("Entre dados Contratos: ");
        System.out.print("Numero: ");
        String numContrato = sc.nextLine();
        
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate dataContrato = LocalDate.parse(sc.nextLine(), dtf);
       
        System.out.print("Valor do contrato: ");
        double valorContrato = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Entre como o numero de Parcelas: ");
        int numParcela = sc.nextInt();
        sc.nextLine();
        
        Contrato contrato = new Contrato(numContrato, dataContrato);
        
        ProcessPayment service;
        service = new ProcessPayment(new PaypalTax(), valorContrato, numParcela);
        
        service.processar(contrato);
        
        System.out.println("Parcelas: ");
        for(Parcela p : contrato.getListaParcela()){
            System.out.println(""+p.toString());
        }
    }
}
