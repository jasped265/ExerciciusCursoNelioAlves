/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap12;
import cap12.entidade.*;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author jaspe
 */
public class OperandoEnums {
    public static void operandoProdutos(){
        Scanner sc = new Scanner(System.in);
        
        Pedido pedido = new Pedido(1090, LocalDate.now(),StatusDoPedido.PAGAMENTO_PENDENTE);
        
        StatusDoPedido sdp1 = StatusDoPedido.PAGAMENTO_PENDENTE;
        StatusDoPedido sdp2 = StatusDoPedido.valueOf("ENCAMINHADO");
        
        System.out.println(" "+pedido.toString());
        System.out.println("sdp1: "+sdp1);
        System.out.println("sdp2: "+sdp2);
        
    }
    
    
}
