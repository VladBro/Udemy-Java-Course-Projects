package academy.leanprogramming;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public String getBankName() {
        return bankName;
    }

    public void addBranch(String branchName){
        if(getBranchId(branchName)==-1){
            branches.add(new Branch(branchName));
        }else{
            System.out.println("There's already a branch with such name");
        }
    }//method that adds a new branch

    public void addCustomerToBranch(String cName, String branchName){
        int branchId = getBranchId(branchName);
        if(branchId==-1){
            System.out.println("There's no such branch");
        }else{
            if(branches.get(branchId).getCustomerId(cName)==-1){
                branches.get(branchId).addCustomer(cName);
            }else{
                System.out.println("There's already such a customer in "+branchName+" branch");
            }
        }
        //first we check if there's such a branch, then if there's already such a customer in the branch
    }//method that adds a new customer to a chosen branch

    public void addTransactionToCustomerOfTheBranch(double newT, String cName, String branchName){
        int branchId = getBranchId(branchName);
        if(branchId==-1){
            System.out.println("There's no such branch");
        }else{
            if(branches.get(branchId).getCustomerId(cName)==-1){
                System.out.println("There's no such customer");
            }else{
                branches.get(branchId).addTransactionToCustomer(newT, cName);
            }
        }
    }//method that adds a new transaction to the list of a chosen customer of a chosen branch

    public void printListOfBranches(){
        for (int i = 0; i < branches.size(); i++){
            System.out.println(branches.get(i).getBranchName());
        }
    }//method that prints the list of branches

    public void printListOfCustomersOfTheBranch(String branchName){
        int branchId = getBranchId(branchName);
        if(branchId==-1){
            System.out.println("There's no such branch");
        }else{
            branches.get(branchId).printListOfCustomers();
        }
    }//method that prints the list of customers of a chosen branch

    public void printListOfTransactionsOfTheCustomerOfTheBranch(String cName, String branchName){
        int branchId = getBranchId(branchName);
        if(branchId==-1){
            System.out.println("There's no such branch");
        }else{
            int customerId = branches.get(branchId).getCustomerId(cName);
            if(customerId==-1){
                System.out.println("There's no such a customer");
            }else{
                branches.get(branchId).getCustomers().get(customerId).printListOfTransactions();
            }
        }
    }//method that prints the list of transactions of a chosen customer of a chosen branch

    public int getBranchId(String name){
        for (int i = 0; i < branches.size(); i++){
            if(branches.get(i).getBranchName().equals(name)){
                return i;
            }
        }

        return -1;
    }
}
