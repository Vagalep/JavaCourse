package lesson2;

import java.util.Scanner;

/*
 * Entering letters identify vowel or consonant it.
 */

public class VowelLetter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the letter: ");
		char a = scan.nextLine().charAt(0);
		if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
			System.out.print((a == 97 || a == 101 || a == 105 || a == 111 || a == 117 || a == 65 || a == 69 || a == 73
					|| a == 79 || a == 85) ? "Letter " + a + " is vowel" : "Letter " + a + " is consonant letter");
		} else {
			System.out.print("You not entered letter");
		}
	}
}
