/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap12.entidade;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author jaspe
 */
public class Pedido1 {
    private LocalDate moment;
    private StatusDoPedido status;
    private Cliente cliente;
    
    List<PedidoDeItem> pedidos = new ArrayList<>();
    
    public Pedido1(){
        
    }
    
    public Pedido1(LocalDate moment, StatusDoPedido status, Cliente cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
    }

    public List<PedidoDeItem> getPedidos() {
        return pedidos;
    }
    
    public void adicionarItem(PedidoDeItem item){
        this.pedidos.add(item);
    }
    
    public void removeItem(PedidoDeItem item){
        this.pedidos.remove(item);
    }
    
    public Double total(){
        Double soma = 0.0;
        for(PedidoDeItem p : this.pedidos){
            soma += p.subTotal();
        }
        
        return soma;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Momento do Pedido: "+this.moment+"\n");
        sb.append("Status do Pedido: "+this.status+"\n");
        sb.append("Cliente: "+this.cliente.getName()+" "
                +this.cliente.dataDeNascimento+" "
                +this.cliente.email
                +"\n");
        sb.append("Order Items"+"\n");
        
        int soma = 0;
        
        for(PedidoDeItem p : this.getPedidos()){
            sb.append(""+p.produto.getName()
                    +", $"+p.getPrice()
                    +", Quantidade"
                    +p.getQuantidade()
                    +", Subtotal: "
                    +p.subTotal()
                    +"\n");
                    soma += p.subTotal();
        }
        
        sb.append("Total: "+soma);
        return sb.toString();
    }
}
