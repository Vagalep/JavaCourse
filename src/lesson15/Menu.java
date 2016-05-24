package lesson15;

import java.util.Arrays;

public class Menu {

	public static void main(String[] args) {
		Figure[] figures = new Figure[10];
		Colour colour = new Colour();
		for (int i = 0; i < figures.length; i++) {
			System.out.println(Arrays.toString(figures));
			String c = colour.setRandomColour();
			int a = 1 + (int) (Math.random() * ((3 - 1) + 1));
			System.out.println(a);
			switch (a) {
			case 1:
				int r = 1 + (int) (Math.random() * ((2 - 1) + 1));
				figures[i] = new Figure("Your Circle", "1", r, 0, 0, 0, 0);
				for (int j = i+1; j < figures.length; j++) {
					if (figures[i].equals(figures[j])) {
						Figure copy = null;
						try {
							copy = (Figure) figures[i].clone();
							copy.name = "Clone of " + j + " circle";
							figures[i] = copy;
						} catch (CloneNotSupportedException e) {
							e.printStackTrace();
						}
					}
				}
				break;
			case 2:
				int s = 1 + (int) (Math.random() * ((10 - 1) + 1));
				figures[i] = new Figure("Your Square", c, 0, s, 0, 0, 0);
				for (int j = i+1; j < figures.length; j++) {
					if (figures[i].equals(figures[j])) {
						Figure copy = null;
						try {
							copy = (Figure) figures[i].clone();
							copy.name = "Clone of " + i + " square";
							figures[i] = copy;
						} catch (CloneNotSupportedException e) {
							e.printStackTrace();
						}
					}
				}
				break;
			case 3:
				int sideA = 1 + (int) (Math.random() * ((10 - 1) + 1));
				int sideB = 1 + (int) (Math.random() * ((10 - 1) + 1));
				int sideC = 1 + (int) (Math.random() * ((10 - 1) + 1));
				figures[i] = new Figure("Your Trianle", c, 0, 0, sideA, sideB, sideC);
				for (int j = i+1; j < figures.length; j++) {
					if (figures[i].equals(figures[j])) {
						Figure copy = null;
						try {
							copy = (Figure) figures[i].clone();
							copy.name = "Clone of " + i + " triangle";
							figures[i] = copy;
						} catch (CloneNotSupportedException e) {
							e.printStackTrace();
						}
					}
				}
				break;
			default:
				break;
			}
		}
		for (Figure f : figures) {
			if (f.radius != 0) {
				f.getInfoCircle();
			} else if (f.side != 0) {
				f.getInfoSquare();
			} else if (f.sideA != 0 && f.sideB != 0 && f.sideC != 0)
				f.getInfoTriangle();
		}
	}
}
