/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap12.entidade;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author jaspe
 */
public class Trabalhador {
    private String nome;
    private NivelDoTrabalhador nivel;
    private Double salarioBase;
    
    private Departamento departamento;
    
    private List<ContratoPorHora> Contratos = new ArrayList<>();
    
    
    public Trabalhador(){
        
    }
    
    public Trabalhador(String nome, NivelDoTrabalhador nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelDoTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelDoTrabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoPorHora> getListaContrato() {
        return Contratos;
    }

  
    public void adicionarContrato(ContratoPorHora contrato){
        this.Contratos.add(contrato);
    }
    
    public void removerContrato(ContratoPorHora contrato){
        this.Contratos.remove(contrato);
    }
    
    public Double income(int ano, int mes){
        double income = this.salarioBase;
        for(ContratoPorHora c : this.Contratos){
             if( c.data.getMonthValue() == mes && c.data.getYear() == ano){
                    System.out.println(""+c.valorPorHora);
                    income += c.valorTotal();
             }
        }
        
        return income;
    }
}
