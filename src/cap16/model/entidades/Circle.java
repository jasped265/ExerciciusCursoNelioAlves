/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap16.model.entidades;

/**
 *
 * @author jaspe
 */
public class Circle extends AbstractShape{
    Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area(){
        return Math.PI *(radius * radius);
    }
}
