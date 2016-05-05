package lesson4;

/*
 * Generate a string of words to the amount of 5 to 10, in each word from 5 to 10, 
 * any of random characters of the Latin alphabet
 */

public class StringComparison {

	public static void main(String[] args) {
		int randomString = 5 + (int) (Math.random() * ((10 - 5) + 1));
		StringBuilder sb = new StringBuilder();
		String rand = "";
		for (int i = 1; i <= randomString; i++) {
			sb.setLength(0);
			int randomWord = 5 + (int) (Math.random() * ((10 - 5) + 1));
			for (int j = 1; j <= randomWord; j++) {
				int randomSumbol = 90 + (int) (Math.random() * ((65 - 90) + 1));
				sb.append((char) randomSumbol);
			}
			rand = rand + " " + sb;
		}
		System.out.println(rand.trim());
	}
}
