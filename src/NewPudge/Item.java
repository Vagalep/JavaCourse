package NewPudge;

public class Item {

	private int intelligence;
	private int strenght;
	private int agility;
	private int helth;
	private String name;

	Item(int intelligence, int strenght, int agility, int helth, String name) {
		this.intelligence = intelligence;
		this.strenght = strenght;
		this.agility = agility;
		this.helth = helth;
		this.name = name;
	}

	int[] getItemParameters() {
		int[] stats = { intelligence, strenght, agility, helth };
		return stats;
	}

	String getItemName() {
		return name;
	}
}
