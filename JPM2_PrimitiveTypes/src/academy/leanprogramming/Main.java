package academy.leanprogramming;

public class Main {

    public static void main(String[] args) {
	    byte firstByte = 12;
	    short firstShort = 22222;
	    int firstInt = 5155555;
	    long firstLong = 50000L + 10L * (firstByte + firstShort + firstInt);

        System.out.println(firstLong);
    }
}
