/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap13.entidades;
import java.time.LocalDate;
/**
 *
 * @author jaspe
 */
public class ProdutoUsado extends Produto {
    LocalDate dataDeManufactura;

    public ProdutoUsado(String nome, Double preco, LocalDate dataDeManufactura) {
        super(nome, preco);
        this.dataDeManufactura = dataDeManufactura;
    }

    public LocalDate getDataDeManufactura() {
        return dataDeManufactura;
    }

    public void setDataDeManufactura(LocalDate dataDeManufactura) {
        this.dataDeManufactura = dataDeManufactura;
    }
    
    @Override
    public String etiqueta(){
        return ""+super.getNome()+"(used) $"+super.getPreco()
                +"(data de manufacturação:"
                +dataDeManufactura+")";
    }
    
   
}
