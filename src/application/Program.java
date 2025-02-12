package application;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Random rand = new Random();
		int drawnNumber = rand.nextInt(100) + 1;
		int attempts = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println(drawnNumber);

		System.out.println(welcomeMenu());
		System.out.print("Enter your choice: ");
		int difficulty = sc.nextInt();

		switch (difficulty) {
		case 1:
			System.out.println();
			System.out.println("Great! You have selected the Easy difficulty level.");
			System.out.println("Let's start the game!");
			System.out.println();

			for (int i = 1; i <= 10; i++) {
				System.out.print("Enter your guess: ");
				int guess = sc.nextInt();

				attempts++;

				if (guess == drawnNumber) {
					System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
					break;
				} else if (guess > drawnNumber) {
					System.out.println("Incorrect! The number is less than " + guess);
					System.out.println();
				} else {
					System.out.println("Incorrect! The number is greater than " + guess);
					System.out.println();
				}

				if (i == 10) {
					System.out.println("Number of attempts exceeded. Try again!");
				}
			}
			break;
		case 2:
			System.out.println();
			System.out.println("Great! You have selected the Medium difficulty level.");
			System.out.println("Let's start the game!");
			System.out.println();

			for (int i = 1; i <= 5; i++) {
				System.out.print("Enter your guess: ");
				int guess = sc.nextInt();

				attempts++;

				if (guess == drawnNumber) {
					System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
					break;
				} else if (guess > drawnNumber) {
					System.out.println("Incorrect! The number is less than " + guess);
					System.out.println();
				} else {
					System.out.println("Incorrect! The number is greater than " + guess);
					System.out.println();
				}

				if (i == 5) {
					System.out.println("Number of attempts exceeded. Try again!");
				}
			}
			break;
		case 3:
			System.out.println();
			System.out.println("Great! You have selected the Hard difficulty level.");
			System.out.println("Let's start the game!");
			System.out.println();

			for (int i = 1; i <= 3; i++) {
				System.out.print("Enter your guess: ");
				int guess = sc.nextInt();

				attempts++;

				if (guess == drawnNumber) {
					System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
					break;
				} else if (guess > drawnNumber) {
					System.out.println("Incorrect! The number is less than " + guess);
					System.out.println();
				} else {
					System.out.println("Incorrect! The number is greater than " + guess);
					System.out.println();
				}

				if (i == 3) {
					System.out.println("Number of attempts exceeded. Try again!");
				}
			}
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
