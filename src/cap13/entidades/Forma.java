/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap13.entidades;
/**
 *
 * @author jaspe
 */
public abstract class Forma {
    private Color color;
    
    public Forma() {
        
    }
    
    public Forma(Color color) {
        this.color = color;
    }
     
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public abstract double area();
}
