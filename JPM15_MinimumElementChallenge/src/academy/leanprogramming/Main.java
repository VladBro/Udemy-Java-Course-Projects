package academy.leanprogramming;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    // "It's a good idea to keep all fields private to encapsulate the data"

    public static void main(String[] args) {
        System.out.println("The program finds the minimum element of the array" +
                "type in the length of your array: ");
        int count = scan.nextInt();
        scan.nextLine();

        System.out.println("Type in the elements of the array: ");
        int[] yourArr = readIntegers(count);

        System.out.println("The minimum element in your array is: " + findMin(yourArr));
    }

    public static int[] readIntegers(int num){
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = scan.nextInt();
            scan.nextLine();
        }
        return arr;
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
