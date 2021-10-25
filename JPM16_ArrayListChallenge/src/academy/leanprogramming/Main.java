package academy.leanprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static MobilePhone XiaomiT8 = new MobilePhone();

    public static void main(String[] args) {
        phoneMenu();
    }

    public static void phoneMenu(){
        boolean on = true;
        System.out.println("Hello! Welcome to XiaomiT8 menu!" +
                "\nType 1 to show list of contacts" +
                "\nType 2 to add a new contact" +
                "\nType 3 to update a contact" +
                "\nType 4 to remove a contact" +
                "\nType 5 to find a contact" +
                "\nType 0 to exit the menu"); //long instruction how to use menu
        while(on){
            int option = scan.nextInt();
            scan.nextLine();
            switch (option){
                case 1:
                    printListOfContacts();
                    break;
                case 2:
                    System.out.println("Type in name and phone number");
                    //there should be text like "Name: " and then save next line in a variable
                    addNewContact(scan.nextLine(), scan.nextLine());
                    break;
                case 3:
                    System.out.println("Type in the name of the contact you want to update and the new phone number");
                    updateContact(scan.nextLine(), scan.nextLine());
                    break;
                case 4:
                    System.out.println("Type in name of the contact to remove");
                    removeContact(scan.nextLine());
                    break;
                case 5:
                    System.out.println("Type in name of the contact you want to find");
                    findContact(scan.nextLine());
                    break;
                case 0:
                    System.out.print("Goodbye! Have a nice day!");
                    on = false;
                    break;
                default:
                    //it should just print error
                    on = false;
            }
        }
    }

    /*menu options: quit, print list of contacts, add new contact, update existing contact,
    remove contact, find existing contact*/

    public static void printListOfContacts(){
        XiaomiT8.printContactsOnList();
    }

    public static void addNewContact(String name, String phoneNumber){
        XiaomiT8.addContactToList(name, phoneNumber);
    }

    public static void updateContact(String name, String phoneNumber){
        XiaomiT8.updateContactOnList(name, phoneNumber);
    }

    public static void removeContact(String name){
        XiaomiT8.removeContactFromList(name);
    }

    public static void findContact(String name){
        XiaomiT8.printContact(XiaomiT8.findContactOnList(name));
    }
}
