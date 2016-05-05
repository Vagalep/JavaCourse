package lesson4;

import java.util.Scanner;

/*
 * Enter 2 lines to determine which is longer in some more words in a more letters "a"
 */

public class RandomString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String str1 = scan.nextLine().trim();
		System.out.print("Enter second string: ");
		String str2 = scan.nextLine().trim();
		scan.close();
		if (str1.length() == str2.length()) {
			System.out.println("Åhe first and second string are equal");
		} else if (str1.length() > str2.length()) {
			System.out.println("First string longer");
		} else {
			System.out.println("Second string longer");
		}
		/*
		 * int wordCounter1 = str1.trim().split(" ").length; 
		 * int wordCounter2 = str2.trim().split(" ").length; 
		 * System.out.println("Words in first string: " + wordCounter1); 
		 * System.out.println("Words in first string: " + wordCounter2);
		 */
		int firstCount = 0;
		int secondCount = 0;
		int aCounter1 = 0;
		int aCounter2 = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == 65 || str1.charAt(i) == 97) {
				aCounter1++;
			}
			if (str1.substring(i, i + 1).equals(" ") == true) {
				firstCount++;
			}
		}
		for (int i = 0; i < str2.length(); i++) {
			if (str2.charAt(i) == 65 || str2.charAt(i) == 97) {
				aCounter2++;
			}
			if (str2.substring(i, i + 1).equals(" ") == true) {
				secondCount++;
			}
		}
		System.out.println("Words in first string: " + (firstCount + 1));
		System.out.println("Words in first string: " + (secondCount + 1));
		System.out.println("Letters \"a\" in first string: " + aCounter1);
		System.out.println("Letters \"a\" in second string: " + aCounter2);
	}
}
