package academy.leanprogramming;

public class Main {

    public static void main(String[] args) {
        double x1 = 20.0;
        double x2 = 80.0;
        double newNum = (x1 + x2) * 100.0;
        double remainder = newNum % 40.0;
        System.out.println(remainder);
        boolean gotRem = (remainder == 0)? true : false;
        System.out.println(gotRem);
        if(!gotRem){
            System.out.println("Got a remainder");
        }
    }
}
