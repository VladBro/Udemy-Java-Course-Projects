package academy.leanprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(94, 20));
        System.out.println(getDurationString(0,0));
        System.out.println(getDurationString(22220));
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid value";
        } else {
            return minutes/60 + "h " + minutes%60 + "m " + seconds + "s";
        }
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Invalid value";
        } else {
            int minutes = seconds/60;
            seconds %= 60;

            return getDurationString(minutes, seconds);
        }
    }
}
