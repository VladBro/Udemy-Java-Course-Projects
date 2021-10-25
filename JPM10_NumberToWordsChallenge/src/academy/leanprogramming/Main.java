package academy.leanprogramming;

public class Main {

    public static void main(String[] args) {
        numberToWords(1500);
    }

    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }
        int count = getDigitCount(number);
        number = reverse(number);
        int digit = 0;

        while(count>0){

            digit = number%10;
            number /= 10;
            switch(digit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
                    break;
            }
            count--;
        }
    }

    public static int reverse(int number){
        int revNumber = 0;
        if(number<0){
            number = -number;
            while(number>0){
                revNumber*=10;
                revNumber += number%10;
                number /= 10;
            }
            return -revNumber;
        }else{
            while(number>0){
                revNumber*=10;
                revNumber += number%10;
                number /= 10;
            }
            return revNumber;
        }
    }

    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        int count = 0;
        do{
            number /= 10;
            count++;
        }while(number>0);
        return count;
    }
}
