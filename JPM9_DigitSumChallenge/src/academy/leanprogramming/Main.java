package academy.leanprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(9));
    }

    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }

        int sum = 0;
        while(!(number%10 == 0)){
            sum += number%10;
            number /= 10;
        }
        return sum;
    }
}
