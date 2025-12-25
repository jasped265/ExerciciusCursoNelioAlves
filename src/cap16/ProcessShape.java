/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap16;
import cap16.model.entidades.Rectangle;
import cap16.model.entidades.AbstractShape;
import cap16.model.entidades.Color;
import cap16.model.entidades.Circle;
/**
 *
 * @author jaspe
 */
public class ProcessShape {
    public static void figura(){
        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(3.0, 4.0, Color.WHITE);
        
        System.out.println("Circle color: "+s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        
        System.out.println("Circle color: "+s2.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s2.area()));
    }
}
