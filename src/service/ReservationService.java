package service;

import model.Customer;
import model.IRoom;
import model.Reservation;
import model.Room;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ReservationService {

  public static Map<String, Reservation> allReservations = new HashMap<>();

  Map<String, Room> rooms = new HashMap<>();

    public static void addRoom(IRoom room){

    }
    public static IRoom getARoom(String roomId){
        return null;
    }
    public static Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate){
        return null;
    }

    public static Collection<IRoom> findRoom(Date checkInDate, Date checkOutDate){
        return null;
    }
    public Collection<Reservation> getCustomersReservation(Customer customer){
        return null;
    }
    public static void printAllReservation(){
        
    }

}
