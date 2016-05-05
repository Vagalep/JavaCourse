package lesson2;

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
		if (a < 0) {
			System.out.print("Amount must be greater than 0");
		} else {
			System.out.println(a <= 300
					? "Your discount - 0% Total sum with discount: " + a + " UAH or "
							+ (String.format("%.2f", (a / 26.5))) + " USD"
					: (a <= 400
							? "Your discount - 3% Total sum with discount: " + (a - (a * 0.03)) + " UAH or "
									+ (String.format("%.2f", ((a - (a * 0.03)) / 26.5))) + " USD"
							: (a < 500
									? "Your discount - 5% Total sum with discount: " + (a - (a * 0.05)) + " UAH or "
											+ (String.format("%.2f", ((a - (a * 0.05)) / 26.5))) + " USD"
									: "Your discount - 7% Total sum with discount: " + (a - (a * 0.07)) + " UAH or "
											+ (String.format("%.2f", ((a - (a * 0.07)) / 26.5))) + " USD")));
			
			
		}
	}
}
