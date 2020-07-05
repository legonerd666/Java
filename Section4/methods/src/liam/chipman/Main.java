package liam.chipman;

public class Main {

    public static void main(String[] args) {
//
//        int high_score = calculateScore(true, 10000, 8, 200);
//        System.out.println("Your Final score was: " + high_score);
//
//        high_score = calculateScore(true, 800, 5, 100);
//        System.out.println("Your Final score was: " + high_score);
        displayHighScorePosition("Legonerd666", calculateHighscorePosition(1500));
        displayHighScorePosition("Legonerd666", calculateHighscorePosition(900));
        displayHighScorePosition("Legonerd666", calculateHighscorePosition(400));
        displayHighScorePosition("Legonerd666", calculateHighscorePosition(50));

    }

    public static int calculateScore(boolean game_over, int score, int level_completed, int bonus) {

        if (game_over) {
            int final_score = score + (level_completed * bonus);
            final_score += 1000;
            return  final_score;
        }

        return -1;

    }

    public static void displayHighScorePosition(String player_name, byte highscore_position) {

        System.out.println(player_name + " got the position: " + highscore_position);

    }

    public static byte calculateHighscorePosition(int high_score) {
//        if (high_score >= 1000) {
//            return 1;
//        }
//        else if (high_score >= 500) {
//            return 2;
//        }
//        else if (high_score >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4;
        if (high_score >= 1000) {
            position = 1;
        }
        else if (high_score >= 500) {
            position = 2;
        }
        else if (high_score >= 100) {
            position = 3;
        }
        return (byte) position;
    }
}
