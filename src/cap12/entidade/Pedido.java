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
public class Pedido {
    private Integer id;
    private LocalDate momento;
    private StatusDoPedido statusDoPedido;
    
    public Pedido(){
        
    }
    
    public Pedido(Integer id, LocalDate momento, StatusDoPedido statusDoPedido) {
        this.id = id;
        this.momento = momento;
        this.statusDoPedido = statusDoPedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getMomento() {
        return momento;
    }

    public void setMomento(LocalDate momento) {
        this.momento = momento;
    }

    public StatusDoPedido getStatusDoPedido() {
        return statusDoPedido;
    }

    public void setStatusDoPedido(StatusDoPedido statusDoPedido) {
        this.statusDoPedido = statusDoPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", momento=" + momento + ", statusDoPedido=" + statusDoPedido + '}';
    }
       
}
