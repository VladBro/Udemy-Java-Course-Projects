package academy.leanprogramming;

public class Main {

    public static void main(String[] args) {
        String player = "Max";
        int score = 1700;
        displayHighScorePosition(player, calculateHighScorePosition(score));
        score = 1000;
        displayHighScorePosition(player, calculateHighScorePosition(score));
        score = 500;
        displayHighScorePosition(player, calculateHighScorePosition(score));
        score = 11;
        displayHighScorePosition(player, calculateHighScorePosition(score));
    }

    public static void displayHighScorePosition(String playerName, int tablePosition){
        System.out.println(playerName + " managed to get into the position " + tablePosition +
                " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore > 1000){
            return 1;
        }else if(playerScore > 500){
            return 2;
        }else if(playerScore > 100){
            return 3;
        }else{
            return 4;
        }
    }
}
