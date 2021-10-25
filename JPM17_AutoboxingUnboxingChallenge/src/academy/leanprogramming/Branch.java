package academy.leanprogramming;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(String cName){
        if(getCustomerId(cName)==-1){
            customers.add(new Customer(cName));
        }else{
            System.out.println("There's already such a customer");
        }
    }

    public void addTransactionToCustomer(double newT, String cName){
        int id = getCustomerId(cName);
        if(id==-1){
            System.out.println("There is no such customer");
        }else{
            customers.get(id).addTransaction(newT);
        }
    }//the method must check if there's such a customer, then add a new transaction to his list

    private int getCustomerId(String name){
        for (int i = 0; i < customers.size(); i++){
            if(customers.get(i).getName().equals(name)){
                return i;
            }
        }

        return -1;
    }

    public void printListOfCustomers(){
        for (int i = 0; i < customers.size(); i++){
            System.out.println(customers.get(i).getName());
        }
    }
}
