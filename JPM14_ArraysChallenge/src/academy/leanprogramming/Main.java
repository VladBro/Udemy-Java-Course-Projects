package academy.leanprogramming;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] try1 = getIntegers(6);
        printArray(try1);
        try1 = sortArray(try1);
        printArray(try1);
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter "+ number +" integer elements");
        int[] values = new int[number];

        for (int i = 0; i < number; i++){
            System.out.print("Enter element number "+ number+1);
            values[i] = scan.nextInt();
            scan.nextLine();
        }

        return values;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] sortArray(int[] arrx){
        int[] arr = Arrays.copyOf(arrx, arrx.length);
        if(arr.length < 2){
            return arr;
        }
        int save;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i]<arr[j]){
                    save = arr[i];
                    arr[i] = arr[j];
                    arr[j] = save;
                }
            }
        }
        return arr;
    }
}

