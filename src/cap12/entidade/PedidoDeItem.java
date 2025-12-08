/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap12.entidade;

/**
 *
 * @author jaspe
 */
public class PedidoDeItem {
    Integer quantidade;
    Double price;
    Produto produto;
            
    public PedidoDeItem(){
        
    }
    
    public PedidoDeItem(Integer quantidade, Double price, Produto produto) {
        this.quantidade = quantidade;
        this.price = price;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public Double subTotal(){
        return (this.price * this.quantidade);
    }
    
}
