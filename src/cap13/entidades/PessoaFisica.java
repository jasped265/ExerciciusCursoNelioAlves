/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap13.entidades;

/**
 *
 * @author jaspe
 */
public class PessoaFisica extends Pessoa {
    private double gastosComSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, double rendAnual, double gastosComSaude) {
        super(nome, rendAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }
    
    @Override
    public double calcularImposto(){
        if(super.getRendAnual() < 20000.00){
           return (super.getRendAnual()*(15.0/100.0) - (this.gastosComSaude*(50.0/100.0)));
        }
        return  (super.getRendAnual()*(25.0/100.0) - (this.gastosComSaude*50.0/100.0));
    }
    
     @Override
    public String toString(){
        return ""+super.getNome()+", $"+String.format("%.2f",this.calcularImposto());
    }
}
