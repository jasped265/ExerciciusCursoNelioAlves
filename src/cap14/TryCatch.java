/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap14;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author jaspe
 */

public class TryCatch {
    public static void TestarTryCatch(){
        Scanner sc = new Scanner(System.in);
        try{
            String[] vect = sc.nextLine().split(" ");
            int posicao = sc.nextInt();

            System.out.println(" "+vect[posicao]); 
        }catch(ArrayIndexOutOfBoundsException ArrayOut){
            System.out.println("Posição inserida fora do escopo");
        }
        catch(InputMismatchException InputMismatch){
            System.out.println("Input Error");
        }
        
        System.out.println("Fim programa: ");
        
    }
}
