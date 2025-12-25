/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap16;

import cap16.model.entidades.BrazilTaxService;
import cap16.model.entidades.CarRental;
import cap16.model.entidades.RentalService;
import cap16.model.entidades.Vehicle;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Locale;
/**
 *
 * @author jaspe
 */
public class RealizarLocacao {
    public static void realizarLocacao(){
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
     
        System.out.println("Entre com os dados do Aluguel: ");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();

        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime dataRetirada = LocalDateTime.parse(sc.nextLine(),dtf);

        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime dataRetorno = LocalDateTime.parse(sc.nextLine(), dtf);
       
        Vehicle v = new Vehicle(carModel);
        CarRental cr = new CarRental(dataRetirada, dataRetorno, v);
        
        BrazilTaxService taxService = new BrazilTaxService();
        
        System.out.print("Entre com o preço por hora:  ");
        double precoPorHora = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Entra com o preco por dia: ");
        double precoPorDia = sc.nextDouble();
        sc.nextLine();
       
        RentalService rs = new RentalService(precoPorHora, precoPorDia, new BrazilTaxService());
        rs.processInvoice(cr);
        
        System.out.println("Fatura: ");
        System.out.println("Pagamento Basico: "+String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: "+String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("pagamento total: "+String.format("%.2f", cr.getInvoice().getTotalPayment()));
    }
}
