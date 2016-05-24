package lesson15;

public class Colour {
	String[] ñolourArr = { "Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Violet", "Azure", "Magenta",
			"Aquamarine" };

	String setRandomColour() {
		int random = (int) (Math.random() * ((ñolourArr.length - 1) + 1));
		return ñolourArr[random];
	}
}