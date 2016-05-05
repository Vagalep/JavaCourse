package lesson7;

public class Ñircle {
	String name = "Ñircle";
	String colour = "";
	double area = 0;
	double perimeter = 0;
	double radius = 0;

	void getInfo() {
		if (radius > 0) {
			System.out.println("Name: " + name + "; Colour: " + colour);
			System.out.printf("Area: " + "%.3f%n",area);
			System.out.printf("Perimeter: " + "%.3f%n",perimeter);
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

	void setRadius(double r) {
		radius = r;
	}

	void setColour(String c) {
		colour = c;
	}

	double setArea() {
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	double setPerimeter() {
		perimeter = Math.PI * radius * 2;
		return perimeter;
	}
}
