package academy.leanprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public class Dumpling {
        private String name;
        private String wheatType;
        private String meatType;
        private double price;

        public Dumpling(String name, String wheatType, String meatType, double price) {
            this.name = name;
            this.wheatType = wheatType;
            this.meatType = meatType;
            this.price = price;
        }


    }

    public class VeganDumpling extends Dumpling {

    }
}
