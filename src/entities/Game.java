package entities;

import java.util.Random;
import java.util.Scanner;

import service.Level;

public class Game {

	private Level level;

	public Game(Level level) {
		this.level = level;
	}

	public void play() {

		Random rand = new Random();
		int drawnNumber = rand.nextInt(100) + 1;
		int attemptsCount = 0;

		System.out.println(drawnNumber);
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("Great! You have selected the " + level.getTextDifficulty() + " difficulty level.");
		System.out.println("Let's start the game!");
		System.out.println();

		for (int i = 1; i <= level.getNumberAttempts(); i++) {

			System.out.print("Enter your guess: ");
			int guess = sc.nextInt();

			attemptsCount++;

			if (guess == drawnNumber) {
				System.out
						.println("Congratulations! You guessed the correct number in " + attemptsCount + " attempts.");
				break;
			} else if (guess > drawnNumber) {
				System.out.println("Incorrect! The number is less than " + guess);
				System.out.println();
			} else {
				System.out.println("Incorrect! The number is greater than " + guess);
				System.out.println();
			}

			if (i == level.getNumberAttempts()) {
				System.out.println("Number of attempts exceeded. Try again!");
			}
		}
		sc.close();
	}
}
