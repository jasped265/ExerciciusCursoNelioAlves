/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap10.entidades;

/**
 *
 * @author jaspe
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double Altura;

    public Pessoa(String nome, int idade, double Altura) {
        this.nome = nome;
        this.idade = idade;
        this.Altura = Altura;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", Altura=" + Altura + '}';
    }
    
}
