/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cap16.model.entidades;
/**
 *
 * @author jaspe
 */
public class ProcessPayment {
    PaymentService service;
    double valorContrato;
    int numParcela;

    public ProcessPayment(PaymentService service, double valorContrato, int numParcela) {
        this.service = service;
        this.valorContrato = valorContrato;
        this.numParcela = numParcela;
    }
        
    public void processar (Contrato contrato){
        double base = valorContrato/(double)numParcela;
        int n = numParcela; 
        for(int i = 0; i < n; i++){
            Parcela P = new Parcela(contrato.getDataContrato().plusMonths(i+1), service.tax(base, (i+1)));
            contrato.getListaParcela().add(P);
        }
    }
}
