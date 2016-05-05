package lesson6;

/*
 * move the cursor in the array of 10 elements charms, D key to move forward A key back. Below 0 error, 
 * when they came to the end - Game Over. Kit which is denoted by "+" will appear randomly not on the
 * first and  the last portion of the path, the cursor is initially equal to 60 health, first aid kit restores 40.
 * Kit can be small or large with a probability of 50 to 50, 20, recovers a little more than 40.
 * Kit drops into the slot and can be used by pressing the "1" key.
 */

import java.util.Scanner;

public class BackAndForwardRandomMedicineSlot {

	public static void main(String[] args) {
		char[] mass = new char[10];
		boolean end = true;
		boolean medPos = true;
		boolean medSlot = false;
		Scanner scan = new Scanner(System.in);
		int currentPosition = 0;
		int helth = 60;
		int randomPlace = 1 + (int) (Math.random() * ((9 - 1) + 1));
		int randomMed = 1 + (int) (Math.random() * ((2 - 1) + 1));
		int medicine = 0;
		switch (randomMed) {
		case 1:
			medicine = 40;
			break;
		case 2:
			medicine = 20;
			break;
		default:
			break;
		}
		while (end == true) {
			for (int i = 0; i < mass.length; i++) {
				mass[i] = '_';
				while (medPos == true) {
					if (currentPosition != randomPlace) {
						mass[randomPlace] = '+';
						break;
					} else {
						medSlot = true;
						medPos = false;
					}
				}
				mass[currentPosition] = '|';
				System.out.print(mass[i] + " ");
			}
			System.out.print("     Your helth is: " + helth + "     ");
			if (medSlot == false) {
				System.out.print("Your don't have a medicine!");
			} else if (medSlot == true) {
				System.out.print(medicine == 40 ? "Your have a big medicene!" : "Your have a small medicene!");
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
					System.out.println("You cann't go there");
				}
			} else if (move.equals("1") && medSlot == true) {
				helth = helth + medicine;
				medSlot = false;
			} else {
				System.out.println("You can press only \"a\", \"d\" and \"1\"");
			}
		}
		scan.close();
	}
}