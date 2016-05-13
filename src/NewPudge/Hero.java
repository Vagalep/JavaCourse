package NewPudge;

public class Hero {
	private int intelligence;
	private int strenght;
	private int agility;
	private int helth = 100;
	private Item slots[] = new Item[3];
	private String heroName;
	int totalStats[] = { 0, 0, 0, 0 };
	boolean crit = false;
	private int damage;

	Hero(int intelligence, int strenght, int agility, String name, Item items[]) {
		this.intelligence = intelligence;
		this.strenght = strenght;
		this.agility = agility;
		this.heroName = name;
		for (int i = 0; i < items.length; i++) {
			this.slots[i] = items[i];
		}
	}

	int[] getBaseStats() {
		int[] BaseStats = { intelligence, strenght, agility, helth };
		return BaseStats;
	}

	void getStats() {
		int additionalStats[] = { 0, 0, 0, 0 };
		int baseStats[] = getBaseStats();

		for (int i = 0; i < slots.length; i++) {
			for (int j = 0; j < additionalStats.length; j++) {
				additionalStats[j] = additionalStats[j] + slots[i].getItemParameters()[j];
			}
		}
		for (int i = 0; i < totalStats.length; i++) {
			totalStats[i] = baseStats[i] + additionalStats[i];
		}
		System.out.println(heroName + " have " + totalStats[0] + " Intelligence " + totalStats[1] + " Strenght; "
				+ totalStats[2] + " Agility; " + totalStats[3] + " Helth");
	}

	void getStrikeInfo() {
		String stringHelth = damage + "";
		if (crit) {
			if(stringHelth.length()==1){
				System.out.print(" Character " + heroName + " Deals: " + damage + "(!)  ");				
			}else{
				System.out.print(" Character " + heroName + " Deals: " + damage + "(!)");
			}
			crit = false;
		} else {
			if(stringHelth.length()==1){
				System.out.print(" Character " + heroName + " Deals: " + damage + "    ");;				
			}else{
				System.out.print(" Character " + heroName + " Deals: " + damage + "     ");;
			}
		}
	}

	void getHelthInfo() {
		String stringHelth = helth + "";
		if (stringHelth.length() >= 3) {
			System.out.print(" Character " + heroName + " Helth: " + helth + "  ");
		} else if (stringHelth.length() >= 2) {
			System.out.print(" Character " + heroName + " Helth: " + helth + "   ");
		} else {
			System.out.print(" Character " + heroName + " Helth: " + helth + "    ");
		}
	}

	int getHelth() {
		return helth;
	}
	
	int getDamage() {
		return damage;
	}

	String getName() {
		return heroName;
	}

	void setStrike() {
		damage = totalStats[0] / 3 + totalStats[1] / 2 + totalStats[2];
		int randomCrit = 1 + (int) (Math.random() * ((3 - 1) + 1));
		switch (randomCrit) {
		case 1:
			damage = damage * 2;
			crit = true;
			break;
		default:
			break;
		}
	}

	void setHelth(int strike) {
		helth = helth - strike;
	}
}
