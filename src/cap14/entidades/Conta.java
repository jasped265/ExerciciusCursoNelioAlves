/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap14.entidades;

/**
 *
 * @author jaspe
 */
public class Conta {
    
    private Integer numero;
    private String holder;
    private Double balance;
    private Double withDrawLimit;

    public Conta(Integer numero, String holder, Double balance, Double withDrawLimit) {
        this.numero = numero;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void setWithDrawLimit(Double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }
    
    public void deposit(Double amount){
        this.balance = amount;
    }
    
    public void withDraw(Double amount) throws DomainException{
        if( amount > this.withDrawLimit){
            throw new DomainException ("Erro: A quantia excedeu o limite de Sack!!!");
        }else if((balance - amount) < 0 || (this.balance == 0)){
            throw new DomainException ("Not enough balance");
        }    
        
        this.balance -= amount;
    }
}
