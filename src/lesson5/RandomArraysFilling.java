package lesson5;

/*
 * Create 3 arrays to 5 elements of type byte, shot, int fill them in a random loop elements based on the fact,
 * that for 1 iteration of a random number may get only 1 array.
 */

import java.util.Arrays;

public class RandomArraysFilling {

	public static void main(String[] args) {
		byte[] by = new byte[5];
		short[] sh = new short[5];
		int[] in = new int[5];
		boolean end = true;
		int random;
		while (end) {
			if (in[4] == 0) {
				random = 1 + (int) (Math.random() * ((2147483647 - 1) + 1));
				System.out.println(random);
			} else if (sh[4] == 0) {
				random = 1 + (int) (Math.random() * ((32767 - 1) + 1));
				System.out.println(random);
			} else if (by[4] == 0) {
				random = 1 + (int) (Math.random() * ((127 - 1) + 1));
				System.out.println(random);
			} else {
				end = false;
				random = 0;
				break;
			}
			if (random <= 127 && by[4] == 0) {
				for (int i = 0; i < by.length; i++) {
					if (by[i] == 0) {
						by[i] = (byte) random;
						break;
					}
				}
			} else if (random <= 32767 && sh[4] == 0) {
				for (int i = 0; i < sh.length; i++) {
					if (sh[i] == 0) {
						sh[i] = (short) random;
						break;
					}
				}
			} else {
				for (int i = 0; i < in.length; i++) {
					if (in[i] == 0) {
						in[i] = random;
						break;
					}
				}
			}
			System.out.println(Arrays.toString(in));
			System.out.println(Arrays.toString(sh));
			System.out.println(Arrays.toString(by));
		}
	}
}