/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap11;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;
/**
 *
 * @author jaspe
 */
public class OperaçãoSimpleDateFormat {
   
    public static void aplicarSimpleForamt() throws ParseException{
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
        
        Date y1 = sdf1.parse("03/12/2025");
        Date y2 = sdf2.parse("02/12/2025 15:42:03");
        Date y3 = new Date();
        
        Date x1 = new Date(0L);
        Date x2 = new Date(1000L * 60L * 60L *5L);
        Date x3 = Date.from(Instant.parse("2025-12-03T19:27:35"));
        
        System.out.println("Datey1 parse: "+y1);
        System.out.println("Datey1 parse: "+y2); 
        
        System.out.println("");
        
        System.out.println("Datey1 format: "+sdf1.format(y1));
        System.out.println("Datey2 format: "+sdf2.format(y2));
        System.out.println("DateY3 new Date: "+y3);
        
         System.out.println("Date x1 new Date 0L: "+x1);
         
         System.out.println("Date x2 new dat 5am: "+x2);
    }
   
}
