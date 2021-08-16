package Menus;

import model.Customer;
import model.Reservation;
import model.Room;
import model.RoomType;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

        Room room = new Room("121", RoomType.DOUBLE,121.7);
        Customer customer = new Customer("aziz", "kale","jeff@example.com");
//        System.out.println(customer);
//        System.out.println(room);

        Reservation res = new Reservation(customer,room,"01-08-2021","30-08-2021");
;


           MainMenu.mainMenu();


    }
}
