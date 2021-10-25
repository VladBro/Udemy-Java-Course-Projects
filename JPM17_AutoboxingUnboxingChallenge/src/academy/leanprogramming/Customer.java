package academy.leanprogramming;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double newT){
        transactions.add(newT);
    }

    public void printListOfTransactions(){
        for (int i = 0; i < transactions.size(); i++){
            System.out.println(transactions.get(i));
        }
    }
}
