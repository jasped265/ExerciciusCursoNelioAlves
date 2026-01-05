/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap17.model.entidades;

import java.util.Objects;

/**
 *
 * @author jaspe
 */
public class Voto {
    private String name;
    private int numVotos;

    public Voto(String name, int numVotos) {
        this.name = name;
        this.numVotos = numVotos;
    }
    
    public int getNumVotos() {
        return numVotos;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Voto{" + "name=" + name + ", numVotos=" + numVotos + '}';
    }

  
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + this.numVotos;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Voto other = (Voto) obj;
        if (this.numVotos != other.numVotos) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }        
}
