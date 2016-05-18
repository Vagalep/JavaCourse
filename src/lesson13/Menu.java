package lesson13;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Figure[] figures = new Figure[10];
		Colour colour = new Colour();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < figures.length; i++) {
			String c = colour.setRandomColour();
			System.out.println("Press \"1\" - for create Circle");
			System.out.println("Press \"2\" - for create Square");
			System.out.println("Press \"3\" - for create Triangle");
			int a = scan.nextLine().codePointAt(0);
			if (a == 49 || a == 50 || a == 51) {
				switch (a) {
				case 49:
					figures[i] = new Circle(c, 3);
					break;
				case 50:
					figures[i] = new Square(c, 5);
					break;
				case 51:
					figures[i] = new Triangle(c, 3, 4, 5);

					break;
				default:
					break;
				}
			} else {
				System.err.println("You can press only 1-3 buttons");
			}
		}
		scan.close();
		for (Figure f : figures) {
			f.getInfo();
		}
	}
}
