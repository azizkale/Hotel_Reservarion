package Menus;

import service.CustomerService;

import java.util.Scanner;

public class MainMenu {

    public static void mainMenu(){
        System.out.println("----MAIN MENU----");
        System.out.println("1.Find and reserve a room");
        System.out.println("2.See my reservations");
        System.out.println("3.Create and account");
        System.out.println("4.Admin");
        System.out.println("5.Exit");

        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();


        if(number.equalsIgnoreCase("1")){
            System.out.println("main menu option 1");
        }
        if(number.equalsIgnoreCase("2")){
            System.out.println("aziz kale");
        }
        if(number.equalsIgnoreCase("3")){
            // email
            System.out.println("enter a email please:");
            Scanner scanner1 = new Scanner(System.in);
            String email = scanner1.nextLine();

            // first name
            System.out.println("enter your first name please:");
            Scanner scanner2 = new Scanner(System.in);
            String firstName = scanner2.nextLine();

            // last name
            System.out.println("enter your last name please:");
            Scanner scanner3 = new Scanner(System.in);
            String lastName = scanner3.nextLine();
            CustomerService.addCustomer(email,firstName,lastName);
        }
        if(number.equalsIgnoreCase("4")){
            AdminMenu.adminMenu();
        }
        if(number.equalsIgnoreCase("5")){
            System.exit(0);
        }

        mainMenu();
    }

}

