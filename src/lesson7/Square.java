package lesson7;

public class Square {
	String name = "Square";
	String colour = "";
	double area = 0;
	double perimeter = 0;
	double side = 0;

	void getInfo() {
		if (side > 0) {
			System.out.println("Name: " + name + "; Colour: " + colour);
			System.out.printf("Area: " + "%.3f%n",area);
			System.out.printf("Perimeter: " + "%.3f%n",perimeter);
			System.out.println("");
		} else {
			colour = "";
			area = 0;
			perimeter = 0;
			side = 0;
			System.err.println("Wrong value!");
		}
	}

	void setSide(double r) {
		side = r;
	}

	void setColour(String c) {
		colour = c;
	}

	double setArea() {
		area = side * side;
		return area;
	}

	double setPerimeter() {
		perimeter = side + side + side + side;
		return perimeter;
	}
}
