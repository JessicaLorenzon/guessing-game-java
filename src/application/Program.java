package application;

import java.util.Scanner;

import entities.Game;

public class Program {

	public static void main(String[] args) {

		Game game = new Game();

		Scanner sc = new Scanner(System.in);

		System.out.println(welcomeMenu());
		
		System.out.print("Enter your choice: ");
		int difficulty = sc.nextInt();

		switch (difficulty) {
		case 1:
			game.play("Easy", 10);
			break;
		case 2:
			game.play("Medium", 5);
			break;
		case 3:
			game.play("Hard", 3);
			break;
		default:
			System.out.println("Action not recognized. Try again!");
			System.out.println();
		}

		sc.close();
	}

	public static String welcomeMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("Welcome to the Number Guessing Game!\n");
		sb.append("I'm thinking of a number between 1 and 100.\n");
		sb.append("\n");
		sb.append("Please select the difficulty level\n");
		sb.append("1. Easy (10 chances)\n");
		sb.append("2. Medium (5 chances)\n");
		sb.append("3. Hard (3 chances)\n");

		return sb.toString();
	}

}
