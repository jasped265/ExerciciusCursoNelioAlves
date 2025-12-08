/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap13.entidades;

/**
 *
 * @author jaspe
 */
public abstract class Pessoa {
    private String nome;
    private double rendAnual;

    public Pessoa(){
        
    }
    
    public Pessoa(String nome, double rendAnual) {
        this.nome = nome;
        this.rendAnual = rendAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendAnual() {
        return rendAnual;
    }

    public void setRendAnual(double rendAnual) {
        this.rendAnual = rendAnual;
    }
    
    public abstract double  calcularImposto();
}