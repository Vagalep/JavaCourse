package Lesson12;

public class Colour {
	String[] ñolourArr = { "Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Violet", "Azure", "Magenta",
			"Aquamarine" };
	int random = (int) (Math.random() * ((ñolourArr.length - 1) + 1));

	String setRandomColour() {
		return ñolourArr[random];
	}
}