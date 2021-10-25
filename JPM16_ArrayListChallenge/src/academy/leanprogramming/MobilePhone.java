package academy.leanprogramming;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> myContacts = new ArrayList<>(); //this should be hided in a constructor

    public void addContactToList(String name, String phoneNumber){
        int index = findContactOnList(name);

        if(index==-1){
            myContacts.add(new Contacts(name, phoneNumber));
            System.out.println("New contact added.");
            printContact(myContacts.size()-1);
            //the added contact is also the last contact, therefore it just prints the last contact
        }else{
            System.out.println("There's already such a contact.");
            printContact(index);
        }
    }

    public void updateContactOnList(String name, String phoneNumber){
        int index = findContactOnList(name);

        if(index==-1){
            System.out.println("There's no such contact. Nothing to update.");
        }else{
            myContacts.get(index).setPhoneNumber(phoneNumber);
            System.out.println("Contact updated: ");
            printContact(index);
        }
    }//the method checks is there's contact with such a name, gets it's index and updates phone number

    public void removeContactFromList(String name){
        int index = findContactOnList(name);

        if(index==-1){
            System.out.println("There's no such contact. Nothing to remove.");
        }else{
            myContacts.remove(index);
            System.out.println("Contact \""+ name +"\" was successfully removed.");
        }
    }

    public int findContactOnList(String name){
        for (int i = 0; i < myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }//this method returns index of contact with searched name

    public void printContact(int index){
        if(index==-1){
            System.out.println("There's no such contact.");
        }else{
            System.out.println("#"+(index+1)+
                    "\nName: "+myContacts.get(index).getName()+
                    "\nPhoneNumber: "+myContacts.get(index).getPhoneNumber());
        }
    }

    public void printContactsOnList(){
        //here should ne an if statement that checks if there is any contact on the list
        for (int i = 0; i < myContacts.size(); i++){
            printContact(i);
        }
    }
}
