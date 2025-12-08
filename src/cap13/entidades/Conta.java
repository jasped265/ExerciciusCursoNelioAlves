/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap13.entidades;

/**
 *
 * @author jaspe
 */
public class Conta {
    private Integer numero; 
    private String titular;
    protected Double saldo;
            
    public Conta(Integer numero, String titular, Double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public Conta(){
        
    }
            
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }       
    
    public void sacar(Double quantidadeASacar){
        if(this.saldo - quantidadeASacar > 0 )
          this.saldo = this.saldo - quantidadeASacar + 5.0;
    }
    
    public void depositar(Double deposito){
        this.saldo += deposito;
    }
    
    
}
