package Pudge;

public class Pudge {
	private int intelligence;
	private int strenght;
	private int agility;
	private int helth = 100;
	private boolean slot1 = false;
	private boolean slot2 = false;
	private String objName;
	BootsOfPower bop = new BootsOfPower();
	BootsOfSpeed bos = new BootsOfSpeed();

	Pudge(int intelligence, int strenght, int agility, String name) {
		this.intelligence = intelligence;
		this.strenght = strenght;
		this.agility = agility;
		this.objName = name;
		boolean end = true;
		while (end) {
			if (!slot1) {
				setStatsWitItem(bop.getItemIntelligence(), bop.getItemStrenght(), bop.getItemAgility());
				slot1 = true;
			} else if (!slot2) {
				setStatsWitItem(bos.getItemIntelligence(), bos.getItemStrenght(), bos.getItemAgility());
				slot2 = true;
			} else {
				end = false;
			}
		}
	}

	String getObjName() {
		return objName;
	}

	void setStatsWitItem(int i, int s, int a) {
		intelligence = intelligence + i;
		strenght = strenght + s;
		agility = agility + a;
	}

	int setStrike() {
		int strike = intelligence / 3 + agility / 2 + strenght;
		return strike;
	}

	void getHelth(int strike) {
		helth = helth - strike;
	}

	void getInfo() {
		System.out.print(Pudge.class.getSimpleName()+" "+getObjName() + " Helth: " + helth + "   ");

	}

	int setHelth() {
		return helth;
	}
}
