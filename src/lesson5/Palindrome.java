package lesson5;

/*
 * Check cycle is whether the word palindrome.
 */

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String str = scan.nextLine().trim();
		scan.close();
		String[] strArr = str.split("");
		int counter = 0;
		for (int i = 0; i < strArr.length / 2; i++) {
			if (strArr[i].equals(strArr[strArr.length - i - 1])) {
			} else {
				counter++;
			}
		}
		if (counter == 0) {
			System.out.println("Word " + str + " is palindrome");
		} else {
			System.out.println("Word " + str + " is not palindrome");
		}
	}
}
