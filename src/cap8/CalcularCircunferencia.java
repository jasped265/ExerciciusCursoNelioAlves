/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap8;
import java.util.Scanner;
import cap8.Entidades.calculador;
/**
 *
 * @author jaspe
 */
public class CalcularCircunferencia {
    public static  void TestarCalcularCircunferência(){
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("");
        double radius = sc.nextDouble();
        
        double c = calculador.circunferencia(radius);
        double v = calculador.volume(radius);
        
        System.out.println("circunferencia: "+String.format("%.2f", c));
        System.out.println("volume: "+String.format("%.2f", v));
         
    }        
    
}
