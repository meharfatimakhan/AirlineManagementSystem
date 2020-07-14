/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Dell
 */
import java.util.*;
public class Flight {
    String flightNo;
    String airline;
    String origin;
    String destination;
    String date;
    String time;
    int ID;

    
    Flight(String flightNo, String airline,String origin,String destination,String date, String time){
        this.flightNo=flightNo;
        this.airline=airline;
        this.origin=origin;
        this.destination=destination;
        this.date=date;
        this.time=time;
        this.ID=0;
    }
    
     public int GetID() {

        return this.ID;

    }
   
}
