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
    public Reserva(Integer roomNumber, LocalDate chekIn, LocalDate checkOut) {
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
    
    public void updateData(LocalDate checkIn, LocalDate chekOut){
        this.checkIn = checkIn;
        this.checkOut = chekOut;
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
