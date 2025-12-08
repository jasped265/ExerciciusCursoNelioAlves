/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap8.Entidades;

/**
 *
 * @author jaspe
 */
public class calculador {
    public static final double PI = 3.14;
    
    public static double circunferencia (double raio){
        return (2.0*PI*raio);
    }
    
    public static double volume(double raio){
        return (4.0*PI*raio*raio)/3.0;
    }

}
