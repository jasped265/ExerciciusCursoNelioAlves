/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap16.model.entidades;

import java.time.Duration;

/**
 *
 * @author jaspe
 */
public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;
    
    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    
    public void processInvoice(CarRental carRental){    
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hour = minutes/60.0;
        double basicPayment = 0.0;
        
        if(hour <= 12.0){
            basicPayment = this.pricePerHour * Math.ceil(hour);
        }else{
            basicPayment = this.pricePerDay * Math.ceil(hour / 24.0) ;
        }
        
        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }    
}
