/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap11;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.Duration;
/**
 *
 * @author jaspe
 */
public class OperaçãoComFormats {
    public static void format(){
        Instant data02 = Instant.parse("2025-12-01T18:33:30Z");
        LocalDate data01 = LocalDate.ofInstant(data02,ZoneId.systemDefault());
        LocalDate data03 = LocalDate.ofInstant(data02, ZoneId.of("Portugal"));
       
        LocalDateTime data04 = LocalDateTime.parse("2025-12-01T18:33:30");
        
        System.out.println("data01 = "+data01);
        System.out.println("data02 = "+data03);
        System.out.println("Dia: "+data03.getDayOfMonth());
        System.out.println("Mês: "+data03.getMonth());
        System.out.println("Ano: "+data03.getYear());
        System.out.println("Hora: "+data04.getHour());
        
        System.out.println("data01 = "+data01.minus(8, ChronoUnit.DAYS));
        System.out.println("data01 = "+data01.plusMonths(0));
        
        Duration d1 = Duration.between(data04, data03);
        System.out.println("duration: "+d1.toDays());
    }
}
