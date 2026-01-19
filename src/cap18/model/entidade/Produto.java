/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap18.model.entidade;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author jaspe
 */

public class Produto implements Predicate<Produto>, Comparator<Produto>{
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

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public static boolean minimo(Produto p){
        return p.getPreco() > 100;
    }
    
    public static void staticUpdatePrice(Produto p){
       p.setPreco(p.getPreco() * 1.1);
    }
    
    public void nonStaticUpdatePrice(){
         setPreco(getPreco() * 1.1);
    }
    
    public static String staticoProdutoPorNome(Produto p){
        return p.getNome().toUpperCase();
    }
   
    public String nonStaticProdutoPorNome(){
       return nome.toUpperCase();
    }
    
    @Override
    public String toString() {
        return "Produto{" + "nome =" + nome + ", preco =" + String.format("%.2f", preco) + '}';
    }    
    
    @Override
    public boolean test(Produto t) {
        return t.getPreco() > 100;
    }

    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getPreco().compareTo(o2.getPreco());
    }
}
