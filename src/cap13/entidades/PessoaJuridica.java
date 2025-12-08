/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap13.entidades;

/**
 *
 * @author jaspe
 */
public class PessoaJuridica extends Pessoa{
    int numDeFuncionario;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, double rendAnual, int numDeFuncionarios) {
        super(nome, rendAnual);
        this.numDeFuncionario = numDeFuncionarios;
    }

    public int getNumDeFuncionario() {
        return numDeFuncionario;
    }

    public void setNumDeFuncionario(int numDeFuncionario) {
        this.numDeFuncionario = numDeFuncionario;
    }
   
    @Override
    public double calcularImposto() {
       if(this.numDeFuncionario <= 10){
           return (super.getRendAnual()*(16.0/100.0));
       }
       
       return (super.getRendAnual()*(14.0/100.0));
    }
    
      @Override
    public String toString(){
        return ""+super.getNome()+", $"+String.format("%.2f",this.calcularImposto());
    }
}
