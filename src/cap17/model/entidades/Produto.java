/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap17.model.entidades;

/**
 *
 * @author jaspe
 */
public class Produto implements Comparable<Produto>{
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }   

    @Override
    public String toString() {
        return nome + ", " +String.format("%.2f",preco);
    }

    @Override
    public int compareTo(Produto other) {
        
        return preco.compareTo(other.getPreco());
    }    
}