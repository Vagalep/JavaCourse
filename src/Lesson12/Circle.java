package Lesson12;

public class Circle extends Figure {
	double radius;

	Circle(String name, String colour, double radius) {
		super(name, colour);
		this.radius = radius;
		setArea();
		setPerimeter();
	}

	void getInfo() {
		if (radius > 0) {
			super.getInfo();
			System.out.println("");
		} else {
			colour = "";
			area = 0;
			perimeter = 0;
			radius = 0;
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
		area = Math.PI * Math.pow(radius, 2);
	}

	void setPerimeter() {
		perimeter = Math.PI * radius * 2;
	}

}
