package lesson13;

public class Triangle extends Figure {

	double sideA = 0;
	double sideB = 0;
	double sideC = 0;

	Triangle(String colour, double sideA, double sideB, double sideC) {
		super(colour);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideB;
	}

	void getInfo() {
		super.getInfo();
		System.out.print("; SideA: " + sideA + "; SideB: " + sideB + "; SideC: " + sideC);
		System.out.println();
	}

}
