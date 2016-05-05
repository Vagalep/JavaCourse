package lesson3;

import java.util.Scanner;

/*
 * With the keyboard introduces an arbitrary integer. Count the number of digits in it, 
 * the sum of digits, how many even numbers as odd numbers.
 */

public class RandomNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = scan.nextInt();
		String b = "" + a;
		int sum = 0;
		int even = 0;
		int odd = 0;
		System.out.println("Numerals in your number: " + b.length());
		while (a != 0) {
			sum = sum + (a % 10);
			a = a / 10;
		}
		System.out.println("Summ of this numerals: " + sum);
		for (int i = 0; i < b.length(); i++) {
			int x = b.charAt(i);
			if (x % 2 == 0) {
				++even;
			} else {
				++odd;
			}
		}
		System.out.println("Even numerals: " + even);
		System.out.println("Odd numerals: " + odd);
	}
}
