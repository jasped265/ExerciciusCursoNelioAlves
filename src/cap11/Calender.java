/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap11;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
/**
 *
 * @author jaspe
 */
public class Calender {
    public static void OperandoCalender() throws ParseException{
        
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Date x3 = Date.from(Instant.parse("2025-12-03T19:27:35Z"));
       
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.HOUR, 4);
        cal.setTime(x3);
        cal.add(Calendar.HOUR, 4);
        
        x3 = cal.getTime();
        
        System.out.println(sdf3.format(x3));
        
        int minuto = cal.get(Calendar.MINUTE);
        int mes = cal.get(Calendar.MONTH);
        
        System.out.println("Minutos: "+minuto);
        System.out.println("Mes: "+mes); 
    }
}
