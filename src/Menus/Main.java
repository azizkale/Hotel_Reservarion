package Menus;

import api.AdminResource;
import model.Customer;
import model.Room;
import model.RoomType;
import service.CustomerService;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

        AdminResource.allRooms.put("122",new Room("122",RoomType.SINGLE,100.0));
        AdminResource.allRooms.put("123",new Room("123",RoomType.DOUBLE,200.0));

        Customer customer = new Customer("aziz", "kale","jeff@example.com");
        CustomerService.allCustomers.put(customer.getEmail(),customer);

        MainMenu.mainMenu();



    }
}
