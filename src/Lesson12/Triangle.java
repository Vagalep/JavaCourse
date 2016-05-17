package Lesson12;

public class Triangle extends Figure {

	double sideA = 0;
	double sideB = 0;
	double sideC = 0;
	int angle = 0;

	Triangle(String name, String colour, double sideA, double sideB, double sideC) {
		super(name, colour);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		setArea();
		setPerimeter();
	}

	Triangle(String name, String colour, double sideA, double sideB, int angle) {
		super(name, colour);
		this.sideA = sideA;
		this.sideB = sideB;
		this.angle = angle;
		setArea();
		setPerimeter();
	}

	void getInfo() {
		if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB && angle == 0) {
			System.out.println("Name: " + name + "; Colour: " + colour);
			System.out.printf("Area: " + "%.3f%n", area);
			System.out.printf("Perimeter: " + "%.3f%n", perimeter);
			System.out.println("");
		} else if (angle > 0 && angle < 180) {
			System.out.println("Name: " + name + "; Colour: " + colour);
			System.out.printf("Area: " + "%.3f%n", area);
			System.out.printf("Perimeter: " + "%.3f%n", perimeter);
			printThirdSide();
			System.out.println("");
		} else {
			colour = "";
			area = 0;
			perimeter = 0;
			sideA = 0;
			sideB = 0;
			sideC = 0;
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
	void printThirdSide() {
		System.out.printf("Third side: " + "%.3f%n", sideC);
	}
	

	void setArea() {
		if (this.angle == 0) {
			double p = (sideA + sideB + sideC) / 2;
			area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
		} else {
			double radians = Math.toRadians(angle);
			area = 0.5 * sideA * sideA * Math.sin(radians);
		}
	}

	void setPerimeter() {
		if (this.angle == 0) {
			perimeter = sideA + sideB + sideC;
		} else {
			double radians = Math.toRadians(angle);
			sideC = Math.sqrt(Math.pow(sideA, 2) * Math.pow(sideB, 2) - (2 * sideA * sideB * Math.cos(radians)));
			perimeter = sideA + sideB + sideC;
		}
	}
}
