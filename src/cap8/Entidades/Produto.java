/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap8.Entidades;

/**
 *
 * @author jaspe
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(){
        
    }
    
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString(){
       return "Dados do produto: "
               +this.nome
               +", $"+String.format("%.2f", this.preco)
               +", "+this.quantidade
               +" unidades"
               +", ValorTotal: "
               +String.format("%.2f", (this.quantidade*this.preco));
    }
    public void adicionarProdutos(int quantidade){
        this.quantidade += quantidade;
    }
    
    public void removerQuantidade(int quantidade){
        this.quantidade -= quantidade;
    }
    public double valorTotalNoEstoque(){
        return this.quantidade *this.preco;
    }
}
