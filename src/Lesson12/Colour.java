package Lesson12;

public class Colour {
	String[] �olourArr = { "Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Violet", "Azure", "Magenta",
			"Aquamarine" };
	int random = (int) (Math.random() * ((�olourArr.length - 1) + 1));

	String setRandomColour() {
		return �olourArr[random];
	}
}