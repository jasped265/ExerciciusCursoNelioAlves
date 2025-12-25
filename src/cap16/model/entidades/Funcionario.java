/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap16.model.entidades;

/**
 *
 * @author jaspe
 */
public class Funcionario implements Comparable<Funcionario>  {
    private String nome;
    private Double salario;

    public Funcionario (String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "" + nome + ", " + salario + '}';
    }

    @Override
    public int compareTo(Funcionario o) {
        return -salario.compareTo(o.getSalario());
    }
   
}
