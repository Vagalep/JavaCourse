package lesson13;

public class Circle extends Figure {
	double radius;

	Circle(String colour, double radius) {
		super(colour);
		this.radius = radius;
	}

	void getInfo() {
		super.getInfo();
		System.out.print("; Radius: " + radius);
		System.out.println();
	}

}
