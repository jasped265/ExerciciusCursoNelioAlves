/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap10;
import java.util.Scanner;
/**
 *
 * @author jaspe
 */
public class calcularMediaVetorN {
   public static void calcularMedia(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Quantas alturas deseja ler?");
       int n = sc.nextInt(); 
       double[] altura = new double[10];
       double media = 0;
       double somaAltura = 0;
       
       for (int i =0; i < n; i++){
           System.out.println("Digite a "+(i+1)+"º Altura: ");
           altura[i] = sc.nextDouble();
           somaAltura += altura[i];
       }
      
       media = somaAltura/n;
       
       System.out.printf("media altura = %.2f", media);
   }
}
