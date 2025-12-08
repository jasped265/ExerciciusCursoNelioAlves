/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap13;
import java.util.Scanner;
import cap13.entidades.*;
import cap13.entidades.Color;
import java.util.ArrayList;

/**
 *
 * @author jaspe
 */
public class LerNformas {
    
    public static void calCularAreas(){
       Scanner sc = new Scanner(System.in);
       
       ArrayList<Forma> listaForma =  new ArrayList<>();
       
        System.out.println("Digite o numero de formas: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++){
            System.out.println(" forma #"+i +" data:");
            System.out.println("Rectangle or Circle (r/c)?");
            char resposta = sc.nextLine().charAt(0);
            
            System.out.print("Color (BLACK/BLUE/RED): ");
            String cor = sc.nextLine();
            
            Color color = Color.valueOf(cor);
            
            if(resposta == 'r'){
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                sc.nextLine();
                
                System.out.println("Altura: ");
                double altura = sc.nextDouble();
                sc.nextLine();
                
                Retangulo  ret = new Retangulo(altura, largura, color);
                
                listaForma.add(ret);
            }else{
                
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                sc.nextLine();
              
                Circulo  cir = new Circulo(color, raio);
                
                listaForma.add(cir);
            }
            
            System.out.println("Area Das Formas: ");
            for(Forma f : listaForma)
                System.out.println(""+String.format("%.2f ",f.area()));
            }
        }
    }
