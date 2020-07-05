package liam.chipman;

public class Main {

    public static void main(String[] args) {

	    boolean game_over = true;
	    int score = 5000;
	    int level_complete = 5;
	    int bonus = 100;

//	    if(score == 5000) {
//
//			System.out.println("Your score was 5000");
//			System.out.println("This was executed");
//
//		}
//
//	    else if ((score < 5000) && (score >= 4000)){
//			System.out.println("You got a high score but not the max");
//		}
//
//	    else {
//			System.out.println("your score was low");
//		}

		if (game_over) {

			int final_score = score + (level_complete * bonus);
			System.out.println("Your final score was:" + final_score);

		}

		score = 10000;
		level_complete = 8;
		bonus = 200;

		if (game_over) {
			int final_score = score + (level_complete * bonus);
			System.out.println("Your final score was:" + final_score);
		}

    }
}
