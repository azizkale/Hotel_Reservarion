package api;

import model.Customer;
import model.IRoom;
import model.Reservation;
import service.CustomerService;

import java.util.Collection;
import java.util.Date;


public class HotelResource {
    public static Customer getCustomer(String email){
        System.out.println(CustomerService.allCustomers.get("email"));
        return CustomerService.allCustomers.get("email");
    }

    public static void createACustomer(String email, String firstName, String lastName){

    }
    public static Reservation bookARoom(String customerEmail, IRoom room, Date checkInDate, Date checkOutDate){
        return null;
    }

    public static Collection<Reservation> getCustomerReservations(String customerEmail){
        return null;
    }

    public static Collection<IRoom> findARoom(Date chechIn, Date checkOut){
//        for(Map.Entry<String, IRoom> room:AdminResource.allRooms.entrySet()){
//            if(room.getValue().isFree()) {
//                System.out.println(room);
//            }
//        }
        return null;
    }
}
