/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap13.entidades;

/**
 *
 * @author jaspe
 */
public class FuncionarioTercerizado extends Funcionario{
    Double despesaAdcional ;

    public FuncionarioTercerizado(Double despesaAdcional, String nome, Integer hora, Double valorPorHora) {
        super(nome, hora, valorPorHora);
        this.despesaAdcional = despesaAdcional;
    }

    public Double getDespesaAdcional() {
        return despesaAdcional;
    }

    public void setDespesaAdcional(Double despesaAdcional) {
        this.despesaAdcional = despesaAdcional;
    }
    
    @Override
    public Double pagamento(){
        return (super.pagamento()+(despesaAdcional*(110.0/100.0)));
    }
    
    @Override
     public String toString(){   
        return " "+super.getNome()+", "+" $"+pagamento();
    }
}
