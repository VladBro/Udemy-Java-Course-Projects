package academy.leanprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] test1 = {13, 4, 5, 3, 22, 83 ,0};
        System.out.println(Arrays.toString(test1));
        reverse(test1);
        System.out.println(Arrays.toString(test1));
        reverse2(test1);
        System.out.println(Arrays.toString(test1));
    }

    public static void reverse(int[] arr){
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr1[arr1.length-1-i];
        }
    }

    public static void reverse2(int[] arr){
        int maxIndex = arr.length - 1;
        int halfway = arr.length / 2;
        int save;
        for(int i = 0; i < halfway; i++){
            save = arr[i];
            arr[i] = arr[maxIndex - i];
            arr[maxIndex - i] = save;
        }
    }
}
