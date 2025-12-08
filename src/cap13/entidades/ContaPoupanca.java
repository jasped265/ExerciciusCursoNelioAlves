/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap13.entidades;

/**
 *
 * @author jaspe
 */
public class ContaPoupanca extends Conta {
       private Double taxaDeJuro;

    public Double getTaxaDeJuro() {
        return taxaDeJuro;
    }

    public void setTaxaDeJuro(Double taxaDeJuro) {
        this.taxaDeJuro = taxaDeJuro;
    }
       
    public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaDeJuro){
        super(numero, titular, saldo);
        this.taxaDeJuro = taxaDeJuro;
    }
       
    public void atualizarSaldo(){
        saldo += saldo*taxaDeJuro; 
    }
    
       @Override
     public void sacar(Double quantidadeASacar){
        if(this.saldo - quantidadeASacar > 0 )
          this.saldo = this.saldo - quantidadeASacar;
    }
}
