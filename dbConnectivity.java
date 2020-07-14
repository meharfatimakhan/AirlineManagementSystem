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
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class dbConnectivity {

    Connection con;
    Statement stmt;

    dbConnectivity() //cons
    {
        try {
            String s = "jdbc:sqlserver://localhost:1433;databaseName=flightManagement";
            con = DriverManager.getConnection(s, "mehar", "123456");

            stmt = con.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    ArrayList<Flight> LoadAllFlights() {
        ArrayList<Flight> flightRecord = new ArrayList<>();
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM Flight");
            while (rs.next()) {

                String flightNo, airline, origin, destination, date, time;

                flightNo = rs.getString(1);
                airline = rs.getString(2);
                origin = rs.getString(3);
                destination = rs.getString(4);
                date = rs.getString(5);
                time = rs.getString(6);
                System.out.println(flightNo + " " + airline + " " + origin + " " + destination + " " + date + " " + time);
                Flight newFlightEntry = new Flight(flightNo, airline, origin, destination, date, time);
                flightRecord.add(newFlightEntry);

            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return flightRecord;
    }

//    int checkEntry(int PrimaryKey) {
//
//        try {
//            ResultSet result= stmt.executeQuery("SELECT numberOfEntry FROM Flight WHERE numberOfEntry='" + PrimaryKey + "'");
//            System.out.print(result.getInt(1));
//            return result.getInt(1);
//
//        } catch (Exception e) {
//            System.out.println(e);
//            return -1;
//        }
//       // return -1;
//    }
     void addNewFlight(Flight obj) {

        try {
            stmt.executeUpdate("Insert into Flight (flightNo, airline, origin , destination,date,time) values('" + obj.flightNo + "','" + obj.airline + "','" + obj.origin + "','" + obj.destination + "','" + obj.date + "','" + obj.time+ "')");

        } catch (Exception e) {
            System.out.println(e);

        }

    }


    void DeleteFlight(String flightNumber) {
        try {
            System.out.println(flightNumber + " deleted");
            stmt.executeUpdate("DELETE FROM Flight WHERE flightNo='" + flightNumber + "'");

        } catch (Exception e) {
            //System.out.println(flightNumber + "deleteE");
            System.out.println(e);

        }
    }

    void closeConnection() {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     
    void setFlightNumber(String flightNumber, String updatedFlightNumber) {

        try {
            int i = stmt.executeUpdate("UPDATE Flight SET flightNo='" + updatedFlightNumber + "'Where flightNo='" + flightNumber + "'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    void setAirline(String flightNumber, String updatedAirline) {

        try {
            int i = stmt.executeUpdate("UPDATE Flight SET airline='" + updatedAirline + "'Where flightNo='" + flightNumber + "'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    void setOrigin(String flightNumber, String updatedOrigin) {

        try {
            int i = stmt.executeUpdate("UPDATE Flight SET origin='" + updatedOrigin + "'Where flightNo='" + flightNumber + "'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    void setDestination(String flightNumber, String updatedDestination) {

        try {
            int i = stmt.executeUpdate("UPDATE Flight SET destination='" + updatedDestination + "'Where flightNo='" + flightNumber + "'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     void setDate(String flightNumber, String updatedDate) {

        try {
            int i = stmt.executeUpdate("UPDATE Flight SET date='" + updatedDate + "'Where flightNo='" + flightNumber + "'");
        } catch (Exception e) {
            System.out.println(e);
        }
     }
      void setTime(String flightNumber, String updatedTime) {

        try {
            int i = stmt.executeUpdate("UPDATE Flight SET time='" + updatedTime + "'Where flightNo='" + flightNumber + "'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
