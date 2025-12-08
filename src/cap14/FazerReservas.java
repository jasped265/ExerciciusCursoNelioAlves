/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap14;
import cap14.entidades.Reserva;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author jaspe
 */
public class FazerReservas {
    public static void Reaserva() throws ParseException{
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.print("Room Number: ");
        int roomNumber =sc.nextInt();
        sc.nextLine();
        
        System.out.print("Check-in date (dd/MM/yyyy): ");
        LocalDate dataIn = LocalDate.parse(sc.nextLine(), dtf);
        
        System.out.print("Check-out date (dd/MM/yyyy): ");
        LocalDate dataOut = LocalDate.parse(sc.nextLine(), dtf);
        
        
       if(!dataOut.isAfter(dataIn)){
            System.out.println("Error in reservatation: Check-Out date must be after check-in date");
       }else{
            Reserva reserva = new Reserva(roomNumber, dataIn, dataOut);
            System.out.println("Reservation: "+reserva.toString());

            System.out.println("");

            System.out.println("Enter data to update the reservation: ");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            dataIn = LocalDate.parse(sc.nextLine(), dtf);
            
            System.out.print("Check-in date (dd/MM/yyyy): ");
            dataOut = LocalDate.parse(sc.nextLine(), dtf);
            
            String error = reserva.updateData(dataIn, dataOut);
            
            if(error != null){
                System.out.println("ERROR in Reservation: "+error);
            }else{
               System.out.println("Reservation: "+reserva.toString()); 
            }                        
       }  
       sc.close();
    }
}
