/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap13.entidades;


/**
 *
 * @author jaspe
 */
public class ProdutoImportado extends Produto{
    Double taxAlfandega;

    public ProdutoImportado(String nome, Double preco, Double taxAlfandega) {
        super(nome, preco);
        this.taxAlfandega = taxAlfandega;
    }

    public Double getTaxaAlfandega() {
        return taxAlfandega;
    }

    public void setTaxaAlfandega(Double taxAlfandega) {
        this.taxAlfandega = taxAlfandega;
    }
    
    
    @Override
    public String etiqueta(){
        return ""+super.getNome()+", "+super.getPreco()+", (Taxa da Alfandega: $"+taxAlfandega+")";
    }
    
    public Double precoTotal(){
        return 0.0;
    }
}
