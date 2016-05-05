package lesson5;

/*
 * Fill an array of type int of 10 elements with random numbers.
 */

public class RandomArray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 1000);
			arr[i] = random;
			System.out.print(arr[i] + " ");
		}
	}
}
