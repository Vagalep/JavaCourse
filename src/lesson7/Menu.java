package lesson7;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		boolean end = false;
		while (!end) {
			System.out.println("Press \"1\" - for work with Circle");
			System.out.println("Press \"2\" - for work with Square");
			System.out.println("Press \"3\" - for work with Triangle");
			System.out.println("Press \"4\" - for Exit");
			Scanner scan = new Scanner(System.in);
			int a = scan.nextLine().codePointAt(0);
			if (a == 49 || a == 50 || a == 51 || a == 52) {
				switch (a) {
				case 49:
					lesson7.Ñircle circle = new lesson7.Ñircle();
					System.out.print("Enter radius of Circle: ");
					double valueC = scan.nextDouble();
					circle.setColour(new lesson7.Colour().setRandomColour());
					circle.setRadius(valueC);
					circle.setArea();
					circle.setPerimeter();
					circle.getInfo();
					break;
				case 50:
					lesson7.Square square = new lesson7.Square();
					System.out.print("Enter side of Square: ");
					double valueS = scan.nextDouble();
					square.setColour(new lesson7.Colour().setRandomColour());
					square.setSide(valueS);
					square.setArea();
					square.setPerimeter();
					square.getInfo();
					break;
				case 51:
					lesson7.Triangle triangle = new lesson7.Triangle();
					System.out.print("Enter the first side of Triangle: ");
					double valueSideA = scan.nextDouble();
					System.out.print("Enter the second side of Triangle: ");
					double valueSideB = scan.nextDouble();
					System.out.print("Enter the third side of Triangle: ");
					double valueSideC = scan.nextDouble();
					triangle.setColour(new lesson7.Colour().setRandomColour());
					triangle.setSides(valueSideA, valueSideB, valueSideC);
					triangle.setArea();
					triangle.setPerimeter();
					triangle.getInfo();
					break;
				case 52:
					scan.close();
					end = true;
					break;
				default:
					break;
				}
			} else {
				System.err.println("You can press only 1-4 buttons");
			}
		}
	}
}
