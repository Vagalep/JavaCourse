package lesson13;

public class Square extends Figure {

	private double side;

	Square(String colour, double side) {
		super(colour);
		this.side=side;
	}
	
	void getInfo() {
		super.getInfo();
		System.out.print("; Side: " + side);
		System.out.println();
	}

}
