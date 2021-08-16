package service;

import api.AdminResource;
import model.Customer;
import model.IRoom;
import model.Reservation;
import model.Room;

import java.text.ParseException;
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
        AdminResource.allRooms.get(roomId);
        return null;
    }

    public static Reservation reserveARoom(Customer customer, IRoom room, String checkInDate, String checkOutDate) throws ParseException {
        Reservation reservation = new Reservation(customer,getARoom(room.getRoomNumber()),
              checkInDate, checkOutDate);
        allReservations.put(room.getRoomNumber(), reservation);
        System.out.println("Reservation created succesfully!");
        return reservation;
    }

    public static Collection<IRoom> findRoom(Date checkInDate, Date checkOutDate){
        return null;
    }
    public Collection<Reservation> getCustomersReservation(Customer customer){
       return null;
    }
    public static void printAllReservation(){
        for(Map.Entry<String,Reservation> res:allReservations.entrySet()){
            System.out.println(res);
        }
    }

}
