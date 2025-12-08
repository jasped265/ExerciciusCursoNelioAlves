/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap13.entidades;


/**
 *
 * @author jaspe
 */
public class ContaCorporativa extends Conta{
    double limiteDeEmprestimo;

    public ContaCorporativa(){
        super();
    }
    public ContaCorporativa(double limiteDeEmprestimo, Integer numero, String titular, Double saldo) {
        super(numero, titular, saldo);
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }

    public double getLimiteDeEmprestimo() {
        return limiteDeEmprestimo;
    }

    public void setLimiteDeEmprestimo(double limiteDeEmprestimo) {
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }
     
    public void emprestimo(Double valorDeEmprestimo){
        if(limiteDeEmprestimo >= valorDeEmprestimo)
        depositar(valorDeEmprestimo);
    }
    
    @Override
     public void sacar(Double quantidadeASacar){
         super.sacar(quantidadeASacar);
         saldo -= 2.0; 
    }
}
