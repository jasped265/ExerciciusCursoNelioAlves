/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import cap17.model.entidades.*;
/**
 *
 * @author jaspe
 */
public class Curinga {
    public static void copiarValor(){
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();
        
        Assistant.copy(myInts, myObjs);
        Assistant.print(myObjs);
        
        Assistant.copy(myDoubles, myObjs);
        Assistant.print(myObjs);
    }
}
