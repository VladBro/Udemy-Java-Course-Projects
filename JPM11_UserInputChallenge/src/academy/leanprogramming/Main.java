package academy.leanprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int x;
        int i = 0;

        while(i<10){
            System.out.println("Enter number #"+ (i+1) +": ");
            if(sc.hasNextInt()){
                x = sc.nextInt();
                sc.nextLine();
                sum += x;
                System.out.println("You've inputted: "+ x +"; and the sum is: "+ sum);
                i++;
            }else{
                System.out.println("Invalid input");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
