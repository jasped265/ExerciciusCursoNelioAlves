/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap16.model.entidades;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author jaspe
 */
public class Contrato {
    String numContrato;
    LocalDate dataContrato;
    Double valorTotal;
    ArrayList<Parcela> listaParcela = new ArrayList<>();

    public Contrato(String numContrato, LocalDate dataContrato) {
        this.numContrato = numContrato;
        this.dataContrato = dataContrato;
    }
    
    public String getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(String numContrato) {
        this.numContrato = numContrato;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public ArrayList<Parcela> getListaParcela() {
        return listaParcela;
    }   
}
