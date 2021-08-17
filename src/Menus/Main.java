package Menus;

import api.AdminResource;
import model.Customer;
import model.Reservation;
import model.Room;
import model.RoomType;
import service.CustomerService;
import service.ReservationService;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        Room room = new Room("121", RoomType.DOUBLE,121.7);
        AdminResource.allRooms.put("122",new Room("122",RoomType.SINGLE,100.0));
        AdminResource.allRooms.put("123",new Room("123",RoomType.DOUBLE,200.0));
        AdminResource.allRooms.put(room.getRoomNumber(),room);
        Customer customer = new Customer("aziz", "kale","jeff@example.com");
        CustomerService.allCustomers.put(customer.getEmail(),customer);
//        System.out.println(customer);
//        System.out.println(room);

        Reservation res = new Reservation(customer,
                room,
                new SimpleDateFormat("dd-MM-yyyy").parse("01-08-2021"),
                new SimpleDateFormat("dd-MM-yyyy").parse("30-08-2021"));
        ReservationService.allReservations.put(room.getRoomNumber(),res);


           MainMenu.mainMenu();

//        Date date1 = new Date(2021,10,01);
//        Date date2 = new Date(2021,10,05);
//
//        System.out.println(date1.before(date2));

    }
}
