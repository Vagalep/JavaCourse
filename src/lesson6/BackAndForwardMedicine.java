package lesson6;

/*
 * move the cursor in the array of 10 elements charms, D key to move forward A key back. Below 0 error, 
 * when they came to the end - Game Over. Kit which is denoted by "+" will appear randomly not on the
 * first and  the last portion of the path, the cursor is initially equal to 60 health, first aid kit restores 40.
 */

import java.util.Scanner;

public class BackAndForwardMedicine {

	public static void main(String[] args) {
		char[] mass = new char[10];
		boolean end = true;
		boolean medPos = true;
		Scanner scan = new Scanner(System.in);
		int currentPosition = 0;
		int helth = 60;
		int medicine = 40;
		int randomPlace = 1 + (int) (Math.random() * ((9 - 1) + 1));
		while (end == true) {
			for (int i = 0; i < mass.length; i++) {
				mass[i] = '_';
				while (medPos == true) {
					if (currentPosition != randomPlace) {
						mass[randomPlace] = '+';
						break;
					} else {
						helth = helth + medicine;
						medPos = false;
					}
				}
				mass[currentPosition] = '|';
				System.out.print(mass[i] + " ");
			}
			System.out.print("Your helth is: " + helth);
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
					System.out.println("You cann't go there");
				}
			} else {
				System.out.println("You can press only \"a\" and \"d\"");
			}
		}
		scan.close();
	}
}