/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cap16.model.entidades;

/**
 *
 * @author jaspe
 */
public class PaypalTax implements PaymentService{
    @Override
    public Double tax(Double amount, int fator  ){
        double base = amount;
        
        amount += base*0.01*fator;
        amount += base*0.02;
        return amount;
    }
}
