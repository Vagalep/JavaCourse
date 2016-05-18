package lesson13;

public class Figure {

	String name = this.getClass().getSimpleName();
	String colour;
	double area;
	double perimeter;

	Figure(String colour) {
		this.colour = colour;
	}

	void getInfo() {
		System.out.print("Name: " + name + "; Colour: " + colour);
	}

}
