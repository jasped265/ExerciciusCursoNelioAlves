/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cap10.entidades;

/**
 *
 * @author jaspe
 */

public class Quarto {
    private boolean ocupado;
    private String ocupante;
    private String email;

    public Quarto(boolean ocupado, String ocupante, String email, int id) {
        this.ocupado = ocupado;
        this.ocupante = ocupante;
        this.email = email;
        this.id = id;
    }
    private int id;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Quarto(){
        
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getOcupante() {
        return ocupante;
    }

    public void setOcupante(String ocupante) {
        this.ocupante = ocupante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
