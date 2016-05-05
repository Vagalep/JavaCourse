package lesson3;

import java.util.Scanner;

public class GuessTheNumber {

	/*
	 * The computer thinks of an integer from 0 to 100. The player's task to guess it
	 * 5 attempts. for example, the desired number 53. Attempting ¹1, the user inputs
	 * 75. Draft program says - not true, my number is smaller. If the number is guessed -
	 * You WIn. after 5 unsuccessful attempts - GAME over
	 */

	public static void main(String[] args) {
		int random = (int) (Math.random() * 100);
		int tryCounter = 0;
		System.out.println("Access Denied. My number was: " + random);
		do {
			tryCounter++;
			System.out.print("Try #" + tryCounter + ": ");
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			if (a == random) {
				System.out.println("You Win");
				System.exit(0);
			} else if (a > random) {
				System.out.println("My number is less");
			} else if (a < random) {
				System.out.println("My number is more");
			}
		} while (tryCounter < 5);
		System.out.println("GAME OVER");
	}
}