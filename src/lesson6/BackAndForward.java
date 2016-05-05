package lesson6;

/*
 * Move the cursor in the array of 10 elements charms, D key to move forward A key back. Below 0 error, when they came to the end - Game Over.
 */

import java.util.Scanner;

public class BackAndForward {

	public static void main(String[] args) {
		char[] mass = new char[10];
		boolean end = true;
		Scanner scan = new Scanner(System.in);
		int currentPosition = 0;
		while (end == true) {
			for (int i = 0; i < mass.length; i++) {
				mass[i] = '_';
				mass[currentPosition] = '|';
				System.out.print(mass[i] + " ");
			}
			String move = scan.nextLine();
			if (move.equals("d")) {
				if (currentPosition < (mass.length - 1)) {
					currentPosition = currentPosition + 1;
				} else {
					System.out.println("Game Over");
					end = false;
				}
			} else if (move.equals("a")) {
				if (currentPosition > 0) {
					currentPosition = currentPosition - 1;
				} else {
					System.out.println("Íou cann't go there");
				}
			} else {
				System.out.println("You can press only \"a\" and \"d\"");
			}
		}
		scan.close();
	}
}