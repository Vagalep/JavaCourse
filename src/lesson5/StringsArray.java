package lesson5;

/*
 * to create an array of strings, length and elements are entered from the keyboard.
 */

import java.util.Scanner;

public class StringsArray {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array length: ");
		int length = scan.nextInt();
		for (int i = 0; i < length; i++) {
			System.out.print("Enter " + (i + 1) + " string: ");
			String s = scan.next().trim() + " ";
			sb.append(s);
		}
		scan.close();
		System.out.println("Your string together is: " + sb);
	}
}
