package lesson15;

public class Colour {
	String[] �olourArr = { "Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Violet", "Azure", "Magenta",
			"Aquamarine" };

	String setRandomColour() {
		int random = (int) (Math.random() * ((�olourArr.length - 1) + 1));
		return �olourArr[random];
	}
}