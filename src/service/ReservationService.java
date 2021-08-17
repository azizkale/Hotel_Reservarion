package service;

import api.AdminResource;
import model.Customer;
import model.IRoom;
import model.Reservation;

import java.text.DateFormat;
import java.util.*;

public class ReservationService {

  public static Map<String, Reservation> allReservations = new HashMap<>();

    public static void addRoom(IRoom room){

    }

    public static IRoom getARoom(String roomId){
        AdminResource.allRooms.get(roomId);
        return null;
    }

    public static Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        // Creating reservation
        Reservation reservation = new Reservation(customer,getARoom(room.getRoomNumber()),
              checkInDate, checkOutDate);

        // Adding the resevervation to the List
        allReservations.put(room.getRoomNumber()+
                " checkin date: "+ DateFormat.getDateInstance().format(checkInDate) +
                " checkout date: " + DateFormat.getDateInstance().format(checkOutDate), reservation);
        System.out.println("Reservation created succesfully!");
        return reservation;
    }

    public static Collection<IRoom> findRoom(Date checkInDate, Date checkOutDate){
        List<IRoom> availableRooms = new ArrayList<>();
        for(Map.Entry<String, IRoom> room:AdminResource.allRooms.entrySet()){
           if(room.getValue().isFree(checkInDate,checkOutDate)){
               availableRooms.add(room.getValue());
               System.out.println(room.getValue());
           }
        }
        return availableRooms;
    }
    public Collection<Reservation> getCustomersReservation(Customer customer){
        return null;
    }
    public static void printAllReservation(){

    }

}
