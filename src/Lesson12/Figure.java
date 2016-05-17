package Lesson12;

public class Figure {

	String name;
	String colour;
	double area;
	double perimeter;

	Figure(String name, String colour) {
		this.name = name;
		this.colour = colour;
	}

	void getInfo() {
		System.out.println("Name: " + name + "; Colour: " + colour + ";");
		printArea();
		printPerimeter();
	}

	void printArea() {
	}

	void printPerimeter() {
	}
}
