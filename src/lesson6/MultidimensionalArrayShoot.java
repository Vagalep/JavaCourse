package lesson6;

import java.util.Scanner;

public class MultidimensionalArrayShoot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int currentPositionX = 0;
		int currentPositionY = 0;
		boolean end = true;
		boolean medPos = true;
		boolean medSlot = false;
		boolean bombPos = true;
		boolean bullet = false;
		char[][] mass = new char[10][10];
		int helth = 60;
		int bulletX = 0;
		int bulletY = 0;
		int randomPlaceX = 1 + (int) (Math.random() * ((mass.length - 1) + 1));
		int randomPlaceY = 1 + (int) (Math.random() * ((mass.length - 1) + 1));
		int randomBobmPlaceX = 1 + (int) (Math.random() * ((mass.length - 1) + 1));
		int randomBobmPlaceY = 1 + (int) (Math.random() * ((mass.length - 1) + 1));
		int randomDamage = 1 + (int) (Math.random() * ((60 - 1) + 1));
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
			if (bullet == true) {
				bulletY = bulletY + 1;
			}
			for (int i = 0; i < mass.length; i++) {
				for (int j = 0; j < mass.length; j++) {
					mass[i][j] = '_';
					while (medPos == true) {
						if (currentPositionX != randomPlaceX || currentPositionY != randomPlaceY) {
							mass[randomPlaceX][randomPlaceY] = '+';
							break;
						} else {
							medSlot = true;
							medPos = false;
						}
					}
					while (bombPos == true) {
						if (currentPositionX != randomBobmPlaceX || currentPositionY != randomBobmPlaceY) {
							mass[randomBobmPlaceX][randomBobmPlaceY] = '*';
							break;
						} else {
							helth = helth - randomDamage;
							System.out.println("The bobm has hit you on: " + randomDamage);
							if (helth <= 0) {
								System.out.println("You are died. Game Over");
								end = false;
							}
							bombPos = false;
						}
					}
					if (bulletY==mass.length-1) bullet = false;
					if (bullet == true) mass[bulletX][bulletY] = '>';

					if (bulletX == randomBobmPlaceX && bulletY == randomBobmPlaceY) {
						bombPos = false;
						bullet = false;
					}
					mass[currentPositionX][currentPositionY] = '|';
					System.out.print(mass[i][j] + " ");
				}
				
				System.out.println("");
			}
			System.out.println("");
			System.out.print("Your helth is: " + helth);
			if (medSlot == false) {
				System.out.print("   Your don't have a medicine!");
			} else if (medSlot == true) {
				System.out.print(medicine == 40 ? "   Your have a big medicene!" : "   Your have a small medicene!");
			}
			String move = scan.nextLine();
			if (move.equals("d")) {
				if (currentPositionY < (mass.length - 1)) {
					currentPositionY = currentPositionY + 1;
				} else {
					System.out.println("You cann't go there");
				}
			} else if (move.equals("a")) {
				if (currentPositionY > 0) {
					currentPositionY = currentPositionY - 1;
				} else {
					System.out.println("You cann't go there");
				}
			} else if (move.equals("w")) {
				if (currentPositionX > 0) {
					currentPositionX = currentPositionX - 1;
				} else {
					System.out.println("You cann't go there");
				}
			} else if (move.equals("s")) {
				if (currentPositionX < (mass.length - 1)) {
					currentPositionX = currentPositionX + 1;
				} else {
					System.out.println("You cann't go there");
				}
			} else if (move.equals("1") && medSlot == true) {
				helth = helth + medicine;
				medSlot = false;
			} else if (move.equals("f")) {
				bullet = true;
				bulletX = currentPositionX;
				bulletY = currentPositionY;
			} else {
				System.out.println("You can press only \"a\", \"d\", \"w\", \"s\" and \"1\"");
			}
			if (currentPositionX == mass.length - 1 && currentPositionY == mass.length - 1) {
				System.out.println("Game Over");
				end = false;
			}
			scan.close();
		}
	}
}
