/*
 * @Author Kamlendra pandey
 */


import java.util.Random;
import java.util.Scanner;

public class StonePaperGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int com_choice = r.nextInt(3) + 1;
		int no_choices = 0;
		int t_chances = 2;
		int p_point = 0;
		int c_point = 0;

		while (no_choices <= t_chances) {
			System.out.println("Enter Reaspectively for\n ROCK as 1\n PAPER as 2\n SCISSOR as 3\n");
			int user_input = sc.nextInt();

			if (user_input == com_choice) {
				System.out.println("no additon to the score board due to TIE in the result");
			} else if (user_input >= 1 && user_input <= 3) {
				// here, computers input is 3
				if (user_input == 1 && com_choice == 3) {
					System.out.println("Congrats you have won this Round");
					p_point = p_point + 1;
					System.out.println("your score is " + p_point + "Computer Score is " + c_point);
				} else if (user_input == 2 && com_choice == 3) {
					System.out.println("BAD LUCK! you have LOST");
					c_point = c_point + 1;
					System.out.println("your score is " + p_point + "Computer Score is " + c_point);
				}
				// here, computers input is 2
				if (user_input == 1 && com_choice == 2) {
					System.out.println("BAD LUCK! you have LOST");
					c_point = c_point + 1;
					System.out.println("your score is " + p_point + "Computer Score is " + c_point);
				} else if (user_input == 3 && com_choice == 2) {
					System.out.println("Congrats you have won this Round");
					p_point = p_point + 1;
					System.out.println("your score is " + p_point + "Computer Score is " + c_point);
				}
				// here, computers input is 1
				if (user_input == 2 && com_choice == 1) {
					System.out.println("Congrats you have won this Round");
					p_point = p_point + 1;
					System.out.println("your score is " + p_point + "Computer Score is " + c_point);
				} else if (user_input == 3 && com_choice == 1) {
					System.out.println("BAD LUCK! you have LOST");
					c_point = c_point + 1;
					System.out.println("your score is " + p_point + "Computer Score is " + c_point);
				}
			} else {
				System.out.println("Please Enter a Right Input for the GAME\n");
			}
			no_choices++;

		}
		System.out.println("Game over!!\n\n");
		System.out.println("Scorecard :");

		if (p_point > c_point) {
			System.out.println("you have won this game");
			System.out.println("Your final score is " + p_point + "  Computers final score is " + c_point);
		} else if (p_point < c_point) {
			System.out.println("you have lost this game");
			System.out.println("Your final score is " + p_point + "  Computers final score is " + c_point);
		} else if (c_point == p_point) {
			System.out.println("GAAME has been TIED due to equal numbers of gave Won");
			System.out.println("Your final score is " + p_point + "  Computers final score is " + c_point);
		}
		sc.close();
	}

}