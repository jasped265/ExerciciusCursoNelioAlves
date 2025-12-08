/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap13;
import cap13.entidades.*;
/**
 *
 * @author jaspe
 */
public class ContaBancaria {
    public static void manipularConta(){
        Conta  cont1 = new Conta(1001, "Rodineu", 100.0);
        
        ContaCorporativa contac1 = new ContaCorporativa(200.0, 1002, "Rodineia", 150.0);
        
        //Upcasting
        
        Conta cont2 = contac1;
        ContaPoupanca cont3 = new ContaPoupanca(1003, "Marc", 155.0, 200.0);
        
        //DownCasting
        
        ContaCorporativa contac2 = (ContaCorporativa) new Conta(1001,"Roda", 100.0);        
    }
}
