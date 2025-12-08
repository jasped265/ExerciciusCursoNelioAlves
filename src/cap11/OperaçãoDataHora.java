/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap11;
import java.time.Instant;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author jaspe
 */
public class OperaçãoDataHora {
    public static void dataHora(){
        
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        
         LocalDate date1 = LocalDate.now();
         LocalDateTime date2 = LocalDateTime.now();
         Instant date3 = Instant.now();
         
         LocalDateTime date4 = LocalDateTime.parse("2025-12-01T17:33:50");
         Instant date5 = Instant.parse("2025-12-01T17:33:50-03:00");
         LocalDate date6 = LocalDate.parse("20/10/2024", fmt1);
         LocalDateTime date7 = LocalDateTime.parse("01/12/2025 18:00", fmt2);
         
         LocalDate date8 = LocalDate.of(2025, 7, 20);
         LocalDateTime date9 = LocalDateTime.of(2025, 1, 12, 18, 05);
         
         System.out.println(""+date1);
         System.out.println(""+date2);
         System.out.println(""+date3);
         System.out.println(""+date4);
         System.out.println(""+date5);
         System.out.println(""+date6);
         System.out.println(""+date7);
         System.out.println(""+date8);
         System.out.println(""+date9.format(fmt4));
         
         System.out.println("da04"+date4.format(fmt3));
            
    }
}
