package lesson7;

public class Triangle {
	String name = "Triangle";
	String colour = "";
	double area = 0;
	double perimeter = 0;
	double sideA = 0;
	double sideB = 0;
	double sideC = 0;

	void getInfo() {
		if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) {
			System.out.println("Name: " + name + "; Colour: " + colour);
			System.out.printf("Area: " + "%.3f%n",area);
			System.out.printf("Perimeter: " + "%.3f%n",perimeter);
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
	
	void setSides(double a, double b, double c) {
		sideA = a;
		sideB = b;
		sideC = c;
	}
	
	void setColour(String c) {
		colour = c;
	}

	double setArea() {
		double p = (sideA + sideB + sideC) / 2;
		area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
		return area;
	}

	double setPerimeter() {
		perimeter = sideA + sideB + sideC;
		return perimeter;
	}
}
