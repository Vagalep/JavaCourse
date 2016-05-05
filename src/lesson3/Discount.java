package lesson3;

import java.util.Scanner;

/*
 * Keyboard input successful bid price if the amount of [0, 300) - the discount is 0%
 * [300; 400) - 3% discount, [400; 500) - 5% discount, [500; 500) - 7% discount.
 * Print the offer, a total discount of 2 currencies.
 */

public class Discount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		double a = scan.nextDouble();
		int discProgNum = 0;
		if (a < 0) {
			discProgNum = 1;
		} else if (a <= 300) {
			discProgNum = 2;
		} else if (a <= 400) {
			discProgNum = 3;
		} else if (a < 500) {
			discProgNum = 4;
		}
		switch (discProgNum) {
		case 1:
			System.out.print("Summ can't be negative");
			break;
		case 2:
			System.out.print("Your discount - 0% Total sum with discount: " + String.format("%.2f", a) + " UAH or "
					+ (String.format("%.2f", (a / 26.5))) + " USD");
			break;
		case 3:
			System.out.print("Your discount - 3% Total sum with discount: " + String.format("%.2f", (a - (a * 0.03)))
					+ " UAH or " + (String.format("%.2f", ((a - (a * 0.03)) / 26.5))) + " USD");
			break;
		case 4:
			System.out.print("Your discount - 5% Total sum with discount: " + String.format("%.2f", (a - (a * 0.05)))
					+ " UAH or " + (String.format("%.2f", ((a - (a * 0.05)) / 26.5))) + " USD");
			break;
		default:
			System.out.print("Your discount - 7% Total sum with discount: " + String.format("%.2f", (a - (a * 0.07)))
					+ " UAH or " + (String.format("%.2f", ((a - (a * 0.07)) / 26.5))) + " USD");
			break;
		}
	}
}
