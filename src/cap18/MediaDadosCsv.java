/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap18;

import cap18.model.entidade.Produto;
import java.io.FileReader;
import java.io.BufferedReader;
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
public class MediaDadosCsv {
    public static  void calcularMedia(){
        Scanner sc = new Scanner(System.in);
        List<Produto> lista = new ArrayList<Produto>();
        
        System.out.println("Enter full file path: ");
        String path = sc.nextLine();
        
        try(BufferedReader br = new BufferedReader(new FileReader(path)) ){
                String line = br.readLine();
                
                while(line != null){
                        String[] data = line.split(",");
                        String nome = data[0];
                        Double valor = Double.valueOf(data[1]);
                        lista.add(new Produto(nome, valor));
                        line = br.readLine();
                }
                Double soma = lista.stream()
                        .map(x -> x.getPreco())
                        .reduce(0.0, (x, y) -> x + y );
                Comparator<String> comp = (x, y) -> x.toUpperCase().compareTo(y.toUpperCase());
                
                Double media = soma/lista.size();
                List<String> nomes = lista.stream()
                        .filter(x -> x.getPreco() < media)
                        .map(x -> x.getNome())
                        .sorted(comp.reversed())
                        .collect(Collectors.toList());
                
                System.out.println("Avarage price: "+String.format("%.2f", media));
                nomes.forEach(System.out::println);
                
        }catch(IOException e){
            System.out.println(""+e.getMessage());
        }
    }
}
