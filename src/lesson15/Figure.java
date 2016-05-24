package lesson15;

public class Figure implements Cloneable {

	String name;
	String colour;
	double area;
	double perimeter;
	float radius;
	double side;
	double sideA;
	double sideB;
	double sideC;

	Figure(String name, String colour, int radius, double side, double sideA, double sideB, int sideC) {
		this.name = name;
		this.colour = colour;
		if (radius != 0) {
			this.name = "Circle";
			this.radius = radius;
			setAreaCircle();
			setPerimeterCircle();
		} else if (side != 0) {
			this.name = "Square";
			this.side = side;
			setAreaSquare();
			setPerimeterSquare();
		} else if (sideA != 0 && sideB != 0 && sideC != 0) {
			this.name = "Treangle";
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
			setAreaTriangle();
			setPerimeterTriangle();
		}
	}

	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	void getInfoCircle() {
			System.out.println("Name: " + name + "; Colour: " + colour + ";");
			printPerimeterCircle();
			printAreaCircle();
			System.out.println("");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(perimeter);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Float.floatToIntBits(radius);
		temp = Double.doubleToLongBits(side);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sideA);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sideB);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sideC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figure other = (Figure) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(perimeter) != Double.doubleToLongBits(other.perimeter))
			return false;
		if (Float.floatToIntBits(radius) != Float.floatToIntBits(other.radius))
			return false;
		if (Double.doubleToLongBits(side) != Double.doubleToLongBits(other.side))
			return false;
		if (Double.doubleToLongBits(sideA) != Double.doubleToLongBits(other.sideA))
			return false;
		if (Double.doubleToLongBits(sideB) != Double.doubleToLongBits(other.sideB))
			return false;
		if (Double.doubleToLongBits(sideC) != Double.doubleToLongBits(other.sideC))
			return false;
		return true;
	}

	void printPerimeterCircle() {
		System.out.printf("Perimeter: " + "%.3f%n", perimeter);
		;
	}

	void printAreaCircle() {
		System.out.printf("Area: " + "%.3f%n", area);
	}

	void setAreaCircle() {
		area = Math.PI * Math.pow(radius, 2);
	}

	void setPerimeterCircle() {
		perimeter = Math.PI * radius * 2;
	}

	void getInfoSquare() {
			System.out.println("Name: " + name + "; Colour: " + colour + ";");
			printPerimeterCircle();
			printAreaCircle();
			System.out.println("");
	}

	void printPerimeterSquare() {
		System.out.printf("Perimeter: " + "%.3f%n", perimeter);
		;
	}

	void printAreaSquare() {
		System.out.printf("Area: " + "%.3f%n", area);
	}

	void setAreaSquare() {
		area = side * side;
	}

	void setPerimeterSquare() {
		perimeter = side + side + side + side;
	}

	void getInfoTriangle() {
			System.out.println("Name: " + name + "; Colour: " + colour);
			printPerimeterTriangle();
			printAreaTriangle();
			System.out.println("");

	}

	void printPerimeterTriangle() {
		System.out.printf("Perimeter: " + "%.3f%n", perimeter);
		;
	}

	void printAreaTriangle() {
		System.out.printf("Area: " + "%.3f%n", area);
	}

	void setAreaTriangle() {
		double p = (sideA + sideB + sideC) / 2;
		area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	}

	void setPerimeterTriangle() {
		perimeter = sideA + sideB + sideC;
	}
}
