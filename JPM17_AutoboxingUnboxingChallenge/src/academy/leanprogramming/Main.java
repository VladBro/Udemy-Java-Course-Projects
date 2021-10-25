package academy.leanprogramming;

public class Main {

    public static void main(String[] args) {
        Bank myBank = new Bank("Gaybank");
        myBank.addBranch("WestBranch");
        myBank.addBranch("EastBranch");
        myBank.addBranch("SouthBranch");

        myBank.getBranchId("WestBranch");
        myBank.getBranchId("eastbranch");
        myBank.getBranchId("SouthBranch");
        myBank.getBranchId("NorthBranch");

        myBank.printListOfBranches();

        myBank.addCustomerToBranch("Gay Tony", "WestBranch");
        myBank.addCustomerToBranch("Big Gay Al", "WestBranch");
        myBank.addCustomerToBranch("Gay Tony", "WestBranch");

        myBank.printListOfCustomersOfTheBranch("WestBranch");

        myBank.addTransactionToCustomerOfTheBranch(2.13, "Gay Tony", "WestBranch");
        myBank.addTransactionToCustomerOfTheBranch(-14.88, "Gay Tony", "WestBranch");
        myBank.addTransactionToCustomerOfTheBranch(2.28, "Gay Tony", "WestBranch");

        myBank.printListOfTransactionsOfTheCustomerOfTheBranch("Gay Tony", "WestBranch");
    }
}
