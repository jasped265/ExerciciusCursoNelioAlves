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
public class posicaoMatriz {
    public static void acederMatriz(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de N1 e N2: ");
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        
        int[][] mat = new int[n][n1];
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Digite o valor deseja encontrar:");
        int find = sc.nextInt();
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == find){
                    System.out.println("Posição: "+i+","+j);
                    if(j-1 >= 0){
                         System.out.println("Left: "+mat[i][j-1]);
                    }else{
                        System.out.println("Não possui esquerda!");   
                    }
                    
                    if(j+1 < mat[i].length){
                        System.out.println("Right: "+mat[i][j+1]);
                    }else{
                        System.out.println("Não possui Direita!");
                    }
                    
                    if(i+1 < mat.length){
                        System.out.println("Down: "+mat[i+1][j]);
                    }else{
                        System.out.println("Não possui Baixo!");
                    }
                    
                    if(i-1 >= 0){
                        System.out.println("up: "+mat[i-1][j]);
                    }else{
                        System.out.println("Não possui Cima!");
                    }
                }
            }
        } 
    }
}
