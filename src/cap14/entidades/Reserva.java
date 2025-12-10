/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap14.entidades;

import java.time.LocalDate;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author jaspe
 */
public class Reserva {
    Integer roomNumber;
    LocalDate checkIn;
    LocalDate checkOut;
    
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public Reserva(Integer roomNumber, LocalDate chekIn, LocalDate checkOut) throws DomainException{
        if(!checkOut.isAfter(chekIn)){
            throw new DomainException("Error in reservatation: Check-Out date must be after check-in date");
        }
        
        this.roomNumber = roomNumber;
        this.checkIn = chekIn;
        this.checkOut = checkOut;
    }
    
    public Reserva(){
        
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getChekIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }
    
    public long duration(){
        
        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }
    
    public String updateData(LocalDate checkIn, LocalDate chekOut) throws DomainException{
        
        LocalDate dataNow = LocalDate.now();
            
        if((checkIn.isBefore(dataNow) || chekOut.isBefore(dataNow))){
              throw new DomainException ("Error in reservation: Reservation date for update must be future: "); 
        }else if(!chekOut.isAfter(checkIn)){
           throw new DomainException("Error in reservatation: Check-Out date must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = chekOut;
        
        return null;
    }
    
    @Override
    public String toString(){
        
        return "Room: "
                +this.roomNumber
                +", check-in: "
                +this.checkIn.format(dtf)
                +", check-out: "
                +this.checkOut.format(dtf)
                +", "
                +this.duration()
                +" nights";
    }
}
