package api;

import Menus.AdminMenu;
import model.Customer;
import model.IRoom;
import model.Room;
import model.RoomType;
import service.CustomerService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AdminResource {

    public static Map<String, IRoom> allRooms = new HashMap<>();

    public  Customer getCustomer(String email){
        System.out.println(CustomerService.allCustomers.get("email"));
       return CustomerService.allCustomers.get("email");
    }

    public static void addRoom( Map<String, IRoom> allRooms){
        try {
            // Room Number
            System.out.println("Define A Room Number:");
            Scanner scanner1 = new Scanner(System.in);
            String roomNumber = scanner1.nextLine();

            System.out.println("Select Room Type:");
            System.out.println("1.DOUBLE - 2.SINGLE");
            Scanner scanner2 = new Scanner(System.in);
            String roomTypeOption = scanner2.nextLine();

            // Price
            System.out.println("Enter room price:");
            Scanner scanner3 = new Scanner(System.in);
            double price = Double.parseDouble(scanner3.nextLine());

            // Room Type
            String roomTypeRegex = "[1-2]";
            Pattern pattern = Pattern.compile(roomTypeRegex);
            if(!pattern.matcher(roomTypeOption).matches()){
                throw new IllegalArgumentException("Invalid Room Type");
            }

            RoomType roomType= null;
            switch(roomTypeOption){
                case "1":
                    roomType= RoomType.SINGLE;
                    break;
                case "2":
                    roomType= RoomType.DOUBLE;
                    break;
                }
                Room room = new Room(roomNumber,roomType, price);
            if(!allRooms.containsKey(roomNumber) && roomType != null){
                allRooms.put(roomNumber,room);
                System.out.println("Room Added Successfully");
            }
            else {
                System.out.println("the room number " + roomNumber + " is used before. Please try again with another room number!");
            }
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        finally {
            AdminMenu.adminMenu();
        }
    }

    public static void getAllRooms(){

        if(allRooms.size()==0)
            System.out.println("No Room Added Yet!");
        else{
            for(Map.Entry<String, IRoom> rm:allRooms.entrySet()){
                System.out.println(rm);
            }
        }
//        AdminMenu.adminMenu();
    }

    public void getAllCustomers(){
        if(CustomerService.allCustomers.size()==0) {
            System.out.println("No Account Added Yet!");
            AdminMenu.adminMenu();
        } else{
            for(Map.Entry<String, Customer> rm:CustomerService.allCustomers.entrySet()){
                System.out.println(rm);
            }
//            AdminMenu.adminMenu();
        }
    }

    public void displayAllReservations(){

    }
}
