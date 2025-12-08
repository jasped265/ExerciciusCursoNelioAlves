/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap13.entidades;

/**
 *
 * @author jaspe
 */
public class Funcionario {
    private String nome;
    private Integer hora;
    private Double valorPorHora;

    public Funcionario(String nome, Integer hora, Double valorPorHora) {
        this.nome = nome;
        this.hora = hora;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    
    public Double pagamento(){
        return (hora*valorPorHora);
    }
    
    @Override
    public String toString(){
        
        return " "+nome+", "+" $"+pagamento();
    }
    
}
