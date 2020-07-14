/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

/**
 *
 * @author Dell
 */
import java.util.*;

public class FlightRecord {

    List<Flight> flights;
    dbConnectivity db;
    

    FlightRecord() {
        db = new dbConnectivity();
        this.flights = new ArrayList<Flight>();
        this.flights = db.LoadAllFlights();
    }

    boolean add(Flight flightObj) {

         if (!flightObj.flightNo.matches("\\d*")) {
             System.out.println("Only numbers are allowed!");
             return false;
         }
         
        
         
        if (flights.stream().anyMatch((Flight fObj) -> fObj.flightNo.equals(flightObj.flightNo))) {
            return false;
        } else {
            db.addNewFlight(flightObj);
           // db.LoadAllFlights();
            return (flights.add(flightObj));
        }


    }

    boolean delete(String flightNumber) {

        db.DeleteFlight(flightNumber);
        //db.LoadAllFlights();
        return (flights.removeIf((Flight obj) -> obj.flightNo.equals(flightNumber)));
    }

    boolean update(String flightNumber, String updatedFlightNumber, String updatedAirline, String updatedOrigin, String updatedDestination, String updatedDate, String updatedTime) {
        if (!updatedFlightNumber.matches("\\d*")) {
             System.out.println("Only numbers are allowed!");
             return false;
         }
        
        boolean check=false;
        if (flights.stream().anyMatch((Flight fObj) -> fObj.flightNo.equals(updatedFlightNumber))){
                if (updatedFlightNumber.equals(flightNumber)) {
                    check=true;
                }
                else{
                    return false;
                }
        } 
       
        
//        System.out.println(flightNumber);
//        System.out.println(updatedFlightNumber);
        db.setAirline(flightNumber, updatedAirline);
        db.setOrigin(flightNumber, updatedOrigin);
        db.setDestination(flightNumber, updatedDestination);
        db.setDate(flightNumber, updatedDate);
        db.setTime(flightNumber, updatedTime);

        for (Flight flightObj : flights) {
            if (flightObj.flightNo.equals(flightNumber)) {

                flightObj.airline = updatedAirline;
                flightObj.origin = updatedOrigin;
                flightObj.destination = updatedDestination;
                flightObj.date = updatedDate;
                flightObj.time = updatedTime;
                db.setFlightNumber(flightNumber, updatedFlightNumber);
                flightObj.flightNo = updatedFlightNumber;
                return true;
            }
        }
        return false;
    }

}
