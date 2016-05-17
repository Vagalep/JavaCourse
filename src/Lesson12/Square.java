package Lesson12;

public class Square extends Figure {

	private double side;

	Square(String name, String colour, double side) {
		super(name, colour);
		this.side = side;
		setArea();
		setPerimeter();
	}

	void getInfo() {
		if (side > 0) {
			super.getInfo();
			System.out.println("");
		} else {
			colour = "";
			area = 0;
			perimeter = 0;
			side = 0;
			System.err.println("Wrong value!");
			System.out.println("");
		}
	}

	void printPerimeter() {
		System.out.printf("Perimeter: " + "%.3f%n", perimeter);
		;
	}

	void printArea() {
		System.out.printf("Area: " + "%.3f%n", area);
	}

	void setArea() {
		area = side * side;
	}

	void setPerimeter() {
		perimeter = side + side + side + side;
	}
}
