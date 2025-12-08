/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap14.entidades;

import java.time.LocalDate;
import java.time.Duration;

/**
 *
 * @author jaspe
 */
public class Reserva {
    Integer roomNumber;
    LocalDate chekIn;
    LocalDate checkOut;

    public Reserva(Integer roomNumber, LocalDate chekIn, LocalDate checkOut) {
        this.roomNumber = roomNumber;
        this.chekIn = chekIn;
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
        return chekIn;
    }

    public void setChekIn(LocalDate chekIn) {
        this.chekIn = chekIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }
    
    
    public Integer duration(){
        Duration d = Duration.between(chekIn, checkOut);
    }
    
    public void updateData(LocalDate chekIn, LocalDate chekOut){
        
    }
}
