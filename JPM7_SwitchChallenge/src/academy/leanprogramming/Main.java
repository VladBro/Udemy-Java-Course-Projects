package academy.leanprogramming;

public class Main {

    public static void main(String[] args) {
        char ch = 'D';

        switch(ch){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("The " + ch + " is found");
                break;
            default:
                System.out.println("A, B, C, D or E aren't found");
                break;
        }
    }
}
