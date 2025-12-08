/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap9;

/**
 *
 * @author jaspe
 */
public class Conta {
    private int numConta;
    private String nomeTitular;
    private double valorDeposito;
    private static final double TAXA = 5.00;
    public Conta(){
        
    }
    
    public Conta(int numConta, String nomeTitular, double valorDeposito){
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.valorDeposito = valorDeposito;
    }
    
    public Conta(int numConta, String nomeTitular){
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
    }
    
    public void setNomeTitular(String nome){
        this.nomeTitular = nome;
    }
    
    public String getNomeTitular(){
        return this.nomeTitular;
    }
     
    public double getValorDeposito(){
        return this.valorDeposito;
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public void aumentarSaldo(double incremento){
        this.valorDeposito += incremento;
    }
    
    public void diminuirSaldo(double decremento){
        this.valorDeposito -= TAXA;
        this.valorDeposito -= decremento;
    }
    
    @Override
    public String toString(){
        return "Num da conta: "+this.numConta
                +" Nome: "+this.nomeTitular
                +" Valor Na Conta: "+this.valorDeposito;
    }
}
    