/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap14;
import cap14.entidades.DomainException;
import cap14.entidades.Reserva;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
/**
 *
 * @author jaspe
 */
public class FazerReservas {
    public static void Reaserva(){
        
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        try{
            System.out.print("Room Number: ");
            int roomNumber =sc.nextInt();
            sc.nextLine();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate dataIn = LocalDate.parse(sc.nextLine(), dtf);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate dataOut = LocalDate.parse(sc.nextLine(), dtf);
            Reserva reserva = new Reserva(roomNumber, dataIn, dataOut);
            System.out.println("Reservation: "+reserva.toString());

            System.out.println("");

            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            dataIn = LocalDate.parse(sc.nextLine(), dtf);
            System.out.print("Check-in date (dd/MM/yyyy): ");
            dataOut = LocalDate.parse(sc.nextLine(), dtf);

            reserva.updateData(dataIn, dataOut);
            System.out.println("Reservation: "+reserva.toString()); 
        }
        catch(DateTimeParseException e){
            System.out.println("Invalide date Format");
        }
        catch(InputMismatchException e){
            System.out.println("Invalid Input");
        }
        catch(DomainException e){
            System.out.println("Error in reservation: "+e.getMessage());
        }
                              
        sc.close();
    }
}
