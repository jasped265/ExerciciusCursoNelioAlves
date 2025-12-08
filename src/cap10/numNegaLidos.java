/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap10;
import java.util.Scanner;

/****
 * /**
 *
 * @author jaspe
 */
public class numNegaLidos {
    public static void mediaNota(){
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Quantos numeros deseja ler?: ");
            int n = sc.nextInt();
            
            int[] num = new int[n];
            
            for(int i = 0; i < n; i++){
                System.out.println("Digite os número inteiros: ");
                num[i] = sc.nextInt();
            }
            
            System.out.println("NUMERO NEGATIVOS:");
            for (int j = 0; j < num.length; j++) {
                if(num[j] < 0){
                     System.out.println(" "+num[j]);
                } 
            }
    }
    
    
}
