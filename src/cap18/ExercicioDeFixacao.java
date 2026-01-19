/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap18;

import cap18.model.entidade.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author jaspe
 */
public class ExercicioDeFixacao {
    public static void salarioMaior(){
        Scanner sc = new Scanner(System.in);
        List<Employee> listaEmp = new ArrayList<>();
        
        System.out.println("Enter full file path:");
        String path = sc.nextLine();
        
        System.out.println("Enter salary: ");
        Double salary = sc.nextDouble();
        sc.nextLine();
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String[] data = line.split(",");
                listaEmp.add(new Employee(data[0], data[1], Double.valueOf(data[2])));
                line = br.readLine();
            }
            Comparator<String> comp = (x, y)-> x.toUpperCase().compareTo(y.toUpperCase());
            List<String> emp = listaEmp.stream()
                    .filter(x -> x.getSalary() > salary)
                    .map(x -> x.getEmail())
                    .sorted(comp)
                    .collect(Collectors.toList());
            emp.forEach(System.out::println);
            
            Double soma = listaEmp.stream()
                    .filter(x -> x.getNome().toUpperCase().charAt(0) == 'M' )
                    .map(x -> x.getSalary())
                    .reduce(0.0, (x, y)-> x + y );
            System.out.println("Sum of salary of people whose name starts with 'M': "+String.format("%.2f",soma));
            
        }catch(IOException e){
            System.out.println(""+e.getMessage());
        }
    }
}
