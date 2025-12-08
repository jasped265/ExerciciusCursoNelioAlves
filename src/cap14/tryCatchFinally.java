/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap14;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author jaspe
 */
public class tryCatchFinally {
        public static void executeTryCatch(){
            File file = new File("C:\\Users\\jaspe\\Downloads\\TryCatchTeste.txt");
            Scanner sc = null;
            try{
                sc = new Scanner(file);
                while(sc.hasNextLine()){
                    System.out.println(""+sc.nextLine());
                }
            }
            catch(FileNotFoundException notFound){
                System.out.println("Error opning file: "+notFound.getMessage());
            }
            finally{
                if(sc != null)
                    sc.close();
                System.out.println("Bloco finally executado");
            }
        }
}
