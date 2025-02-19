package application;

import java.util.Scanner;

import entities.Game;
import service.LevelEasy;
import service.LevelHard;
import service.LevelMedium;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(welcomeMenu());

		System.out.print("Enter your choice: ");
		int difficulty = sc.nextInt();

		Game game = null;

		switch (difficulty) {
		case 1:
			game = new Game(new LevelEasy());
			break;
		case 2:
			game = new Game(new LevelMedium());
			break;
		case 3:
			game = new Game(new LevelHard());
			break;
		default:
			System.out.println("Action not recognized. Try again!");
			System.out.println();
		}
		game.play();
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
