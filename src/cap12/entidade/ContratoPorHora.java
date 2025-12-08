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
public class ContratoPorHora {
    LocalDate data;
    Double valorPorHora;
    int hora;
    
    ContratoPorHora(){
        
    }
    
    public ContratoPorHora(LocalDate data, Double valorPorHora, int hora) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.hora = hora;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public Double valorTotal(){
        return this.valorPorHora * this.hora;
    }
}
