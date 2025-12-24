/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cap16.model.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jaspe
 */
public class Parcela {
    
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate data;
    private Double valor;

    public Parcela(LocalDate data, Double valor) {
        this.data = data;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return ""+data.format(dtf) + " - " + String.format("%.2f", valor);  
    }       
}
