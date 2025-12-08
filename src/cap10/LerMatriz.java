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
public class LerMatriz {
    public static void lerMatrizN(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de N:");
        int n = sc.nextInt();
        
        int[][] matriz = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = sc.nextInt();
                sc.nextLine();
            }
             System.out.print("");
        }
        
       /* for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Digite o valor a ser adicionado na matriz: ");
                matriz[i][j] = sc.nextInt();
                System.out.println("");
            }
        }*/
        
        System.out.println("Diagonal principal");
        int quantidadeDeNegativo = 0;
        
         for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == i){
                    System.out.print(" "+matriz[i][j]);
                }
                
                if(matriz[i][j] < 0){
                    quantidadeDeNegativo++;
                }
            }
             System.out.println("");
        }
         
        System.out.println("Numeros negativos: "+quantidadeDeNegativo);
    }
}
