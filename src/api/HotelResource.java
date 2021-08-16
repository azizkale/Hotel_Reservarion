package api;

import model.Customer;
import model.IRoom;
import model.Reservation;
import service.CustomerService;

import java.util.Collection;
import java.util.Date;


public class HotelResource {
    public static Customer getCustomer(String email){
        Customer customer = CustomerService.allCustomers.get(email);
        if(customer!= null){
            return customer;
        }
        else
            return null;
    }

    public static void createACustomer(String email, String firstName, String lastName){
        CustomerService.addCustomer(email,firstName,lastName);
    }
    public static Reservation bookARoom(String customerEmail, IRoom room, Date checkInDate, Date checkOutDate){
        return null;
    }

    public static Collection<Reservation> getCustomerReservations(String customerEmail){
        return null;
    }

    public static Collection<IRoom> findARoom(Date chechIn, Date checkOut){

        return null;
    }
}
