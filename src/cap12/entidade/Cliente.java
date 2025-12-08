/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap12.entidade;
import java.time.LocalDate;
/**
 *
 * @author jaspe
 */
public class Cliente {
    String name;
    String email;
    LocalDate dataDeNascimento;
    
    public Cliente(){
        
    }
    
    public Cliente(String name, String email, LocalDate dataDeNascimento) {
        this.name = name;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
}
