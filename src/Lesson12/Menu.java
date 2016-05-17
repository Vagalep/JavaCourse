package Lesson12;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		boolean end = false;
		Colour colour = new Colour();
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
					System.out.print("Enter radius of Circle: ");
					double radius = scan.nextDouble();
					Circle circle = new Circle("Your Circle", colour.setRandomColour(), radius);
					circle.getInfo();
					break;
				case 50:
					System.out.print("Enter side of Square: ");
					double side = scan.nextDouble();
					Square square = new Square("Your Square", colour.setRandomColour(), side);
					square.getInfo();
					break;
				case 51:
					System.out.println("If you want to calculate the three press - \"1\"");
					System.out.print("If you want to calculate on the two sides and the angle between them press - \"2\"");
					int  method = scan.nextLine().codePointAt(0);
					if (method==49){
						System.out.print("Enter first side of Triangle: ");
						double sideA = scan.nextDouble();
						System.out.print("Enter secont side of Triangle: ");
						double sideB = scan.nextDouble();
						System.out.print("Enter thirt side of Triangle: ");
						double sideC = scan.nextDouble();
						Triangle triangle = new Triangle("Your Square", colour.setRandomColour(), sideA, sideB, sideC);
						triangle.getInfo();
						break;						
					}else if (method==50){
						System.out.print("Enter first side of Triangle: ");
						double sideA = scan.nextDouble();
						System.out.print("Enter second side of Triangle: ");
						double sideB = scan.nextDouble();
						System.out.print("Enter angle between sides: ");
						int angleAB = scan.nextInt();
						Triangle triangle = new Triangle("Your Square", colour.setRandomColour(), sideA, sideB, angleAB);
						triangle.getInfo();
						break;
					}else{
						System.err.println("Wrong value!");
					}
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
